/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

/**
 *
 * @author jorgecisneros
 */
public class VentanaKerningConjunto extends javax.swing.JFrame {
    BufferedImage buffer = null;
    
    int anchoPixel = 10;
    int separacion = 7;
    String palabra = "";
    
     
    private void dibujaLetra(boolean[][]letra, int kern){
      Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        
      for(int i=0; i<9; i++){
            for(int j=0; j<10; j++){
                if(letra[j][i]){       
                    g2.fillRect(kern+i*anchoPixel, j*anchoPixel, anchoPixel, anchoPixel);
                }  
                else{
                    g2.drawRect(kern+i*anchoPixel, j*anchoPixel, anchoPixel, anchoPixel);
                }    
            }
        }
    }
    
    private void pintaPalabra(String p){
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == 'A') {
                dibujaLetra(letraA, i * separacion * anchoPixel);
            }
            if (p.charAt(i) == 'V') {
                dibujaLetra(letraV, i * separacion * anchoPixel);
            }
        }

    }
    

    boolean[][] letraA = {
    { false, false, false, false, true, false, false, false, false },
    { false, false, false, false, true, false, false, false, false },
    { false, false, false, true, false, true, false, false, false },
    { false, false, false, true, false, true, false, false, false },
    { false, false, true, false, false, false, true, false, false },
    { false, false, true, false, false, false, true, false, false },
    { false, true, true, true, true, true, true, true, false },
    { false, true, false, false, false, false, false, true, false },
    { false, true, false, false, false, false, false, true, false },
    { true, true, true, false, false, false, true, true, true }
};
boolean[][] letraE = {
    { false, false, false, false, true, true, false, false, false },
    { false, false, false, false, true, false, false, false, false },
    { false, false, false, false, false, true, false, false, false },
    { false, false, false, true, false, true, false, false, false },
    { false, false, true, false, false, false, true, false, false },
    { false, false, true, false, false, false, true, false, false },
    { false, true, true, true, true, true, true, true, false },
    { false, true, false, false, false, false, false, true, false },
    { false, true, false, false, false, false, false, true, false },
    { true, true, true, false, false, false, true, true, true }
};

boolean[][] letraI = {
    { false, false, false, false, true, false, false, false, false },
    { false, false, false, false, true, false, false, false, false },
    { false, false, false, true, false, true, false, false, false },
    { false, false, false, true, false, true, false, false, false },
    { false, false, true, false, false, false, true, false, false },
    { false, false, true, false, false, false, true, false, false },
    { false, true, true, true, true, true, true, true, false },
    { false, true, false, false, false, false, false, true, false },
    { false, true, false, false, false, false, false, true, false },
    { true, true, true, false, false, false, true, true, true }
};

boolean[][] letraV = {
    { true, true, true, false, false, false, true, true, true },
    { false, true, false, false, false, false, false, true, false },
    { false, true, false, false, false, false, false, true, false },
    { false, true, false, false, false, false, false, true, false },
    { false, false, true, false, false, false, true, false, false }, 
    { false, false, true, false, false, false, true, false, false },
    { false, false, false, true, false, true, false, false, false },
    { false, false, false, true, false, true, false, false, false },
    { false, false, false, false, true, false, false, false, false },
    { false, false, false, false, true, false, false, false, false },
};
boolean[][] letraI = {
    { true, true, true, false, false, false, true, true, true },
    { false, true, false, false, false, false, false, true, false },
    { false, true, false, false, false, false, false, true, false },
    { false, true, false, false, false, false, false, true, false },
    { false, false, true, false, false, false, true, false, false }, 
    { false, false, true, false, false, false, true, false, false },
    { false, false, false, true, false, true, false, false, false },
    { false, false, false, true, false, true, false, false, false },
    { false, false, false, false, true, false, false, false, false },
    { false, false, false, false, true, false, false, false, false },
};

    /**
     * Creates new form VentanaKerningConjunto
     */
    public VentanaKerningConjunto() {
        initComponents();
        buffer = (BufferedImage)jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        Graphics2D g2 = buffer.createGraphics();
        g2.setColor(Color.white);
        g2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
    }
    @Override
    public void paint(Graphics g){
        super.paintComponents(g);
        Graphics2D  g2 = (Graphics2D) jPanel1.getGraphics();
        g2.drawImage(buffer, 0, 0, null);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 839, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 402, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_A){
            palabra = palabra + "A";
            pintaPalabra(palabra);
            repaint();
        }
        if(evt.getKeyCode() == KeyEvent.VK_V){
            palabra = palabra + "V";
            pintaPalabra(palabra);
            repaint();
        }
    }//GEN-LAST:event_jPanel1KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_A){
            palabra = palabra + "A";
            pintaPalabra(palabra);
            repaint();
        }
        if(evt.getKeyCode() == KeyEvent.VK_V){
            palabra = palabra + "V";
            pintaPalabra(palabra);
            repaint();
        }        
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(VentanaKerningConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaKerningConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaKerningConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaKerningConjunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaKerningConjunto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
