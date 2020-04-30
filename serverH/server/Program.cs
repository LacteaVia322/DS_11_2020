using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using System.Runtime.Remoting;
using System.Runtime.Remoting.Channels;
using System.Runtime.Remoting.Channels.Tcp;

namespace serverH
{
    class Program
    {
        static void Main()
        {
            // Register channel
            TcpChannel channel = new TcpChannel(9000);
            ChannelServices.RegisterChannel(channel, false);
            HostelOperationImpl lstHostel = new HostelOperationImpl();
            lstHostel.addNewHostel(new Hostel("Хостел 1", 11, 2, 2000));
            lstHostel.addNewHostel(new Hostel("Хостел 2", 23, 3, 3000));
            lstHostel.addNewHostel(new Hostel("Хостел 3", 41, 1, 1000));

            ServiceOperationImpl lstService = new ServiceOperationImpl();
            lstService.addNewService(new Service("Услуга 1", "Хостел 2", 11, 500, "10 минут", "Червеченко А.А."));
            lstService.addNewService(new Service("Услуга 2", "Хостел 1", 23, 700, "30 минут", "Любовцева М.Г."));
            lstService.addNewService(new Service("Услуга 3", "Хостел 3", 41, 250, "5 минут", "Михалкова Н.Я."));
            // Register MyRemoteObject
            RemotingConfiguration.RegisterWellKnownServiceType(
               typeof(HostelOperationImpl),
               "TalkIsGood",
               WellKnownObjectMode.Singleton);
           RemotingConfiguration.RegisterWellKnownServiceType(
               typeof(ServiceOperationImpl),
               "Sevices",
               WellKnownObjectMode.Singleton);
            // Также можно зарегестрировать не тип, а неоходимый объект:
            //RemotingServices.Marshal(lstTovar, "TalkIsGood");
            //lstTovar – объект, который необходимо передать, "TalkIsGood" - параметр, который //используется клиентом для активизации объекта (унифицированный идентификатор ресурса)
            Console.WriteLine("Press enter to stop this process.");
            Console.ReadLine();
        }
    }
}

