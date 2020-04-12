package operation;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import types.Hostel;

/**
 *
 * @author Lactea Via
 */
public interface HostelOperation extends Remote{
    List<Hostel> getListOfHostel()throws RemoteException;
    List<Hostel> addNewHostel(Hostel item)throws RemoteException;
    int getSumOfHostel()throws RemoteException;
}
