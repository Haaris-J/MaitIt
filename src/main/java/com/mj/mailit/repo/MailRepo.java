package com.mj.mailit.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mj.mailit.model.Mail;

public interface MailRepo extends MongoRepository<Mail, String> {
	
	Mail findByStatus(String status);

}
