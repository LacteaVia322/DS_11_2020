/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.ArrayList;
import java.util.List;
import types.Service;

/**
 *
 * @author Lactea Via
 */
public class ServiceOperationImpl implements ServiceOperation{
    static List<Service> lstService = new ArrayList<Service>();
    static{
        lstService.add(new Service("Услуга 1","",11,2,"",""));
        lstService.add(new Service("Услуга 2","",23,2,"",""));
        lstService.add(new Service("Услуга 3","",41,2,"",""));
    }
    @Override
    public List<Service> getListOfService(){
        return lstService;
    }
    @Override
    public List<Service> addNewService(Service item){
        lstService.add(item);
        return lstService;
    }
    @Override
    public int getSumOfService(){
        int sum=0;
        for(Service service: lstService)
            sum+=service.getPrice();
        return sum;
    }
}
