package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmailOtp;
import com.example.demo.repository.EmailOtpRepository;

@Service
public class EmailService {

	@Autowired
	private EmailOtpRepository emailOtpRepository;
	
	
	public String addEmailOtp(EmailOtp emailOtp) {
		EmailOtp emailotp = emailOtpRepository.save(emailOtp);
		 if(emailotp != null) {
			 return "EmailOtp saved succesfully";
		 }
		 return "Something went wrong";
	}
	
	public List<EmailOtp> getEmailOtpByEmail(String email) {
		List<EmailOtp> emailOtp = emailOtpRepository.findByEmail(email);
		return emailOtp;
	}
	
	
	
}
