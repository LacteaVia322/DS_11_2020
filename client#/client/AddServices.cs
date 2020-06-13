using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace client
{
    public partial class AddServices : Form
    {
        ServiceReference.ServiceServiceClient service = new ServiceReference.ServiceServiceClient();
        public AddServices()
        {
            InitializeComponent();
        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            ServiceReference.service el = new ServiceReference.service();
            el.name = cmbName.Text;
            el.hostel = cmbHostel.Text;
            el.number = Convert.ToInt32(cmbNumber.Text);
            el.time = cmbTime.Text;
            el.master = cmbMaster.Text;
            el.price = Convert.ToInt32(cmbPrice.Text);
            Services f = new Services();
            service.setNewService(el);
            f.doVivod();
            this.Close();
        }

        private void AddServices_Load(object sender, EventArgs e)
        {
            cmbName.SelectedIndex = 0;
            cmbHostel.SelectedIndex = 0;
            cmbTime.SelectedIndex = 0;
            cmbNumber.SelectedIndex = 0;
            cmbPrice.SelectedIndex = 0;
            cmbMaster.SelectedIndex = 0;
        }
    }
}
