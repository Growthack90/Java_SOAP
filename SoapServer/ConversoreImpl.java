import jakarta.jws.WebService;

@WebService(endpointInterface = "Conversore", targetNamespace = "http://example.it/")
public class ConversoreImpl implements Conversore {
    @Override
    public double euroToDollaro(double euro) {
        return euro * 1.09; // Tasso di cambio fittizio
    }
}