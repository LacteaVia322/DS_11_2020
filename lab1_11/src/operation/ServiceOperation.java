package operation;

import java.util.List;
import types.Service;

/**
 *
 * @author Lactea Via
 */
public interface ServiceOperation {
    List<Service> getListOfService();
    List<Service> addNewService(Service item);
    int getSumOfService();
}
