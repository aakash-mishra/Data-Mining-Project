/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bhakti
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;
import java.util.*;

public class NB extends javax.swing.JFrame {

    /**
     * Creates new form NB
     */
           
float sum=0,d,ans;
// To get the number of rows present in sheet
int totalNoOfRows;


// To get the number of columns present in sheet
int totalNoOfCols;;
float py=0,pn=0,pu=0;
float gender[][]=new float[2][3];
float armed[][]=new float[3][3];
float prior[][]=new float[3][3];
Sheet sh;
    public NB() {
        initComponents();
     try{   
        String FilePath="C:\\Users\\Bhakti\\Downloads\\police.xls";
        FileInputStream fs=new FileInputStream(FilePath);
        Workbook wb=Workbook.getWorkbook(fs);

// TO get the access to the sheet
         sh=wb.getSheet("police");
        totalNoOfCols=sh.getColumns();
        totalNoOfRows=sh.getRows();
    }
 catch (Exception ex) {
            Logger.getLogger(DM.class.getName()).log(Level.SEVERE, null, ex);
        }
       for(int i=0;i<100;i++)
{
            String val=sh.getCell(3,i).getContents();
    if(val.equals("Yes"))
        py++;
    else if(val.equals("No"))
        pn++;
    else pu++;
}

    pu=pu/100;
    py=py/100;
    pn=pn/100;


    for(int i=0;i<100;i++)
    {
        for(int j=0;j<3;j++)
        {
            String val=sh.getCell(j,i).getContents();
            if(j==0)
            {
                if(val.equals("Male")&&sh.getCell(3,i).getContents().equals("Yes"))
                    gender[0][0]++;
                else if(val.equals("Male")&&sh.getCell(3,i).getContents().equals("No"))
                    gender[0][1]++;
                else if(val.equals("Male")&&sh.getCell(3,i).getContents().equals("Unclear"))
                    gender[0][2]++;
                else if(val.equals("Female")&&sh.getCell(3,i).getContents().equals("Yes"))
                    gender[1][0]++;
                else if(val.equals("Female")&&sh.getCell(3,i).getContents().equals("No"))
                    gender[1][1]++;
                else if(val.equals("Female")&&sh.getCell(3,i).getContents().equals("Unclear"))
                    gender[1][2]++;

}

            else if(j==1)
            {
                if(val.equals("Yes")&&sh.getCell(3,i).getContents().equals("Yes"))
                armed[0][0]++;
                else if(val.equals("Yes")&&sh.getCell(3,i).getContents().equals("No"))
                    armed[0][1]++;
                else if(val.equals("Yes")&&sh.getCell(3,i).getContents().equals("Unclear"))
                    armed[0][2]++;
                else if(val.equals("No")&&sh.getCell(3,i).getContents().equals("Yes"))
                    armed[1][0]++;
                else if(val.equals("No")&&sh.getCell(3,i).getContents().equals("No"))
                    armed[1][1]++;
                else if(val.equals("No")&&sh.getCell(3,i).getContents().equals("Unclear"))
                    armed[1][2]++;
                else if(val.equals("Unclear")&&sh.getCell(3,i).getContents().equals("Yes"))
                    armed[2][0]++;
                else if(val.equals("Unclear")&&sh.getCell(3,i).getContents().equals("No"))
                    armed[2][1]++;
                else if(val.equals("Unclear")&&sh.getCell(3,i).getContents().equals("Unclear"))
                    armed[2][2]++;

}

            else if(j==2)
{
            if(val.equals("Yes")&&sh.getCell(3,i).getContents().equals("Yes"))
            prior[0][0]++;
            else if(val.equals("Yes")&&sh.getCell(3,i).getContents().equals("No"))
            prior[0][1]++;
            else if(val.equals("Yes")&&sh.getCell(3,i).getContents().equals("Unclear"))
            prior[0][2]++;
            else if(val.equals("No")&&sh.getCell(3,i).getContents().equals("Yes"))
            prior[1][0]++;
            else if(val.equals("No")&&sh.getCell(3,i).getContents().equals("No"))
            prior[1][1]++;
            else if(val.equals("No")&&sh.getCell(3,i).getContents().equals("Unclear"))
            prior[1][2]++;
            else if(val.equals("Unclear")&&sh.getCell(3,i).getContents().equals("Yes"))
            prior[2][0]++;
            else if(val.equals("Unclear")&&sh.getCell(3,i).getContents().equals("No"))
            prior[2][1]++;
            else if(val.equals("Unclear")&&sh.getCell(3,i).getContents().equals("Unclear"))
               prior[2][2]++;

}

}
}

for(int i=0;i<3;i++)

{
for(int j=0;j<3;j++)
{
if(j==0)
{
if(i!=2)
gender[i][j]/=py*100;
armed[i][j]/=py*100;
prior[i][j]/=py*100;

}
else if(j==1)
{
if(i!=2)
gender[i][j]/=pn*100;
armed[i][j]/=pn*100;
prior[i][j]/=pn*100;

}
else if(j==2)
{
if(i!=2)
gender[i][j]/=pu*100;
armed[i][j]/=pu*100;
prior[i][j]/=pu*100;

}
}
}

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gender(male/female)");

        jLabel2.setText("Armed?(yes/no/unclear)");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("RUN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("Priors?(yes/no/unclear)");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Naive Bayes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String gend=jTextField1.getText();
        String arme=jTextField2.getText();
        String prio=jTextField3.getText();
        int gen=0,arm=0,pri=0;
         if(gend.equalsIgnoreCase("male"))
         gen=0;
         else if(gend.equalsIgnoreCase("female"))
           gen=1;
      if(arme.equalsIgnoreCase("yes"))
        arm=0;
      else if(arme.equalsIgnoreCase("no"))
        arm=1;
       else if(arme.equalsIgnoreCase("unclear"))
        arm=2;
        
    if(prio.equalsIgnoreCase("yes"))
    pri=0;
    else if(prio.equalsIgnoreCase("no"))
    pri=1;

    else if(prio.equalsIgnoreCase("unclear"))
    pri=2;
        float ansy=1,ansn=1,ansu=1;

ansy=gender[gen][0]*armed[arm][0]*prior[pri][0]*py;
ansn=gender[gen][1]*armed[arm][1]*prior[pri][1]*pn;
ansu=gender[gen][2]*armed[arm][2]*prior[pri][2]*pu;

jTextArea1.append("\nProbability of Yes: "+ansy);
jTextArea1.append("\nProbability of No: "+ansn);
jTextArea1.append("\nProbability of Unclear: "+ansu);

       if(ansy>ansn&&ansy>ansu)
        {
           jTextArea1.append("\nSuspension Given?: YES");
        }
       else if(ansn>ansy&&ansn>ansu)
        {
           jTextArea1.append("\nSuspension Given?: NO");
        }  
       else
       {
           jTextArea1.append("\nSuspension Given?: UNCLEAR");
       }
       
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(NB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
