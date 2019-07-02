package com.marco.graphql;

import com.marco.domain.PhoneActivity;
import com.marco.service.PhoneActivityService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.marco.config.ElasticConstant.PHONE_ACTIVITY_PATH;
import static com.marco.config.ElasticConstant.getElasticSearchPath;

@Component
public class PhoneActivityQuery implements GraphQLQueryResolver {

    @Autowired
    private PhoneActivityService phoneActivityService;


    public List<PhoneActivity> phoneActivities(
            String tenantUuid,
            int tenantId,
            int page,
            int size) {

        return phoneActivityService.getPhoneActivityByIndex(
                getElasticSearchPath(PHONE_ACTIVITY_PATH, tenantUuid, tenantId),
                page,
                size);
    }

}
