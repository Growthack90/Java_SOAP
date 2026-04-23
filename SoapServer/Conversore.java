import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService(targetNamespace = "http://example.it/")
@SOAPBinding(style = SOAPBinding.Style.RPC) // Definisce lo stile del messaggio
public interface Conversore {
    @WebMethod
    double euroToDollaro(double euro);
}