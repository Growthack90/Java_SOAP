import jakarta.xml.ws.Endpoint;

public class ServerApp {
    public static void main(String[] args) {
        String url = "http://localhost:8080/conversore";
        System.out.println("Server in ascolto su: " + url);
        
        // Pubblica il servizio
        Endpoint.publish(url, new ConversoreImpl());
    }
}