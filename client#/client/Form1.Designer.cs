namespace client
{
    partial class Form1
    {
        /// <summary>
        /// Обязательная переменная конструктора.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Освободить все используемые ресурсы.
        /// </summary>
        /// <param name="disposing">истинно, если управляемый ресурс должен быть удален; иначе ложно.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Код, автоматически созданный конструктором форм Windows

        /// <summary>
        /// Требуемый метод для поддержки конструктора — не изменяйте 
        /// содержимое этого метода с помощью редактора кода.
        /// </summary>
        private void InitializeComponent()
        {
            this.btn_booking = new System.Windows.Forms.Button();
            this.btn_service = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btn_booking
            // 
            this.btn_booking.Location = new System.Drawing.Point(59, 30);
            this.btn_booking.Name = "btn_booking";
            this.btn_booking.Size = new System.Drawing.Size(158, 73);
            this.btn_booking.TabIndex = 0;
            this.btn_booking.Text = "Booking";
            this.btn_booking.UseVisualStyleBackColor = true;
            this.btn_booking.Click += new System.EventHandler(this.btn_booking_Click);
            // 
            // btn_service
            // 
            this.btn_service.Location = new System.Drawing.Point(59, 134);
            this.btn_service.Name = "btn_service";
            this.btn_service.Size = new System.Drawing.Size(155, 76);
            this.btn_service.TabIndex = 1;
            this.btn_service.Text = "Service";
            this.btn_service.UseVisualStyleBackColor = true;
            this.btn_service.Click += new System.EventHandler(this.btn_service_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(280, 237);
            this.Controls.Add(this.btn_service);
            this.Controls.Add(this.btn_booking);
            this.Name = "Form1";
            this.Text = "Menu";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btn_booking;
        private System.Windows.Forms.Button btn_service;
    }
}

