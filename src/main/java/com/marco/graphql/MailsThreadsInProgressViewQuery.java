package com.marco.graphql;

import com.marco.domain.MailsThreadsInProgressView;
import com.marco.repository.MailsThreadsInProgressViewRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MailsThreadsInProgressViewQuery implements GraphQLQueryResolver {

    @Autowired
    MailsThreadsInProgressViewRepository mailsThreadsInProgressViewRepository;

   public List<MailsThreadsInProgressView> mailsThreadsInProgress() {

        return mailsThreadsInProgressViewRepository.findAll();
    }


}
