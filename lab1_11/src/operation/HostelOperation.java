package operation;

import java.util.List;
import types.Hostel;

/**
 *
 * @author Lactea Via
 */
public interface HostelOperation {
    List<Hostel> getListOfHostel();
    List<Hostel> addNewHostel(Hostel item);
    int getSumOfHostel();
}
