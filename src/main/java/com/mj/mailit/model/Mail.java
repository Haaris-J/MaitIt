package com.mj.mailit.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class Mail {
	
	@Id
	String userId;
	ArrayList<String> recepients;
	ArrayList<String> cc;
	String subject;
	String content;
	String status;
	ArrayList<String> userStatus;
	
	@Override
	public String toString() {
		return "Mail [userId=" + userId + ", recepients=" + recepients + ", cc=" + cc + ", subject=" + subject
				+ ", content=" + content + ", status=" + status + ", userStatus=" + userStatus + "]";
	}

	Mail(){
		
	}

	public Mail(String userId, ArrayList<String> recepients, ArrayList<String> cc, String subject, String content,
			String status, ArrayList<String> userStatus) {
		super();
		this.userId = userId;
		this.recepients = recepients;
		this.cc = cc;
		this.subject = subject;
		this.content = content;
		this.status = status;
		this.userStatus = userStatus;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public ArrayList<String> getRecepients() {
		return recepients;
	}

	public void setRecepients(ArrayList<String> recepients) {
		this.recepients = recepients;
	}

	public ArrayList<String> getCc() {
		return cc;
	}

	public void setCc(ArrayList<String> cc) {
		this.cc = cc;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<String> getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(ArrayList<String> userStatus) {
		this.userStatus = userStatus;
	}
	

}
