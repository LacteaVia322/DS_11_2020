using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace serverH
{
    class HostelOperationImpl:MarshalByRefObject, HostelOperation
    {
        public static List<Hostel> lstHostel = new List<Hostel>();

        public List<Hostel> getListOfHostel()
        {
            return lstHostel;
        }

        public List<Hostel> addNewHostel(Hostel item)
        {
            lstHostel.Add(item);
            return lstHostel;
        }
        public List<Hostel> delHostel(int index)
        {
            lstHostel.RemoveAt(index);
            return lstHostel;
        }
        public int getSumOfHostel()
        {
            int sum = 0;
            foreach (Hostel hostel in lstHostel)
                sum += hostel.getPrice();
            return sum;
        }
    }
}
