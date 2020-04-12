package registration;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import operation.HostelOperationImpl;
import operation.ServiceOperationImpl;

public class RunServer {

    public static void main(String[] argv) {
        try {
            // создание экземпляров классов для регистр
            HostelOperationImpl HoperationImpl = new HostelOperationImpl();
            ServiceOperationImpl SoperationImpl = new ServiceOperationImpl();

            // создаём реестр
            Registry registry = LocateRegistry.createRegistry(1199);
          
            // регистрация классов
            registry.bind("rmiTest", HoperationImpl);
            registry.bind("rmiTest1", SoperationImpl);

            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.out.println("Server failed: " + e);
        }
    }
}
