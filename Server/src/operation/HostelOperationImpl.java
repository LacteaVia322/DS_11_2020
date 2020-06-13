package operation;

import types.Hostel;

import java.util.ArrayList;
import java.util.List;

public class HostelOperationImpl implements HostelOperation{
    static List<Hostel> lstHostes = new ArrayList<Hostel>();

    static{
        lstHostes.add(new Hostel("Хостел 1",11,2,2000));
        lstHostes.add(new Hostel("Хостел 2",23,3,3000));
        lstHostes.add(new Hostel("Хостел 3",41,1,1000));
    }

    @Override
    public List<Hostel> getListOfHostel() {
        return lstHostes;
    }

    @Override
    public List<Hostel> addNewHostel(Hostel hostel){
        lstHostes.add(hostel);
        return lstHostes;
    }
    @Override
    public List<Hostel> delHostel(int index)
    {
        lstHostes.remove(index);
        return lstHostes;
    }

    @Override
    public int getSumOfHostel(){

        int sum = 0;
        for(Hostel hostel: lstHostes)
            sum += hostel.getPrice();
        return sum;
    }
}
