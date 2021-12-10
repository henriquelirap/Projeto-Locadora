package jdbc;

import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {

    public static int enviado;

    public static void enviarEmail(String email) {

        Random random = new Random();
        enviado = random.nextInt(999999);

        final String username = "locadorapoo1@gmail.com";
        final String password = "locadora123";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("from@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(email)
            );
            message.setSubject("Recuperação de Senha - Código de Liberação");
            message.setText("Esse é seu código para cadastro de nova senha, nao compartilhe-o com ningúem! \n"
                    + enviado);

            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
