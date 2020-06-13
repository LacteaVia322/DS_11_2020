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
    public partial class Services : Form
    {
        public Services()
        {
            InitializeComponent();            
        }
        ServiceReference.ServiceServiceClient service = new ServiceReference.ServiceServiceClient();
        ServiceReference.service[] arrService;
        private void Services_Load(object sender, EventArgs e)
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
            arrService = service.getAllService();
            dataGridView1.Rows.Clear();
            foreach (ServiceReference.service el in arrService)
            {
                object[] buffer = new object[6];
                buffer[0] = el.name;
                buffer[1] = el.hostel;
                buffer[2] = el.number;
                buffer[3] = el.price;
                buffer[4] = el.time;
                buffer[5] = el.master;
                dataGridView1.Rows.Add(buffer);
            }
        }
        private void btnAddS_Click(object sender, EventArgs e)
        {
            AddServices f = new AddServices();
            f.ShowDialog();
            if (txtS.Text != "") btnDecideS_Click(sender, e);
            doVivod();
        }

        private void btnDecideS_Click(object sender, EventArgs e)
        {
            try
            {
                txtS.Text = service.getSumOfService().ToString();
            }
            catch (Exception ex)
            {
                MessageBox.Show(this, "Ошибка: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void btnDelS_Click(object sender, EventArgs e)
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
                    service.setDelService(dataGridView1.CurrentRow.Index);
                    doVivod();
                    if (txtS.Text != "") btnDecideS_Click(sender, e);
                }
                catch (Exception ex)
                {
                    MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }
        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
