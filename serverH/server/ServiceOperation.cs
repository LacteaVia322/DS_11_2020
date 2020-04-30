using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace serverH
{
    public interface ServiceOperation
    {
        List<Service> getListOfService();
        List<Service> addNewService(Service item);
        List<Service> delService(int index);
        int getSumOfService();

    }
}
