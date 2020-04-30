using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Runtime.Remoting.Channels;
using System.Runtime.Remoting.Channels.Tcp;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using serverH;

namespace client
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btn_booking_Click(object sender, EventArgs e)
        {
            Booking f = new Booking();
            f.Show();
        }

        private void btn_service_Click(object sender, EventArgs e)
        {
            Services f = new Services();
            f.Show();
        }
      //  HostelOperation hostelOperation = null;
        //ServiceOperation serviceOperation = null;
        private void Form1_Load(object sender, EventArgs e)
        {
          /*  try
            {
                TcpClientChannel chan = new TcpClientChannel();
                ChannelServices.RegisterChannel(chan, false);
                hostelOperation = (HostelOperation)Activator.GetObject(
                typeof(HostelOperation), "tcp://127.0.0.1:9000/TalkIsGood");
                serviceOperation = (ServiceOperation)Activator.GetObject(
                typeof(ServiceOperation), "tcp://127.0.0.1:9000/TalkIsGood");

            }
            catch (Exception ex)
            {
                MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }*/
        }
    }
}
