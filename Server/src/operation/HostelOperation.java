package operation;

import types.Hostel;

import java.util.List;

public interface HostelOperation {
    List<Hostel> getListOfHostel();
    List<Hostel> addNewHostel(Hostel hostel);
    List<Hostel> delHostel(int index);
    int getSumOfHostel();
}
