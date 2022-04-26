package com.example.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

import com.example.cursomc.domain.Cliente;
import com.example.cursomc.domain.Pedido;

public class MockEmailService extends AbstractEmailService{
	
	private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);
	
	@Override
	public void sendEmail(SimpleMailMessage msg) {
		System.out.println("Aqui");
		LOG.info("Simulando envio de email...");
		LOG.info(msg.toString());
		LOG.info("Email enviado");
	}

	@Override
	public void sendOrderConfirmationHtmlEmail(Pedido obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendHtmlEmail(MimeMessage msg) {
		LOG.info("Simulando envio de email HTML...");
		LOG.info(msg.toString());
		LOG.info("Email enviado");
		
		
	}

	@Override
	public void sendNewPasswordEmail(Cliente cliente, String newPass) {
		System.out.println(cliente.getEmail() +" " + newPass);
		

		
	}
	
}
