package ALMACEN_PRINCIPAL;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author Joshua
 */
public class JavaMail 
{   
    public String[] destinatarios;
    
    void enviar(String correoEnvia, String mensaje, String rutaArchivo, String nombreArchivo, String correoRecibe, String asunto, String claveEnvia)
    {   Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", correoEnvia);//Correo=logisticaccmpp@gmail.com
            props.setProperty("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(props, null);
        BodyPart texto = new MimeBodyPart();
        try
        {   texto.setText(mensaje);
            texto.setContent( mensaje , "text/html");
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(
                new DataHandler(new FileDataSource(rutaArchivo)));
            adjunto.setFileName(nombreArchivo);
            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto);
            multiParte.addBodyPart(adjunto);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoEnvia));
            
            Address[] addresses = new Address[destinatarios.length];//Aqui usamos el arreglo de destinatarios
            for(int i=0;i<addresses.length;i++){
                addresses[i]=new InternetAddress(destinatarios[i]);
            }  
            message.addRecipients(Message.RecipientType.TO, addresses);
            
            message.setSubject(asunto);
            message.setContent(multiParte);
            Transport t = session.getTransport("smtp");
            t.connect(correoEnvia, claveEnvia);
            t.sendMessage(message, message.getAllRecipients());
            t.close();
            JOptionPane.showMessageDialog(null, "Correo Enviado");
        }
        catch(MessagingException me){   JOptionPane.showMessageDialog(null, "Error Debido a: "+me.toString());}
    }
    
    void setTamañoDestinatarios(int tamaño)
    {   destinatarios=new String[tamaño];
    }
}
