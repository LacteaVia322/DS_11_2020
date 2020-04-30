using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace serverH
{
   class ServiceOperationImpl: MarshalByRefObject, ServiceOperation
    {
        public static List<Service> lstService = new List<Service>();

        public List<Service> getListOfService()
        {
            return lstService;
        }

        public List<Service> addNewService(Service item)
        {
            lstService.Add(item);
            return lstService;
        }
        public List<Service> delService(int index)
        {
            lstService.RemoveAt(index);
            return lstService;
        }
        public int getSumOfService()
        {
            int sum = 0;
            foreach (Service service in lstService)
                sum += service.getPrice();
            return sum;
        }
    }
}
