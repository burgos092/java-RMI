
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Interface {

    public Server() throws RemoteException {
        super(); 
    }

    public String sayHello() throws RemoteException {
        return "Hello world from the server!";
    }

    public static void main(String[] args) {
        try {
            Server server = new Server();
           
            System.out.println("Servidor RMI listo.");
        } catch (Exception e) {
            System.err.println("Error en el servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}