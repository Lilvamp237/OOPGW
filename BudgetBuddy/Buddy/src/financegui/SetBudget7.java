package financegui;

import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author senud
 */
public class SetBudget7 extends javax.swing.JFrame {
    private String currentbudget;
    private User user;
    private String uname;
    /**
     * Creates new form SetBudget
     */
    public SetBudget7() {
        this.uname = "";
        initComponents();
    }

    public SetBudget7(String uname) {
        this.uname = uname;
        initComponents();
    }

    public SetBudget7(User user) {
        this.user = user;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        title = new javax.swing.JPanel();
        AddTransactions = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        plus = new javax.swing.JLabel();
        homePanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        home1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        home3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        home2 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        description = new javax.swing.JTextField();
        category = new javax.swing.JComboBox<String>();
        jPanel6 = new javax.swing.JPanel();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        EnterAmount = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        typeAmount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Income");
        getContentPane().setLayout(new AbsoluteLayout());

        title.setBackground(new java.awt.Color(0, 204, 204));
        title.setLayout(new AbsoluteLayout());

        AddTransactions.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        AddTransactions.setForeground(new java.awt.Color(255, 255, 255));
        AddTransactions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddTransactions.setText("Set Budget");
        title.add(AddTransactions, new AbsoluteConstraints(190, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/arrow.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        title.add(jLabel4, new AbsoluteConstraints(10, 0, 40, 50));

        getContentPane().add(title, new AbsoluteConstraints(0, 0, 550, 110));

        plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/plus-circle-solid-72.png"))); // NOI18N
        plus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusMouseClicked(evt);
            }
        });
        getContentPane().add(plus, new AbsoluteConstraints(230, 580, 90, 90));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        home1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/home.png"))); // NOI18N
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(home1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(home1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/user.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        home3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home3.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/wallet.png"))); // NOI18N
        home3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(home3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(home3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        home2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/stat.png"))); // NOI18N
        home2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(home2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(home2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(homePanel, new AbsoluteConstraints(0, 630, 550, 70));

        add.setBackground(new java.awt.Color(0, 153, 153));
        add.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("SET");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new AbsoluteConstraints(370, 550, 120, 60));

        description.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionActionPerformed(evt);
            }
        });
        getContentPane().add(description, new AbsoluteConstraints(140, 500, 350, 30));

        category.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        category.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        getContentPane().add(category, new AbsoluteConstraints(30, 550, 150, 50));

        jPanel6.setBackground(new java.awt.Color(0, 204, 204,30));

        one.setBackground(new java.awt.Color(255, 255, 255));
        one.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(255, 255, 255));
        two.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(255, 255, 255));
        three.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(255, 255, 255));
        four.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(255, 255, 255));
        five.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(255, 255, 255));
        six.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(255, 255, 255));
        seven.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(255, 255, 255));
        eight.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(255, 255, 255));
        nine.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        decimal.setBackground(new java.awt.Color(255, 255, 255));
        decimal.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(255, 255, 255));
        zero.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/delete.png"))); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel6, new AbsoluteConstraints(80, 210, 370, 270));

        EnterAmount.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        EnterAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnterAmount.setText("Enter Amount:");
        getContentPane().add(EnterAmount, new AbsoluteConstraints(10, 150, 210, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new AbsoluteConstraints(210, 180, 290, 10));

        typeAmount.setFont(new java.awt.Font("Times New Roman", 0, 40)); // NOI18N
        typeAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeAmount.setText("00");
        getContentPane().add(typeAmount, new AbsoluteConstraints(210, 120, 290, 70));

        jLabel1.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel1.setText("Note:");
        getContentPane().add(jLabel1, new AbsoluteConstraints(30, 500, 130, 30));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/bg image.jpg"))); // NOI18N
        image.setText("jLabel9");
        image.setToolTipText("");
        getContentPane().add(image, new AbsoluteConstraints(0, 0, 550, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void addActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        Category categ = new Category((String)category.getSelectedItem());
        String note = description.getText();
        float amountValue = 0;
        boolean correct = true;

        try {
            // Get the text from the JTextField
            String amountText = typeAmount.getText();
            // Parse the text as a float
            amountValue = Float.parseFloat(amountText);
        } catch (NumberFormatException ex) {
            // Handle the case where the text is not a valid float
            correct = false;
            System.err.println("Invalid format!");
        }
        if(correct == false){
            JOptionPane.showMessageDialog(null, "Invalid input, try again.");
        }
        else {
            // Insert the user data into the database
            Budget8 budget = new Budget8(user, categ, note, amountValue);
            if (budget.existBudget()) {
                //JOptionPane.showMessageDialog(null, "Budget already set for " + categ.getCategoryName());
                String[] options = { "Update the exisiting", "Make no changes" };
                int selection = JOptionPane.showOptionDialog(null, "What do you want to do?", "Budget already set for '" + categ.getCategoryName() + "'", 
                                                      0, 3, null, options, options[0]);
                if (selection == 0) {
                    if(budget.updateBudget(amountValue)){
                        JOptionPane.showMessageDialog(null, "Updated successfully!");
                    } 
                }
                if (selection == 1) { 
                    JOptionPane.showMessageDialog(null, "You made no changes.");
                }
            }
            else {
                if (budget.addNewBudget()){
                    JOptionPane.showMessageDialog(null, "Budget for the month " + categ.getCategoryName() +" added successfully!");
                    typeAmount.setText("0");
                    currentbudget = "";
                }
                else {
                    JOptionPane.showMessageDialog(null, "Failed to add the expense, try again!");
                }
            }
        }

    }                                   

    private void descriptionActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        currentbudget = typeAmount.getText();
        typeAmount.setText(currentbudget+"2");
    }                                   

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        currentbudget = typeAmount.getText();
        typeAmount.setText(currentbudget+"4");
    }                                    

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        currentbudget = typeAmount.getText();
        typeAmount.setText(currentbudget+"3");
    }                                     

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        currentbudget = typeAmount.getText();
        typeAmount.setText(currentbudget+"5");
    }                                    

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        currentbudget = typeAmount.getText();
        typeAmount.setText(currentbudget+"6");
    }                                   

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        currentbudget = typeAmount.getText();
        typeAmount.setText(currentbudget+"7");
    }                                     

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        currentbudget = typeAmount.getText();
        typeAmount.setText(currentbudget+"8");
    }                                     

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        currentbudget = typeAmount.getText();
        typeAmount.setText(currentbudget+"9");
    }                                    

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        currentbudget = typeAmount.getText();
        typeAmount.setText(currentbudget+".");
    }                                       

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        currentbudget = typeAmount.getText();
        typeAmount.setText(currentbudget+"0");
    }                                    

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        String currentText = typeAmount.getText();
        // Check if the current text is not empty
        if (!currentText.isEmpty()) {
            // Remove the last character from the current text
            currentText = currentText.substring(0, currentText.length() - 1);
            // Update the typeAmount field with the modified text
            typeAmount.setText(currentText);
        }
    }                                      

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        currentbudget = typeAmount.getText();
        typeAmount.setText(currentbudget+"1");
    }                                   
        

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {   
        this.dispose();                                   
        Add4 frame=new Add4(user);
        frame.setVisible(true);
    }                                    

    private void home1MouseClicked(java.awt.event.MouseEvent evt) {  
        this.dispose();                                  
        Home3 frame=new Home3(user);
        frame.setVisible(true);
    }                                  

    private void plusMouseClicked(java.awt.event.MouseEvent evt) {  
        this.dispose();                                 
        Add4 frame=new Add4(user);
        frame.setVisible(true);
    }                                 

    private void home3MouseClicked(java.awt.event.MouseEvent evt) {     
        this.dispose();                               
        Budget8 frame=new Budget8(user);
        frame.setVisible(true);
    }                                  

    private void homeMouseClicked(java.awt.event.MouseEvent evt) { 
        this.dispose();                                 
        Profile9 frame=new Profile9(user);
        frame.setVisible(true);
    }        
    
    private void home2MouseClicked(java.awt.event.MouseEvent evt) {                                   
        this.dispose();
        OverviewIncome frame=new OverviewIncome(user);
        frame.setVisible(true);
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
            java.util.logging.Logger.getLogger(SetBudget7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetBudget7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetBudget7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetBudget7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetBudget7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel AddTransactions;
    private javax.swing.JLabel EnterAmount;
    private javax.swing.JButton add;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JButton decimal;
    private javax.swing.JButton delete;
    private javax.swing.JTextField description;
    private javax.swing.JButton eight;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JLabel home;
    private javax.swing.JLabel home1;
    private javax.swing.JLabel home2;
    private javax.swing.JLabel home3;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JLabel plus;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JPanel title;
    private javax.swing.JButton two;
    private javax.swing.JLabel typeAmount;
    private javax.swing.JButton zero;
    // End of variables declaration                   
}
