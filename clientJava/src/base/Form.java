/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.rmi.Naming;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.endpoint.ServiceServiceService;
import types.ListOfService;
import types.Service;
import service.endpoint.HostelServiceService;
import types.ListOfHostel;
import types.Hostel;

/**
 *
 * @author Lactea Via
 */
public class Form extends javax.swing.JFrame {

    public Form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Booking = new javax.swing.JFrame();
        jToolBar1 = new javax.swing.JToolBar();
        btnAdd = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnDecide = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnDelete = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        lbl = new java.awt.Label();
        txtTotalSumma = new java.awt.TextField();
        Services = new javax.swing.JFrame();
        lbl1 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblS = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        btnAddS = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnDecideS = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnDeleteS = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnExitS = new javax.swing.JButton();
        txtTotalSummaS = new java.awt.TextField();
        dlgAdd = new javax.swing.JDialog();
        btnAddHostel = new javax.swing.JButton();
        spnKol = new javax.swing.JSpinner();
        lblName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        lblKol = new javax.swing.JLabel();
        cmbName = new javax.swing.JComboBox<>();
        lblNumber = new javax.swing.JLabel();
        cmbNumber = new javax.swing.JComboBox<>();
        cmbPrice = new javax.swing.JComboBox<>();
        dlgAddServ = new javax.swing.JDialog();
        btnAddService = new javax.swing.JButton();
        lblService = new javax.swing.JLabel();
        lblPriceS = new javax.swing.JLabel();
        btnCancelS = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        cmbService = new javax.swing.JComboBox<>();
        lblNumberS = new javax.swing.JLabel();
        cmbNumberS = new javax.swing.JComboBox<>();
        cmbPriceS = new javax.swing.JComboBox<>();
        lblMaster = new javax.swing.JLabel();
        cmbMaster = new javax.swing.JComboBox<>();
        cmbTime = new javax.swing.JComboBox<>();
        lblHostel = new javax.swing.JLabel();
        cmbHostel = new javax.swing.JComboBox<>();
        btnOrderServices = new javax.swing.JButton();
        btnReservation = new javax.swing.JButton();

