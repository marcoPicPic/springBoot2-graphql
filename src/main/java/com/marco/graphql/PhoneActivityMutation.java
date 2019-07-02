package com.marco.graphql;

import com.marco.service.PhoneActivityService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PhoneActivityMutation implements GraphQLMutationResolver {

    @Autowired
    private PhoneActivityService phoneActivityService ;


}
