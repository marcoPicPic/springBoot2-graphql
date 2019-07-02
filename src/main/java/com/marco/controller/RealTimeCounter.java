package com.marco.controller;

import com.marco.service.RealtimeCountersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.marco.config.ElasticConstant.REALTIME_COUNTER_PATH;
import static com.marco.config.ElasticConstant.getElasticSearchPath;

@RestController
public class RealTimeCounter {

    @Autowired
    RealtimeCountersService realtimeCountersService;


    @GetMapping("/real-time-counter/tenant-uuid/{tenantUuid}/tenant-id/{tenantId}/counter-name/{counterName}")
    public com.marco.domain.RealTimeCounter realtimeCounterByTenantAndCounterName(
            String tenantUuid,
            int tenantId,
            String counterName) {
        return realtimeCountersService.realTimeCounterByTenantAndCounterName(
                getElasticSearchPath(REALTIME_COUNTER_PATH, tenantUuid, tenantId),
                counterName);

    }


}