        Booking.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                BookingWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        btnAdd.setText("Добавить");
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAdd);
        jToolBar1.add(jSeparator1);

        btnDecide.setText("Вычислить");
        btnDecide.setFocusable(false);
        btnDecide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDecide.setName(""); // NOI18N
        btnDecide.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDecide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecideActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDecide);
        jToolBar1.add(jSeparator2);

        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setLabel("Удалить");
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDelete);
        jToolBar1.add(jSeparator3);

        btnExit.setText("Вернуться в гл меню");
        btnExit.setToolTipText("");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExit);

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "№ брони", "Хостел", "Номер", "Кол-во чел", "Сумма"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);

        lbl.setName("lbl"); // NOI18N
        lbl.setText("Общая сумма брони");

        javax.swing.GroupLayout BookingLayout = new javax.swing.GroupLayout(Booking.getContentPane());
        Booking.getContentPane().setLayout(BookingLayout);
        BookingLayout.setHorizontalGroup(
            BookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookingLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(txtTotalSumma, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(446, Short.MAX_VALUE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        BookingLayout.setVerticalGroup(
            BookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BookingLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(BookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalSumma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        Services.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                ServicesWindowOpened(evt);
            }
        });

        lbl1.setName("lbl"); // NOI18N
        lbl1.setText("Общая сумма услуг");

        tblS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "№", "Название услуги", "Хостел", "Номер комнаты", "Стоимость", "Продолжительность", "Работник"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblS);

        jToolBar2.setRollover(true);

        btnAddS.setText("Добавить");
        btnAddS.setFocusable(false);
        btnAddS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSActionPerformed(evt);
            }
        });
        jToolBar2.add(btnAddS);
        jToolBar2.add(jSeparator4);

        btnDecideS.setText("Вычислить");
        btnDecideS.setFocusable(false);
        btnDecideS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDecideS.setName(""); // NOI18N
        btnDecideS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDecideS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecideSActionPerformed(evt);
            }
        });
        jToolBar2.add(btnDecideS);
        jToolBar2.add(jSeparator5);

        btnDeleteS.setFocusable(false);
        btnDeleteS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeleteS.setLabel("Удалить");
        btnDeleteS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeleteS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSActionPerformed(evt);
            }
        });
        jToolBar2.add(btnDeleteS);
        jToolBar2.add(jSeparator6);

        btnExitS.setText("Вернуться в гл меню");
        btnExitS.setToolTipText("");
        btnExitS.setFocusable(false);
        btnExitS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExitS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExitS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitSActionPerformed(evt);
            }
        });
        jToolBar2.add(btnExitS);

        javax.swing.GroupLayout ServicesLayout = new javax.swing.GroupLayout(Services.getContentPane());
        Services.getContentPane().setLayout(ServicesLayout);
        ServicesLayout.setHorizontalGroup(
            ServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ServicesLayout.createSequentialGroup()
                .addGroup(ServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServicesLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(txtTotalSummaS, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ServicesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ServicesLayout.setVerticalGroup(
            ServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ServicesLayout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ServicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalSummaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnAddHostel.setText("Добавить");
        btnAddHostel.setName("btnAddHostel"); // NOI18N
        btnAddHostel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHostelActionPerformed(evt);
            }
        });

        spnKol.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        spnKol.setToolTipText("");
        spnKol.setName("spnKol"); // NOI18N

        lblName.setText("Наименование");
        lblName.setName("lblName"); // NOI18N

        lblPrice.setText("Цена");
        lblPrice.setName("lblPrice"); // NOI18N

        btnCancel.setActionCommand("Отмена");
        btnCancel.setLabel("Отмена");
        btnCancel.setName("btnCancel"); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblKol.setText("Кол-во человек");
        lblKol.setToolTipText("");
        lblKol.setName("lblKol"); // NOI18N

        cmbName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Хостел на Театралке", "Хостел на Лепсе", "Хостел у реки Вятки" }));
        cmbName.setName("cmbName"); // NOI18N

        lblNumber.setText("Номер");

        cmbNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11", "12", "13", "14", "15", "21", "22", "23", "24", "25" }));

        cmbPrice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1000", "1500", "2000", "3000", "5000" }));

        javax.swing.GroupLayout dlgAddLayout = new javax.swing.GroupLayout(dlgAdd.getContentPane());
        dlgAdd.getContentPane().setLayout(dlgAddLayout);
        dlgAddLayout.setHorizontalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addComponent(btnAddHostel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel)
                        .addGap(24, 24, 24))
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblNumber))
                        .addContainerGap(201, Short.MAX_VALUE))
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKol)
                            .addComponent(lblPrice))
                        .addGap(18, 18, 18)
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnKol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dlgAddLayout.createSequentialGroup()
                                .addComponent(cmbName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        dlgAddLayout.setVerticalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(cmbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumber)
                    .addComponent(cmbNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblKol)
                    .addComponent(spnKol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice))
                .addGap(18, 18, 18)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddHostel)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAddService.setText("Добавить");
        btnAddService.setName("btnAddTovar"); // NOI18N
        btnAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddServiceActionPerformed(evt);
            }
        });

        lblService.setText("Перечень услуг");
        lblService.setName("lblName"); // NOI18N

        lblPriceS.setText("Стоимость");
        lblPriceS.setToolTipText("");
        lblPriceS.setName("lblPrice"); // NOI18N

        btnCancelS.setActionCommand("Отмена");
        btnCancelS.setLabel("Отмена");
        btnCancelS.setName("btnCancel"); // NOI18N
        btnCancelS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSActionPerformed(evt);
            }
        });

        lblTime.setText("Продолжительность");
        lblTime.setToolTipText("");
        lblTime.setName("lblKol"); // NOI18N

        cmbService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Трансфер", "Приборка", "Смена белья", "Массаж", "Маникюр", "Еда в номер" }));
        cmbService.setName("cmbName"); // NOI18N

        lblNumberS.setText("Номер заказчика");

        cmbNumberS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11", "12", "13", "14", "15", "21", "22", "23", "24", "25" }));

        cmbPriceS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500", "900", "1300", "1500", "2000", "3000" }));

        lblMaster.setText("Работник");
        lblMaster.setToolTipText("");
        lblMaster.setName("lblPrice"); // NOI18N

        cmbMaster.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Иванов И.И.", "Петрова Е.В.", "Щербаков Г.Б.", "Васильева К.Е.", "Мишутина У.Г." }));

        cmbTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10 мин", "30 мин", "45 мин", "1 час", "3 часа", "5 часов" }));

        lblHostel.setText("Хостел");
        lblHostel.setName("lblName"); // NOI18N

        cmbHostel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Хостел на Театралке", "Хостел на Лепсе", "Хостел у реки Вятки" }));
        cmbHostel.setName("cmbName"); // NOI18N

        javax.swing.GroupLayout dlgAddServLayout = new javax.swing.GroupLayout(dlgAddServ.getContentPane());
        dlgAddServ.getContentPane().setLayout(dlgAddServLayout);
        dlgAddServLayout.setHorizontalGroup(
            dlgAddServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddServLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAddServLayout.createSequentialGroup()
                        .addGroup(dlgAddServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumberS)
                            .addGroup(dlgAddServLayout.createSequentialGroup()
                                .addGroup(dlgAddServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTime)
                                    .addComponent(lblPriceS)
                                    .addComponent(lblMaster))
                                .addGap(18, 18, 18)
                                .addGroup(dlgAddServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbPriceS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbNumberS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dlgAddServLayout.createSequentialGroup()
                        .addGroup(dlgAddServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgAddServLayout.createSequentialGroup()
                                .addComponent(lblHostel)
                                .addGap(50, 50, 50)
                                .addGroup(dlgAddServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbService, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbHostel, 0, 189, Short.MAX_VALUE)))
                            .addGroup(dlgAddServLayout.createSequentialGroup()
                                .addComponent(lblService)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(dlgAddServLayout.createSequentialGroup()
                                .addComponent(btnAddService)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelS)))
                        .addContainerGap())))
        );
        dlgAddServLayout.setVerticalGroup(
            dlgAddServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddServLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblService)
                    .addComponent(cmbService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlgAddServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHostel)
                    .addComponent(cmbHostel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumberS)
                    .addComponent(cmbNumberS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime)
                    .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaster)
                    .addComponent(cmbMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPriceS)
                    .addComponent(cmbPriceS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlgAddServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddService)
                    .addComponent(btnCancelS))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("form"); // NOI18N

        btnOrderServices.setText("Заказ услуги");
        btnOrderServices.setName("btnOrderServices"); // NOI18N
        btnOrderServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderServicesActionPerformed(evt);
            }
        });

        btnReservation.setText("Бронирование");
        btnReservation.setName("btnReservation"); // NOI18N
        btnReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrderServices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnOrderServices, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static DefaultTableModel modelh = new DefaultTableModel();
    static HostelServiceService hostelService = null;
    static DefaultTableModel models = new DefaultTableModel();
    static ServiceServiceService serviceService = null;

    static {
        serviceService = new ServiceServiceService();
    }

    static {
        hostelService = new HostelServiceService();
    }

    private void btnReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservationActionPerformed
        Booking.setSize(800, 397);
        Booking.setVisible(true);
    }//GEN-LAST:event_btnReservationActionPerformed

    private void btnOrderServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderServicesActionPerformed
        Services.setSize(800, 397);
        Services.setVisible(true);
    }//GEN-LAST:event_btnOrderServicesActionPerformed

    private void btnDecideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecideActionPerformed
        try {
            txtTotalSumma.setText(Integer.toString(hostelService.getHostelServicePort().getSumOfHostel()));
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDecideActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        dlgAdd.setSize(300, 320);
        dlgAdd.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(tbl.getSelectedRowCount()==1)
        {      
          hostelService.getHostelServicePort().setDelHostel(tbl.getSelectedRow());    
          modelh.removeRow(tbl.getSelectedRow());
        }else{
          if(tbl.getRowCount()==0){
          JOptionPane.showMessageDialog(this,"Таблица пустая.");
            }else{JOptionPane.showMessageDialog(this,"Пожалуйста, выберите строку для удаления.");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
private void doVivod(ListOfHostel lstHostel){
        doClearTable();
        int i = 1;
        for(Hostel hostel: lstHostel.getItem()){
            Object[] rowData = new Object[5];
            rowData[0] = i++;
            rowData[1] = hostel.getName();
            rowData[2] = hostel.getNumber();
            rowData[3] = hostel.getKol();
            rowData[4] = hostel.getPrice();
            modelh.addRow(rowData);
        }
    }
    private void doClearTable(){
        while (modelh.getRowCount()>0){
            modelh.removeRow(0);
        }   
    }
     private void doVivodS(ListOfService lstService){
        doClearTableS();
        int i = 1;
        for(Service service: lstService.getItem()){
            Object[] rowData = new Object[7];
            rowData[0] = i++;
            rowData[1] = service.getName();
            rowData[2] = service.getHostel();
            rowData[3] = service.getNumber();
            rowData[4] = service.getPrice();
            rowData[5] = service.getTime();
            rowData[6] = service.getMaster();
            models.addRow(rowData);
        }
    }
    private void doClearTableS(){
        while (models.getRowCount()>0){
            models.removeRow(0);
        }   
    }
    private void btnAddHostelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHostelActionPerformed
        dlgAdd.setVisible(false);
             Hostel el = new Hostel();
          el.setName(cmbName.getSelectedItem().toString());
            el.setNumber(Integer.parseInt(cmbNumber.getSelectedItem().toString()));
            el.setKol((int) spnKol.getValue());
            el.setPrice(Integer.parseInt(cmbPrice.getSelectedItem().toString())*(int) spnKol.getValue());
        try {
            doVivod(hostelService.getHostelServicePort().setNewHostel(el));
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Не удалось добавить. Попытайтесь повторить попытку :" + ex.getMessage() + ".",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddHostelActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dlgAdd.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Booking.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSActionPerformed
        dlgAddServ.setSize(300, 356);
        dlgAddServ.setVisible(true);
    }//GEN-LAST:event_btnAddSActionPerformed

    private void btnDecideSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecideSActionPerformed
        try {
            txtTotalSummaS.setText(Integer.toString(serviceService.getServiceServicePort().getSumOfService()));
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDecideSActionPerformed

    private void btnDeleteSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSActionPerformed
        if(tblS.getSelectedRowCount()==1)
        {
        serviceService.getServiceServicePort().setDelService(tblS.getSelectedRow());
        models.removeRow(tblS.getSelectedRow());
        }else{
          if(tblS.getRowCount()==0){
          JOptionPane.showMessageDialog(this,"Таблица пустая.");
            }else{JOptionPane.showMessageDialog(this,"Пожалуйста, выберите строку для удаления.");
            }
        }
    }//GEN-LAST:event_btnDeleteSActionPerformed

    private void btnExitSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitSActionPerformed
        Services.setVisible(false);
    }//GEN-LAST:event_btnExitSActionPerformed

    private void btnAddServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddServiceActionPerformed
        dlgAddServ.setVisible(false);
             Service el = new Service();
             el.setName(cmbService.getSelectedItem().toString());
            el.setNumber(Integer.parseInt(cmbNumberS.getSelectedItem().toString()));
            el.setHostel(cmbHostel.getSelectedItem().toString());
            el.setPrice(Integer.parseInt(cmbPriceS.getSelectedItem().toString()));
            el.setTime(cmbTime.getSelectedItem().toString());
            el.setMaster(cmbMaster.getSelectedItem().toString()); 
            try {
            doVivodS(serviceService.getServiceServicePort().setNewService(el));
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Не удалось добавить. Попытайтесь повторить попытку :" + ex.getMessage() + ".",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddServiceActionPerformed

    private void btnCancelSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSActionPerformed
        dlgAddServ.setVisible(false);
    }//GEN-LAST:event_btnCancelSActionPerformed

    private void BookingWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_BookingWindowOpened
        try {
            modelh = (DefaultTableModel)tbl.getModel(); 
            doVivod(hostelService.getHostelServicePort().getAllHostel());
        } catch (Exception ex) {
            ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                "Ошибка",
                JOptionPane.ERROR_MESSAGE);
        }         

    }//GEN-LAST:event_BookingWindowOpened

    private void ServicesWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ServicesWindowOpened
        try {
            models = (DefaultTableModel)tblS.getModel(); 
            doVivodS(serviceService.getServiceServicePort().getAllService());
        } catch (Exception ex) {
            ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                "Ошибка",
                JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_ServicesWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Booking;
    private javax.swing.JFrame Services;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddHostel;
    private javax.swing.JButton btnAddS;
    private javax.swing.JButton btnAddService;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancelS;
    private javax.swing.JButton btnDecide;
    private javax.swing.JButton btnDecideS;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteS;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExitS;
    private javax.swing.JButton btnOrderServices;
    private javax.swing.JButton btnReservation;
    private javax.swing.JComboBox<String> cmbHostel;
    private javax.swing.JComboBox<String> cmbMaster;
    private javax.swing.JComboBox<String> cmbName;
    private javax.swing.JComboBox<String> cmbNumber;
    private javax.swing.JComboBox<String> cmbNumberS;
    private javax.swing.JComboBox<String> cmbPrice;
    private javax.swing.JComboBox<String> cmbPriceS;
    private javax.swing.JComboBox<String> cmbService;
    private javax.swing.JComboBox<String> cmbTime;
    private javax.swing.JDialog dlgAdd;
    private javax.swing.JDialog dlgAddServ;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private java.awt.Label lbl;
    private java.awt.Label lbl1;
    private javax.swing.JLabel lblHostel;
    private javax.swing.JLabel lblKol;
    private javax.swing.JLabel lblMaster;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblNumberS;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPriceS;
    private javax.swing.JLabel lblService;
    private javax.swing.JLabel lblTime;
    private javax.swing.JSpinner spnKol;
    private javax.swing.JTable tbl;
    private javax.swing.JTable tblS;
    private java.awt.TextField txtTotalSumma;
    private java.awt.TextField txtTotalSummaS;
    // End of variables declaration//GEN-END:variables
}
