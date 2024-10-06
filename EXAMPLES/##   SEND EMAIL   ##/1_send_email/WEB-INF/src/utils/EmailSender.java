package utils;

import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.Message;
import javax.mail.Message.RecipientType;

import java.util.Properties;

import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;

public class EmailSender{
	public static void sendEmail(String toEmail,String message){
		Properties props = new Properties();

		props.put("mail.transport.protocol","smtp");
		props.put("mail.smtp.auth","true");
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.host","smtp.gmail.com");
		props.put("mail.smtp.port","587");

		Session session = Session.getInstance(props,new EmailAuthenticator());

		MimeMessage mmsg = new MimeMessage(session);

		try{
			mmsg.setFrom(new InternetAddress("isrdc.ingole@gmail.com"));
			mmsg.setRecipients(Message.RecipientType.TO,toEmail);
			mmsg.setSubject("Welcome to ISRDC Jabalpur");
			mmsg.setText(message);

			Transport.send(mmsg);
		}catch(MessagingException e){
			e.printStackTrace();
		}
	}
}

class EmailAuthenticator extends Authenticator{
	public PasswordAuthentication getPasswordAuthentication(){
		return new PasswordAuthentication("isrdc.ingole@gmail.com","Anoop_13#");		
	}
}