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

namespace client
{
    public partial class Booking : Form
    {
        public Booking()
        {
            InitializeComponent();
        }

        HostelReference.HostelServiceClient hostel = new HostelReference.HostelServiceClient();
        HostelReference.hostel[] arrHostel;

        private void Booking_Load(object sender, EventArgs e)
        { 
            try
              {
                doVivod();
            }           
              catch (Exception ex)
              {
                  MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
              }           
        }
    public void doVivod()
    {
        arrHostel = hostel.getAllHostel();
        dataGridView1.Rows.Clear();
        foreach (HostelReference.hostel el in arrHostel)
        {
            object[] buffer = new object[4];
            buffer[0] = el.name;
            buffer[1] = el.number;
            buffer[2] = el.kol;
            buffer[3] = el.price;
            dataGridView1.Rows.Add(buffer);
        }
    }

        private void btnExit_Click(object sender, EventArgs e)
        {
           this.Close();
        }

        private void btnDel_Click(object sender, EventArgs e)
        {
            if (dataGridView1.SelectedRows.Count < 1)
            {
                MessageBox.Show(this, "Выберите элемент для удаления!", "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }
            else
            {
                try
                {
                    hostel.setDelHostel(dataGridView1.CurrentRow.Index);
                    doVivod();
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
                   txt.Text = hostel.getSumOfHostel().ToString();
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
            if (txt.Text != "") btnDecide_Click(sender, e);
            doVivod();
        }

    }
}
