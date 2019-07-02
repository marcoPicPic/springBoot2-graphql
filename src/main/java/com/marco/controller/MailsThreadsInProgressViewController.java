package com.marco.controller;

import com.marco.domain.MailsThreadsInProgressView;
import com.marco.repository.MailsThreadsInProgressViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MailsThreadsInProgressViewController {

    @Autowired
    MailsThreadsInProgressViewRepository mailsThreadsInProgressViewRepository;


    @GetMapping("/mails-threads-in-progress-view/find-all")
    public List<MailsThreadsInProgressView> findAll(){

        List<MailsThreadsInProgressView> mailsThreadsInProgressViews = mailsThreadsInProgressViewRepository.findAll();

        return mailsThreadsInProgressViews;
    }
}
