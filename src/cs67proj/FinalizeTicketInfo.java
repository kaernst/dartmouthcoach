/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs67proj;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author kernst
 */
public class FinalizeTicketInfo extends javax.swing.JFrame {

    private Reservation r;
    private Person p;
    private int bags;
    private int adults;
    private int kids;
    private String dept;
    private String dest;
    private boolean isOneWay;
    private double price;
    private int paymentType; // -1 for not entered, 0 for credit, 1 for cash
    public final DecimalFormat df = new DecimalFormat("#.00");
    
    /**
     * Creates new form FinalizeTicketInfo
     */
    public FinalizeTicketInfo() {
        initComponents();
    }
    
    public FinalizeTicketInfo(Reservation r, Person p) {
        this.r = r;
        this.p = p;
        initComponents();
        this.isOneWay = r.getIsOneWay();
        Direction.setText("ROUND TRIP");
        if (isOneWay) {
            Direction.setText("ONE WAY");
        }
        
        this.dept = r.getDept();
        From.setText("FROM: " + dept);
        
        this.dest = r.getDest();
        To.setText("TO: " + dest);
        
        this.bags = r.getBags();
        this.adults = r.getAdults();
        this.kids = r.getKids();
        this.price = calcCost();
        this.paymentType = -1;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NoPassengers = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        AddPassengers = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PaymentNotSet = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        SetPayment = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        TripDetail = new javax.swing.JLabel();
        Direction = new javax.swing.JLabel();
        From = new javax.swing.JLabel();
        To = new javax.swing.JLabel();
        AdultsLabel = new javax.swing.JLabel();
        NumAdults = new javax.swing.JSpinner();
        NumKids = new javax.swing.JSpinner();
        KidsLabel = new javax.swing.JLabel();
        BagsLabel = new javax.swing.JLabel();
        NumBags = new javax.swing.JSpinner();
        Total = new javax.swing.JLabel();
        Credit = new javax.swing.JButton();
        Cash = new javax.swing.JButton();
        CreditCards = new javax.swing.JLabel();
        Submit2 = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        NoPassengers.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        NoPassengers.setBounds(new java.awt.Rectangle(100, 200, 400, 180));

        jLabel2.setFont(new java.awt.Font("Avenir Next Condensed", 0, 18)); // NOI18N
        jLabel2.setText("You entered 0 adults and 0 children.");

        AddPassengers.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        AddPassengers.setText("ADD PASSENGERS");
        AddPassengers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPassengersActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Avenir Next Condensed", 0, 18)); // NOI18N
        jLabel3.setText("Please add at least one passenger to continue.");

        javax.swing.GroupLayout NoPassengersLayout = new javax.swing.GroupLayout(NoPassengers.getContentPane());
        NoPassengers.getContentPane().setLayout(NoPassengersLayout);
        NoPassengersLayout.setHorizontalGroup(
            NoPassengersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoPassengersLayout.createSequentialGroup()
                .addGroup(NoPassengersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NoPassengersLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2))
                    .addGroup(NoPassengersLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3))
                    .addGroup(NoPassengersLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(AddPassengers)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        NoPassengersLayout.setVerticalGroup(
            NoPassengersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoPassengersLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        PaymentNotSet.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        PaymentNotSet.setBounds(new java.awt.Rectangle(100, 200, 400, 180));

        jLabel8.setFont(new java.awt.Font("Avenir Next Condensed", 0, 18)); // NOI18N
        jLabel8.setText("You did not select a payment method.");

        SetPayment.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        SetPayment.setText("ADD PAYMENT METHOD");
        SetPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetPaymentActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Avenir Next Condensed", 0, 18)); // NOI18N
        jLabel9.setText("Please select \"CASH\" or \"CREDIT\" to continue.");

        javax.swing.GroupLayout PaymentNotSetLayout = new javax.swing.GroupLayout(PaymentNotSet.getContentPane());
        PaymentNotSet.getContentPane().setLayout(PaymentNotSetLayout);
        PaymentNotSetLayout.setHorizontalGroup(
            PaymentNotSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentNotSetLayout.createSequentialGroup()
                .addGroup(PaymentNotSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaymentNotSetLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel9))
                    .addGroup(PaymentNotSetLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel8))
                    .addGroup(PaymentNotSetLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(SetPayment)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        PaymentNotSetLayout.setVerticalGroup(
            PaymentNotSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentNotSetLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SetPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TripDetail.setFont(new java.awt.Font("Avenir Next Condensed", 1, 36)); // NOI18N
        TripDetail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TripDetail.setText("TRIP DETAIL:");

        Direction.setFont(new java.awt.Font("Avenir Next Condensed", 0, 24)); // NOI18N
        Direction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Direction.setText("ONE WAY");

        From.setFont(new java.awt.Font("Avenir Next Condensed", 0, 24)); // NOI18N
        From.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        From.setText("FROM: HANOVER");

        To.setFont(new java.awt.Font("Avenir Next Condensed", 0, 24)); // NOI18N
        To.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        To.setText("TO: BOSTON: SOUTH STATION");

        AdultsLabel.setFont(new java.awt.Font("Avenir Next Condensed", 1, 36)); // NOI18N
        AdultsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdultsLabel.setText("# OF ADULTS:");

        NumAdults.setFont(new java.awt.Font("Avenir Next Condensed", 0, 24)); // NOI18N
        NumAdults.setModel(new javax.swing.SpinnerNumberModel(1, 0, 20, 1));
        NumAdults.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                NumAdultsStateChanged(evt);
            }
        });

