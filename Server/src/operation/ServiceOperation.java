package operation;

import types.Service;

import java.util.List;

public interface ServiceOperation {
    List<Service> getListOfService();
    List<Service> addNewService(Service service);
    List<Service> delService(int index);
    int getSumOfService();
}
