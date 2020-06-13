package service.endpoint;

import operation.ServiceOperationImpl;
import types.*;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService()
public class ServiceService {

    static ServiceOperationImpl obj = new ServiceOperationImpl();

    @WebMethod()
    public ListOfService getAllService(){
        ListOfService lstRet = null;

        List<Service> lst = obj.getListOfService();
        if(lst != null){
            lstRet = new ListOfService();
            lstRet.setItem(lst);
        }
        return lstRet;
    }

    @WebMethod()
    public ListOfService setNewService(Service service){
        ListOfService lstRet = null;

        List<Service> lst = obj.addNewService(service);
        if(lst != null){
            lstRet = new ListOfService();
            lstRet.setItem(lst);
        }
        return lstRet;
    }
    @WebMethod()
    public ListOfService setDelService(int index)
    { ListOfService lstRet = null;

        List<Service> lst = obj.delService(index);
        if(lst != null) {
            lstRet = new ListOfService();
            lstRet.setItem(lst);
        }
        return lstRet;
    }
    @WebMethod()
    public int getSumOfService(){
        return obj.getSumOfService();
    }
}