        NumKids.setFont(new java.awt.Font("Avenir Next Condensed", 0, 24)); // NOI18N
        NumKids.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        NumKids.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                NumKidsStateChanged(evt);
            }
        });

        KidsLabel.setFont(new java.awt.Font("Avenir Next Condensed", 1, 36)); // NOI18N
        KidsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KidsLabel.setText("# OF CHILDREN:");

        BagsLabel.setFont(new java.awt.Font("Avenir Next Condensed", 1, 36)); // NOI18N
        BagsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BagsLabel.setText("# OF BAGS:");

        NumBags.setFont(new java.awt.Font("Avenir Next Condensed", 0, 24)); // NOI18N
        NumBags.setModel(new javax.swing.SpinnerNumberModel(1, 0, 20, 1));
        NumBags.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                NumBagsStateChanged(evt);
            }
        });

        Total.setFont(new java.awt.Font("Avenir Next Condensed", 1, 48)); // NOI18N
        Total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Total.setText("TOTAL: $0");

        Credit.setFont(new java.awt.Font("Avenir Next Condensed", 0, 24)); // NOI18N
        Credit.setText("CREDIT");
        Credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditActionPerformed(evt);
            }
        });

        Cash.setFont(new java.awt.Font("Avenir Next Condensed", 0, 24)); // NOI18N
        Cash.setText("CASH");
        Cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashActionPerformed(evt);
            }
        });

        CreditCards.setIcon(new javax.swing.ImageIcon("/Users/kernst/java-cs67-proj/images/CreditCards.jpg")); // NOI18N

        Submit2.setFont(new java.awt.Font("Avenir Next Condensed", 1, 24)); // NOI18N
        Submit2.setText("SUBMIT");
        Submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit2ActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Avenir Next Condensed", 0, 18)); // NOI18N
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TripDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(To, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(From, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Direction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Submit2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CreditCards, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Credit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(187, 187, 187)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BagsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumBags, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(AdultsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NumAdults, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(KidsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NumKids, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(TripDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Direction, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(To, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdultsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumAdults, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KidsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumKids, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BagsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumBags, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreditCards, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditActionPerformed
        paymentType = 0;
        Credit.setFont(new java.awt.Font("Avenir Next Condensed", 1, 24));
        Cash.setFont(new java.awt.Font("Avenir Next Condensed", 0, 24));
    }//GEN-LAST:event_CreditActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        dispose();
        if (dept.equals("NEW YORK CITY") || dept.equals("BOSTON: SOUTH STATION")
                || dept.equals("BOSTON: LOGAN AIRPORT")) {
            BosNYTicketInfo ticketBosNY = new BosNYTicketInfo(r, p);
            ticketBosNY.setVisible(true);
        }
        else {
            HanLebNLTicketInfo ticketHanLebNL = new HanLebNLTicketInfo(r, p);
            ticketHanLebNL.setVisible(true);
        }
    }//GEN-LAST:event_BackActionPerformed

    private void NumAdultsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_NumAdultsStateChanged
        adults = (Integer) NumAdults.getValue();
        r.setAdults(adults);
        calcCost();
    }//GEN-LAST:event_NumAdultsStateChanged

    private void NumKidsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_NumKidsStateChanged
        kids = (Integer) NumKids.getValue();
        r.setKids(kids);
        calcCost();
    }//GEN-LAST:event_NumKidsStateChanged

    private void NumBagsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_NumBagsStateChanged
        bags = (Integer) NumBags.getValue();
        r.setBags(bags);
        calcCost();
    }//GEN-LAST:event_NumBagsStateChanged

    private void CashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashActionPerformed
        paymentType = 1;
        Credit.setFont(new java.awt.Font("Avenir Next Condensed", 0, 24));
        Cash.setFont(new java.awt.Font("Avenir Next Condensed", 1, 24));
    }//GEN-LAST:event_CashActionPerformed

    private void Submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit2ActionPerformed
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, 1); 
        Date expDate = cal.getTime();
        r.setExpDate(expDate);
        if (adults + kids == 0 || price == 0)
            NoPassengers.setVisible(true);
        else if (paymentType == -1)
            PaymentNotSet.setVisible(true);
        else {
            dispose();
        }
        if (paymentType == 0) {
            CreditCardSwipe ticketFormCredit = new CreditCardSwipe(r, p, price);
            ticketFormCredit.setVisible(true);
        }
        else if (paymentType == 1) {
            CashPayment ticketFormCash = new CashPayment(r, p, price);
            ticketFormCash.setVisible(true);
        }
    }//GEN-LAST:event_Submit2ActionPerformed

    private void AddPassengersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPassengersActionPerformed
        NoPassengers.dispose();
    }//GEN-LAST:event_AddPassengersActionPerformed

    private void SetPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetPaymentActionPerformed
        PaymentNotSet.dispose();
    }//GEN-LAST:event_SetPaymentActionPerformed

    private double calcCost() {
        double basePrice = 0;
        boolean isNYC = false;
        if (isOneWay) {
            if (dept.equals("HANOVER") || dept.equals("LEBANON")) {
                if (dest.equals("BOSTON: SOUTH STATION"))
                    basePrice = 33;
                else if (dest.equals("BOSTON: LOGAN AIRPORT"))
                    basePrice = 38;
                else {
                    isNYC = true;
                    basePrice = 79.95;
                }
            }
            else if (dept.equals("NEW LONDON")) {
                if (dest.equals("BOSTON: SOUTH STATION"))
                    basePrice = 25;
                else if (dest.equals("BOSTON: LOGAN AIRPORT"))
                    basePrice = 30;
                else {
                    isNYC = true;
                    basePrice = 79.95;
                }
            }
            else if (dept.equals("BOSTON: SOUTH STATION")) {
                if (dest.equals("HANOVER") || dest.equals("LEBANON"))
                    basePrice = 33;
                else {
                    basePrice = 25;
                }
            }
            else if (dept.equals("BOSTON: LOGAN AIRPORT")) {
                if (dest.equals("HANOVER") || dest.equals("LEBANON"))
                    basePrice = 38;
                else {
                    basePrice = 30;
                }
            }
            else if (dept.equals("NEW YORK CITY")) {
                basePrice = 79.95;
                isNYC = true;
            }    
        }
        else {
            if (dept.equals("HANOVER") || dept.equals("LEBANON")) {
                if (dest.equals("BOSTON: SOUTH STATION"))
                    basePrice = 52;
                else if (dest.equals("BOSTON: LOGAN AIRPORT"))
                    basePrice = 62;
                else {
                    isNYC = true;
                    basePrice = 159.90;
                }
            }
            else if (dept.equals("NEW LONDON")) {
                if (dest.equals("BOSTON: SOUTH STATION"))
                    basePrice = 37;
                else if (dest.equals("BOSTON: LOGAN AIRPORT"))
                    basePrice = 47;
                else {
                    isNYC = true;
                    basePrice = 159.90;
                }
            }
            else if (dept.equals("BOSTON: SOUTH STATION")) {
                if (dest.equals("HANOVER") || dest.equals("LEBANON"))
                    basePrice = 52;
                else {
                    basePrice = 37;
                }
            }
            else if (dept.equals("BOSTON: LOGAN AIRPORT")) {
                if (dest.equals("HANOVER") || dest.equals("LEBANON"))
                    basePrice = 62;
                else {
                    basePrice = 47;
                }
            }
            else if (dept.equals("NEW YORK CITY")) {
                basePrice = 159.90;
                isNYC = true;
            }   
        }
        
        double totalPrice = basePrice * adults;
        if (isNYC)
            totalPrice += basePrice * kids;
        else if (kids > adults)
            totalPrice += basePrice * (kids - adults);
        
        int bagsAllowed = 2 * (adults + kids);
        if (bags > bagsAllowed)
            totalPrice += 5 * (bags - bagsAllowed);
        
        price = totalPrice;
        Total.setText("TOTAL: $" + df.format(price));
        return price;
    }
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
            java.util.logging.Logger.getLogger(FinalizeTicketInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalizeTicketInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalizeTicketInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalizeTicketInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalizeTicketInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPassengers;
    private javax.swing.JLabel AdultsLabel;
    private javax.swing.JButton Back;
    private javax.swing.JLabel BagsLabel;
    private javax.swing.JButton Cash;
    private javax.swing.JButton Credit;
    private javax.swing.JLabel CreditCards;
    private javax.swing.JLabel Direction;
    private javax.swing.JLabel From;
    private javax.swing.JLabel KidsLabel;
    private javax.swing.JFrame NoPassengers;
    private javax.swing.JSpinner NumAdults;
    private javax.swing.JSpinner NumBags;
    private javax.swing.JSpinner NumKids;
    private javax.swing.JFrame PaymentNotSet;
    private javax.swing.JButton SetPayment;
    private javax.swing.JButton Submit2;
    private javax.swing.JLabel To;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel TripDetail;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}