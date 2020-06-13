package operation;

import types.Service;

import java.util.ArrayList;
import java.util.List;

public class ServiceOperationImpl implements ServiceOperation{

    static List<Service> lstService = new ArrayList<Service>();

    static{
        lstService.add(new Service("Услуга 1","Хостел 2",11,500,"10 минут","Червеченко А.А."));
        lstService.add(new Service("Услуга 2","Хостел 1",23,700,"30 минут","Любовцева М.Г."));
        lstService.add(new Service("Услуга 3","Хостел 3",41,250,"5 минут","Михалкова Н.Я."));
    }

    @Override
    public List<Service> getListOfService() {
        return lstService;
    }

    @Override
    public List<Service> addNewService(Service service){
        lstService.add(service);
        return lstService;
    }
    @Override
    public List<Service> delService(int index)
    {
        lstService.remove(index);
        return lstService;
    }
    @Override
    public int getSumOfService(){
        int sum = 0;
        for(Service service: lstService)
            sum += service.getPrice();
        return sum;
    }
}
