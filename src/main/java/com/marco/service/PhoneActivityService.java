package com.marco.service;

import com.marco.domain.PhoneActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;

@Service
public class PhoneActivityService {

    @Autowired
    private ElasticsearchOperations jestElasticsearchTemplate;

    public List<PhoneActivity> getPhoneActivityByIndex(String indexName, int page, int size) {
        //Query
        SearchQuery searchQuery = new NativeSearchQueryBuilder().
                withQuery(matchAllQuery()).
                withIndices(indexName).
                withPageable(new PageRequest(page, size)).build();

        //Result
        List<PhoneActivity> evmEventBackupESList = jestElasticsearchTemplate.queryForList(
                searchQuery,
                PhoneActivity.class);

        return evmEventBackupESList;
    }

}
