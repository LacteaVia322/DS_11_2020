package operation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import types.Service;

/**
 *
 * @author Lactea Via
 */
public class ServiceOperationImpl extends UnicastRemoteObject implements ServiceOperation{
    static List<Service> lstService = new ArrayList<Service>();
    static{
        lstService.add(new Service("Услуга 1","Хостел 2",11,500,"10 минут","Червеченко А.А."));
        lstService.add(new Service("Услуга 2","Хостел 1",23,700,"30 минут","Любовцева М.Г."));
        lstService.add(new Service("Услуга 3","Хостел 3",41,250,"5 минут","Михалкова Н.Я."));
    }
    public ServiceOperationImpl() throws RemoteException{
   }
    @Override
    public List<Service> getListOfService() throws RemoteException{
        return lstService;
    }
    @Override
    public List<Service> addNewService(Service item) throws RemoteException{
        lstService.add(item);
        return lstService;
    }
    @Override
    public int getSumOfService() throws RemoteException{
        int sum=0;
        for(Service service: lstService)
            sum+=service.getPrice();
        return sum;
    }
}
