/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_final_project;

/**
 *
 * @author Sandun
 */
public class loading extends javax.swing.JFrame implements Runnable {
    Thread th; 
    /**
     * Creates new form loading_screen
     */
    public loading() {
        super("loading");
        initComponents();
        th=new Thread((Runnable)this);
    }
    public void setUploading() {
         th.start();
    }
    public void run(){
        bg menu = new bg();
        loading sp = new loading();
        sp.setVisible(true);
         
        try {
            for(int i=0;i<=100;i++){
                 
                Thread.sleep(25);
                sp.jProgressBar1.setValue(i);
                
                sp.value.setText(i+"%");
                
                if(i==10){
                    sp.loading.setText("Turining Modules...");
                    
                }
                if(i==20){
                    sp.loading.setText("Connecting to database... ");
                    
                }
                if(i==40){
                    sp.loading.setText("Loading Data.");
                    
                }
                if(i==45){
                    sp.loading.setText("Loading Data..");
                    
                }
                if(i==50){
                    sp.loading.setText("Loading Data...");
                    
                }
                if(i==55){
                    sp.loading.setText("Loading Data.");
                    
                }
                if(i==60){
                    sp.loading.setText("Loading Data..");
                    
                }
                if(i==65){
                    sp.loading.setText("Loading Data...");
                    
                }
                if(i==75){
                    sp.loading.setText("App is Starting...");
                    
                }
                if(i==90){
                    sp.loading.setText("Thanks for Waiting..");
                }
              if(i==100){
                  setVisible(false);
                  menu.setVisible(true);
                  sp.setVisible(false);
                 
              }
            }
        } catch (Exception e) {
         
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        right_bg3 = new oop_final_project.right_bg();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        value = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        loading = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        right_bg3.setPreferredSize(new java.awt.Dimension(1200, 800));
        right_bg3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/Untitled-2.png"))); // NOI18N
        right_bg3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/ZUiY.gif"))); // NOI18N
        right_bg3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, 480));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/ez.gif"))); // NOI18N
        right_bg3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 240, 40));

        value.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        value.setForeground(new java.awt.Color(255, 0, 51));
        right_bg3.add(value, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 720, 70, 40));
        right_bg3.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 1200, 30));

        loading.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 0, 51));
        loading.setText("Loading");
        right_bg3.add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Grocery Billing System Loading");
        right_bg3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 570, 80));

        jPanel1.add(right_bg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel loading;
    private oop_final_project.right_bg right_bg3;
    private javax.swing.JLabel value;
    // End of variables declaration//GEN-END:variables

    
}
