package com.demo.JavaEmailService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	private final JavaMailSender mailSender;

	@Autowired
	public EmailService(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void sendSimpleEmail(String recipientEmail, String emailSubject, String emailBody) {
	            SimpleMailMessage message = new SimpleMailMessage();
	            message.setTo(recipientEmail);
	            message.setSubject(emailSubject);
	            message.setText(emailBody);
	            mailSender.send(message); 
	}
}
