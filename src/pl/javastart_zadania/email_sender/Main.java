package pl.javastart_zadania.email_sender;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Main {


    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.wp.pl");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("korwin-bieniek@wp.pl", "/////"));
        email.setSSLOnConnect(true);
        email.setFrom("korwin-bieniek@wp.pl");
        email.setSubject("Hello from IntelliJ");
        email.setMsg("Hello, im programming");
        email.addTo("korwin-bieniek@wp.pl");
        System.out.println("Sending a message");
        email.send();
        System.out.println("Messages was sent");
    }
}
