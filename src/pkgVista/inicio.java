/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVista;
import com.sun.awt.AWTUtilities;
import pkglogica.clsCargar;
/**
 *
 * @author GustavoF
 */
public final class inicio extends java.awt.Frame {

    /**
     * Creates new form inicio
     */
    double i=50 ,j=1;
    clsCargar hilo;
    public inicio() {
        initComponents();
        iniciar();
        
        
    }

    
    public void iniciar (){
    setLocationRelativeTo(null);
    hilo  = new clsCargar(getProgreso());
     hilo.start();
     hilo=null;
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Progreso = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Progreso.setBackground(new java.awt.Color(73, 175, 141));
        Progreso.setForeground(new java.awt.Color(51, 51, 51));
        Progreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Iniciando "));
        Progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ProgresoStateChanged(evt);
            }
        });
        add(Progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agp.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void ProgresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ProgresoStateChanged
          
        if(getProgreso().getValue()==i){
        if(j!=101){
        AWTUtilities.setWindowOpacity(this, Float.valueOf((100-j)/100+"f"));
        i++;
        j+=2;
     }
      if (getProgreso().getValue()>99){
        this.dispose();
        
        Bienvenida frame = new Bienvenida();
        frame.setSize(frame.getPreferredSize());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
      }   
      
     }
    }//GEN-LAST:event_ProgresoStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Progreso;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the progreso
     */
    public javax.swing.JProgressBar getProgreso() {
        return Progreso;
    }

    /**
     * @param progreso the progreso to set
     */
    public void setProgreso(javax.swing.JProgressBar progreso) {
        this.Progreso = progreso;
    }
}
