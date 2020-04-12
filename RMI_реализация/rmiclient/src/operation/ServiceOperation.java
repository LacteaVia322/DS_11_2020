package operation;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import types.Service;

/**
 *
 * @author Lactea Via
 */
public interface ServiceOperation extends Remote{
    List<Service> getListOfService()throws RemoteException;
    List<Service> addNewService(Service item)throws RemoteException;
    int getSumOfService()throws RemoteException;
}
