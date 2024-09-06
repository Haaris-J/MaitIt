package com.mj.mailit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mj.mailit.model.Mail;
import com.mj.mailit.repo.MailRepo;

@RestController
public class MailController {
	
	@Autowired
	MailRepo repoObj;
	
	@GetMapping("/inbox")
	List<Mail> getInbox(){
		return repoObj.findAll();
	}
	
	@PostMapping("/sendmail")
	public Mail postMethodName(@RequestBody Mail mail) {
		
		return repoObj.save(mail);
	}
	

}
