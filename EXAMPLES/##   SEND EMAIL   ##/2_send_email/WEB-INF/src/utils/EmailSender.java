package utils;

import java.util.Properties;

import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.MessagingException;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;

import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;

public class EmailSender{
	static String generalMessage = "<h1>Hello!! ppp</h1>"+ 
									"<hr />"+
									"<div style='border:1px solid green;padding:10px 20px;margin:20px auto;background-color:#eafecf;color:#006633'>ppp</div>";


	public static void sendEmail(String name,String to,String subject,String message){
		Properties props = new Properties();

		props.put("mail.transport.protocol","smtp");
		props.put("mail.smtp.auth","true");
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.host","smtp.gmail.com");
		props.put("mail.smtp.port","587");

		Session session = Session.getInstance(props,new EmailAuthenticator());

		MimeMessage mm = new MimeMessage(session);

		try{
			mm.setFrom(new InternetAddress("isrdc.ingole@gmail.com"));
			mm.setRecipients(Message.RecipientType.TO,to);
			mm.setSubject(subject);
			//mm.setText(message);

			String[] arr = generalMessage.split("ppp");
			generalMessage = arr[0]+name+arr[1]+message+arr[2];
			mm.setContent(generalMessage,"text/html");

			Transport.send(mm);
		}catch(MessagingException e){
			e.printStackTrace();
		}
	}
}

class EmailAuthenticator extends Authenticator{
	public PasswordAuthentication getPasswordAuthentication(){
		return new PasswordAuthentication("isrdc.ingole@gmail.com","Anoop_13_");	
	}
}