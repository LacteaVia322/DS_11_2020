/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.ArrayList;
import java.util.List;
import types.Hostel;

/**
 *
 * @author Lactea Via
 */
public class HostelOperationImpl implements HostelOperation{
    static List<Hostel> lstHostes = new ArrayList<Hostel>();
    static{
        lstHostes.add(new Hostel("Хостел 1",11,2,2000));
        lstHostes.add(new Hostel("Хостел 2",23,3,3000));
        lstHostes.add(new Hostel("Хостел 3",41,1,1000));
    }
    @Override
    public List<Hostel> getListOfHostel(){
        return lstHostes;
    }
    @Override
    public List<Hostel> addNewHostel(Hostel item){
        lstHostes.add(item);
        return lstHostes;
    }
    @Override
    public int getSumOfHostel(){
        int sum=0;
        for(Hostel hostel: lstHostes)
            sum+=hostel.getPrice();
        return sum;
    }
}
