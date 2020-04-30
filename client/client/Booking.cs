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
    public partial class Booking : Form
    {
        public Booking()
        {
            InitializeComponent();
        }
        HostelOperation hostelOperation = null;
        TcpClientChannel chan = new TcpClientChannel();
        private void Booking_Load(object sender, EventArgs e)
        {
            try
            {
                ChannelServices.RegisterChannel(chan, false);
                hostelOperation = (HostelOperation)Activator.GetObject(
                typeof(HostelOperation), "tcp://localhost:9000/TalkIsGood");
                doVivod(hostelOperation.getListOfHostel());
            }
            catch (Exception ex)
            {
                MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }
        private void doVivod(List<serverH.Hostel> lstHostel)
        {
            lvList.Items.Clear();
            int i = 1;
            foreach (serverH.Hostel hostel in lstHostel)
            {
                ListViewItem newItem = new ListViewItem(i.ToString());
                newItem.SubItems.Add(hostel.getName());
                newItem.SubItems.Add(hostel.getNumber().ToString());
                newItem.SubItems.Add(hostel.getKol().ToString());
                newItem.SubItems.Add((hostel.getPrice()).ToString());
                lvList.Items.Add(newItem);
                i++;
            }
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Close();
            ChannelServices.UnregisterChannel(chan);
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            try
            {
                doVivod(hostelOperation.getListOfHostel());
            }
            catch (Exception ex)
            {
                MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }

        }

        private void btnDel_Click(object sender, EventArgs e)
        {
            if (lvList.SelectedIndices.Count < 1)
            {
                MessageBox.Show(this, "Выберите элемент для удаления!", "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }
            else
            {
                try
                {
                    hostelOperation.delHostel(lvList.SelectedIndices[0]);
                    doVivod(hostelOperation.getListOfHostel());
                    if (txt.Text != "") btnDecide_Click(sender, e);
                }
                catch (Exception ex)
                {
                    MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }

            }
        }

        private void btnDecide_Click(object sender, EventArgs e)
        {
            try
            {
                txt.Text = hostelOperation.getSumOfHostel().ToString();
            }
            catch (Exception ex)
            {
                MessageBox.Show(this, "Ошибка: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }

        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            AddBooking f = new AddBooking();
            f.ShowDialog();
            if (f.getHostel != null)
            {
                try
                {
                    doVivod(hostelOperation.addNewHostel(f.getHostel));
                }
                catch (Exception ex)
                {
                    MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
            if (txt.Text != "") btnDecide_Click(sender, e);
        }
    }
}
