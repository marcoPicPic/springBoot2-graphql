package com.marco.service;

import com.marco.config.ElasticConstant;
import com.marco.domain.RealTimeCounter;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.marco.config.ElasticConstant.REALTIME_COUNTER_PATH;
import static com.marco.config.ElasticConstant.getElasticSearchPathExampleForTheTest;
import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;

@Service
public class RealtimeCountersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RealtimeCountersService.class);
    @Autowired
    private ElasticsearchOperations elasticsearchTemplate;

    private static final int LIMIT = 100;

    public List<RealTimeCounter> getRealTimeCounterByIndex(String indexName, int page, int size) {
        //Query
        SearchQuery searchQuery = new NativeSearchQueryBuilder().
                withQuery(matchAllQuery()).
                withIndices(indexName).
                withPageable(PageRequest.of(page, size)).build();

        //Result
        return elasticsearchTemplate.queryForList(
                searchQuery,
                RealTimeCounter.class);
    }

    public List<RealTimeCounter> getAllRealTimeCounter() {
        //Query
        SearchQuery searchQuery = new NativeSearchQueryBuilder().
                withQuery(matchAllQuery()).
                withIndices(getElasticSearchPathExampleForTheTest(REALTIME_COUNTER_PATH)).
                withSort(new FieldSortBuilder(ElasticConstant.DATE_STAT).order(SortOrder.DESC)).
                withPageable(PageRequest.of(0, LIMIT)).build();


        //Result
        return elasticsearchTemplate.queryForList(
                searchQuery,
                RealTimeCounter.class);
    }

    public RealTimeCounter realTimeCounterByTenantAndCounterName(String indexName, String counterName) {

        BoolQueryBuilder filter = new BoolQueryBuilder();

        // Client space
        filter.must(QueryBuilders.termQuery("counter_code", counterName));
        LOGGER.debug("Elastic search query : {}" , filter);
        //Query
        SearchQuery query = new NativeSearchQueryBuilder()
                .withQuery(matchAllQuery())
                .withFilter(filter).withIndices(indexName)
                .withSort(new FieldSortBuilder(ElasticConstant.DATE_STAT).order(SortOrder.DESC))
                .withPageable(PageRequest.of(0, LIMIT))
                .build();

        //Result
        Page<RealTimeCounter> realtimeCounters = elasticsearchTemplate.queryForPage(
                query,
                RealTimeCounter.class);

        RealTimeCounter realtimeCounter = new RealTimeCounter();
        if (!realtimeCounters.isEmpty())
            realtimeCounter = realtimeCounters.getContent().get(0);

        return realtimeCounter;

    }
}
