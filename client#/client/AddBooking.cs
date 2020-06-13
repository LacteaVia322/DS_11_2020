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
    public partial class AddBooking : Form
    {
        HostelReference.HostelServiceClient hostel = new HostelReference.HostelServiceClient();
        public AddBooking()
        {
            InitializeComponent();
        }

       private void btnAddBook_Click(object sender, EventArgs e)
        {                
            HostelReference.hostel el = new HostelReference.hostel();
            el.name = cmbName.Text;
            el.number = Convert.ToInt32(cmbNumber.Text);
            el.kol = Convert.ToInt32(spnKol.Value);
            el.price = Convert.ToInt32(cmbPrice.Text) * Convert.ToInt32(spnKol.Value);
            Booking f = new Booking();
            hostel.setNewHostel(el);
            f.doVivod();
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


    }
}
