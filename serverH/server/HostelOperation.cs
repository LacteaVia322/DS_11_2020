using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace serverH
{
    public interface HostelOperation
    {
        List<Hostel> getListOfHostel();
        List<Hostel> addNewHostel(Hostel item);
        List<Hostel> delHostel(int index);
        int getSumOfHostel();
    }
}
