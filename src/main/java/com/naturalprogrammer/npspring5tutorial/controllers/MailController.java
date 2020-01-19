package com.naturalprogrammer.npspring5tutorial.controllers;

import javax.mail.MessagingException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naturalprogrammer.npspring5tutorial.mail.MailSender;

@RestController
public class MailController {

	private MailSender mailSender;

	public MailController(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	@RequestMapping("/mail")
	public String mail() throws MessagingException {

		mailSender.send("sonnesen@gmail.com", "A test mail", "Body of the test mail");
		return "Mail sent";
	}
}
