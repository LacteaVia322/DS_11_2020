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
    public partial class AddBooking : Form
    {
        Hostel hostel = null;
        public AddBooking()
        {
            InitializeComponent();
        }

        private void btnAddBook_Click(object sender, EventArgs e)
        {
            hostel = new Hostel();
            hostel.setName(cmbName.SelectedItem.ToString());
            hostel.setNumber(Convert.ToInt32(cmbNumber.Text));
            hostel.setKol(Convert.ToInt32(spnKol.Value));
            hostel.setPrice(Convert.ToInt32(cmbPrice.Text)*Convert.ToInt32(spnKol.Value));
            this.Close();
        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void AddBooking_Load(object sender, EventArgs e)
        {
            cmbName.SelectedIndex = 0;
            cmbPrice.SelectedIndex = 0;
            cmbNumber.SelectedIndex = 0;
        }
        public Hostel getHostel
        {
            get
            {
                return hostel;
            }

        }
    }
}
