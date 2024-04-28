package financegui;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author senud
 */
public class Oldbudget extends javax.swing.JFrame {

    private float totalBudget;
    private String note;
    private Category month;
    private User user;
    private String uname;
    private float currentBudget;

    /**
     * Creates new form Frame3
     */
    public Oldbudget() {
        this.uname = "";
        initComponents();
    }

    public Oldbudget(String uname) {
        this.uname = uname;
        initComponents();
    }

    public Oldbudget(User user) {
        this.user = user;
        initComponents();
    }

    public Oldbudget(User user, Category month, String note, float budget){
        this.user = user;
        this.month = month;
        this.note = note;
        this.totalBudget = budget;
    }

    public boolean addNewBudget(){
        DB db = new DB();
        if (db.execute("INSERT INTO budget(username, month, note, amount) VALUES ('" + user.getUserName().trim() + "', '" + month.getCategoryName().trim() + "', '" + note.trim() + "', '" + totalBudget +  "')")) {
            return true;
        }
        db.closeCon();
        return false;
    }

    public boolean existBudget(){
        boolean out = false;
        DB db = new DB();
        ResultSet rs = db.getData("SELECT month FROM budget WHERE username = '" + user.getUserName().trim() + "' AND month = '" + month.getCategoryName().trim() + "'");
        try {
            out = rs.next();
            // If the username exists, retrieve the full name
            if (out) {
                return true;
            }
            System.out.println(out);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            db.closeCon();
        }
        return false;
    }

    public boolean updateBudget(float budget){
        totalBudget = budget;
        DB db = new DB();
        if (db.execute("UPDATE budget SET amount='" + totalBudget +  "' where month='" + month.getCategoryName().trim() + "' AND username= '" + user.getUserName().trim() + "'")) {
            return true;
        }
        db.closeCon();
        return false;
    }

    //Gets monthly budget of curent month
    public float getCurrentBudget() {
        try {
            DB db = new DB();
            ResultSet rs = db.getData("SELECT amount FROM budget WHERE MONTH(STR_TO_DATE(CONCAT('2024-', month, '-01'), '%Y-%M-%d')) = MONTH(CURRENT_DATE()) AND YEAR(STR_TO_DATE(CONCAT('2024-', month, '-01'), '%Y-%M-%d')) = YEAR(CURRENT_DATE());");
            if (rs.next()) {
                currentBudget = rs.getFloat("amount");
            }
            db.closeCon();
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        }
        return currentBudget;
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
        jLabel1 = new javax.swing.JLabel();
        plus = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        home1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        home3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        home2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new AbsoluteLayout());

        title.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BUDGET");

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        getContentPane().add(title, new AbsoluteConstraints(0, 0, 550, 110));

        plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/plus-circle-solid-72.png"))); // NOI18N
        plus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusMouseClicked(evt);
            }
        });
        getContentPane().add(plus, new AbsoluteConstraints(230, 580, 90, 90));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));

        home3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home3.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/wallet.png"))); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new AbsoluteConstraints(0, 630, 550, 70));

        //jLabel2.setText("*means both plus sign & wallet sign leads to add budget i guess.. let's see");
        //getContentPane().add(jLabel2, new AbsoluteConstraints(60, 540, 450, 50));

        jLabel5.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExpenseTransaction eTransaction = new ExpenseTransaction(user);
        IncomeTransaction iTransaction = new IncomeTransaction(user);
        jLabel5.setText("Rs."+(getCurrentBudget()-eTransaction.getTotalExpenses()));
        getContentPane().add(jLabel5, new AbsoluteConstraints(200, 140, 140, 50));

        jLabel6.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Remaining of this month");
        getContentPane().add(jLabel6, new AbsoluteConstraints(150, 180, -1, -1));

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 204));
        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar1.setValue(90);
        getContentPane().add(jProgressBar1, new AbsoluteConstraints(150, 240, 240, 30));

        jLabel7.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Spent Rs." + eTransaction.getTotalExpenses() + " of Rs."+getCurrentBudget());
        getContentPane().add(jLabel7, new AbsoluteConstraints(140, 300, -1, -1));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/bg image.jpg"))); // NOI18N
        image.setText("jLabel9");
        image.setToolTipText("");
        getContentPane().add(image, new AbsoluteConstraints(0, 0, 550, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void plusMouseClicked(java.awt.event.MouseEvent evt) {  
        this.dispose();                                
        Add4 frame=new Add4(user);
        frame.setVisible(true);
    }                                 

    private void homeMouseClicked(java.awt.event.MouseEvent evt) { 
        this.dispose();                                 
        Profile9 frame=new Profile9(user);
        frame.setVisible(true);
    }                                 

    private void home1MouseClicked(java.awt.event.MouseEvent evt) { 
        this.dispose();                                  
        Home3 frame=new Home3(user);
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
            java.util.logging.Logger.getLogger(Oldbudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oldbudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oldbudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oldbudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oldbudget().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel home;
    private javax.swing.JLabel home1;
    private javax.swing.JLabel home2;
    private javax.swing.JLabel home3;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel plus;
    private javax.swing.JPanel title;
    // End of variables declaration                   
}
