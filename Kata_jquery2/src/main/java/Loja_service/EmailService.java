package Loja_service;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailService {

    private final String username = "SEU_USUARIO_MAILTRAP";
    private final String password = "SUA_SENHA_MAILTRAP";

    public void enviarCodigo(String destinatario, String codigo) {
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "sandbox.smtp.mailtrap.io");
        prop.put("mail.smtp.port", "2525");

        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("seguranca@sualoja.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            message.setSubject("Seu codigo de acesso: " + codigo);

            String htmlCode = "<h1> token: <span style='color:blue'>" + codigo + "</span></h1>";
            message.setContent(htmlCode, "text/html");

            Transport.send(message);
            System.out.println("Email enviado para: " + destinatario);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}