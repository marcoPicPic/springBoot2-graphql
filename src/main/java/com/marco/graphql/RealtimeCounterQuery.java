package com.marco.graphql;

import com.marco.domain.RealTimeCounter;
import com.marco.service.RealtimeCountersService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.marco.config.ElasticConstant.REALTIME_COUNTER_PATH;
import static com.marco.config.ElasticConstant.getElasticSearchPath;

@Component
public class RealtimeCounterQuery implements GraphQLQueryResolver {

    @Autowired
    RealtimeCountersService realtimeCountersService;

    public List<RealTimeCounter> getRealtimeCounters(
            String tenantUuid,
            int tenantId,
            int page,
            int size) {

        return realtimeCountersService.getRealTimeCounterByIndex(
                getElasticSearchPath(REALTIME_COUNTER_PATH, tenantUuid, tenantId),
                page,
                size);
    }

    public RealTimeCounter realtimeCounterByTenantAndCounterName(
            String tenantUuid,
            int tenantId,
            String counterName) {

        return realtimeCountersService.realTimeCounterByTenantAndCounterName(
                getElasticSearchPath(REALTIME_COUNTER_PATH, tenantUuid, tenantId),
                counterName);

    }

    public List<RealTimeCounter> listRealTimeCounter() {
        return realtimeCountersService.getAllRealTimeCounter();
    }

}
