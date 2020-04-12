package operation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import types.Hostel;

/**
 *
 * @author Lactea Via
 */
public class HostelOperationImpl extends UnicastRemoteObject implements HostelOperation{
    static List<Hostel> lstHostes = new ArrayList<Hostel>();
    static{
        lstHostes.add(new Hostel("Хостел 1",11,2,2000));
        lstHostes.add(new Hostel("Хостел 2",23,3,3000));
        lstHostes.add(new Hostel("Хостел 3",41,1,1000));
    }
    public HostelOperationImpl() throws RemoteException{
   }
    @Override
    public List<Hostel> getListOfHostel() throws RemoteException{
        return lstHostes;
    }
    @Override
    public List<Hostel> addNewHostel(Hostel item) throws RemoteException{
        lstHostes.add(item);
        return lstHostes;
    }
    @Override
    public int getSumOfHostel()throws RemoteException{
        int sum=0;
        for(Hostel hostel: lstHostes)
            sum+=hostel.getPrice();
        return sum;
    }
}
