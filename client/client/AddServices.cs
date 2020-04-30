using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using serverH;

namespace client
{
    public partial class AddServices : Form
    {
        Service service = null;
        public AddServices()
        {
            InitializeComponent();
        }
        public Service getService
        {
            get
            {
                return service;
            }

        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            service = new Service();
            service.setName(cmbName.SelectedItem.ToString());
            service.setHostel(cmbName.SelectedItem.ToString());
            service.setNumber(Convert.ToInt32(cmbNumber.Text));
            service.setPrice(Convert.ToInt32(cmbPrice.Text));
            service.setTime(cmbTime.SelectedItem.ToString());
            service.setMaster(cmbMaster.SelectedItem.ToString());
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
