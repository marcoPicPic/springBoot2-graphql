package com.marco.repository;

import com.marco.domain.MailsThreadsInProgressView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MailsThreadsInProgressViewRepository extends JpaRepository<MailsThreadsInProgressView, Integer>{

    @Transactional(readOnly = true)
    List<MailsThreadsInProgressView> findAll();
}
