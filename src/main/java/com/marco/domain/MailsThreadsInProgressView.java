package com.marco.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "mails_threads_in_progress_view")
public class MailsThreadsInProgressView {

    @Id
    @Column(name = "mail_id")
    private int mailId;

    @Column(name = "date_mail")
    private LocalDateTime dateMail;

    @Column(name = "email")
    private String email;

    @Column(name = "subject")
    private String subject;

    @Column(name = "thread_to_process")
    private int threadToProcess;

    @Column(name = "queue_id")
    private int queueId;

    @Column(name = "tenant_id")
    private int tenantId;

    public MailsThreadsInProgressView() {
    }


    public MailsThreadsInProgressView(int mailId, LocalDateTime dateMail, String email, String subject, int threadToProcess, int queueId, int tenantId) {
        this.mailId = mailId;
        this.dateMail = dateMail;
        this.email = email;
        this.subject = subject;
        this.threadToProcess = threadToProcess;
        this.queueId = queueId;
        this.tenantId = tenantId;
    }

    public int getMailId() {
        return mailId;
    }

    public void setMailId(int mailId) {
        this.mailId = mailId;
    }

    public LocalDateTime getDateMail() {
        return dateMail;
    }

    public void setDateMail(LocalDateTime dateMail) {
        this.dateMail = dateMail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getThreadToProcess() {
        return threadToProcess;
    }

    public void setThreadToProcess(int threadToProcess) {
        this.threadToProcess = threadToProcess;
    }

    public int getQueueId() {
        return queueId;
    }

    public void setQueueId(int queueId) {
        this.queueId = queueId;
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }
}
