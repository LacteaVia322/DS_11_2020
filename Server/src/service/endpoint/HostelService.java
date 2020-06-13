package service.endpoint;

import operation.HostelOperationImpl;
import types.Hostel;
import types.ListOfHostel;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService()
public class HostelService {

    static HostelOperationImpl obj = new HostelOperationImpl();

    @WebMethod()
    public ListOfHostel getAllHostel(){
        ListOfHostel lstRet = null;

        List<Hostel> lst = obj.getListOfHostel();
        if(lst != null){
            lstRet = new ListOfHostel();
            lstRet.setItem(lst);
        }
        return lstRet;
    }

    @WebMethod()
    public ListOfHostel setNewHostel(Hostel hostel){
        ListOfHostel lstRet = null;

        List<Hostel> lst = obj.addNewHostel(hostel);
        if(lst != null){
            lstRet = new ListOfHostel();
            lstRet.setItem(lst);
        }
        return lstRet;
    }
    @WebMethod()
    public ListOfHostel setDelHostel(int index)
    { ListOfHostel lstRet = null;

        List<Hostel> lst = obj.delHostel(index);
        if(lst != null) {
            lstRet = new ListOfHostel();
            lstRet.setItem(lst);
        }
        return lstRet;
    }

    @WebMethod()
    public int getSumOfHostel(){
        return obj.getSumOfHostel();
    }
}
