package com.demo.JavaEmailService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.JavaEmailService.service.EmailService;
@RestController
	public class EmailController {

	    private  EmailService emailService;

	    @Autowired
	    public EmailController(EmailService emailService) {
	        this.emailService = emailService;
	    }
	    @GetMapping("/send-email")
	    public String sendEmail() {
	        String recipientEmail = "chaitanyakumar663@gmail.com";
	        String emailSubject = "Hello";
	        String emailBody = "This is a test email from Spring Boot";

	        emailService.sendSimpleEmail(recipientEmail, emailSubject, emailBody);
	        return "Email sent successfully!";

	    }
}
