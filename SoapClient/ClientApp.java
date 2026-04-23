import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import java.net.URI;
import java.net.URL;

public class ClientApp {

    public static void main(String[] args) throws Exception {        
        // L'URL dove il WSDL è pubblicato
        URL url = new URI("http://localhost:8080/conversore?wsdl").toURL();

        // Parametri per identificare il servizio nel WSDL
        QName qname = new QName("http://example.it/", "ConversoreImplService");

        // Creiamo la connessione al servizio
        Service service = Service.create(url, qname);
        
        // Estraiamo l'interfaccia (il Proxy)
        Conversore conversore = service.getPort(Conversore.class);

        // Chiamata al metodo come se fosse una funzione locale
        double risultato = conversore.euroToDollaro(100.0);
        
        System.out.println("100 Euro equivalgono a: " + risultato + " Dollari");
    }
}