
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import  static javax.swing.JOptionPane.*;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Ventana extends javax.swing.JFrame implements WindowListener{
    Lienzo l;
    BaseDeDatos ed;
    
    
    public Ventana() {
        initComponents();
        ed = new BaseDeDatos();
        l = new Lienzo(jScrollPane1.getWidth(),jScrollPane1.getHeight(),ed.lp);
        l.setLocation(0, 0);
        jScrollPane1.setViewportView(l);
        jMINuevo.setEnabled(false);
        jMIEliminar.setEnabled(false);
        jMIEliminarS.setEnabled(false);
        jMIGuardar.setEnabled(false);
        addWindowListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMArchivo = new javax.swing.JMenu();
        jMINuevo = new javax.swing.JMenuItem();
        jMIAbrir = new javax.swing.JMenuItem();
        jMIGuardar = new javax.swing.JMenuItem();
        jMIGuardarC = new javax.swing.JMenuItem();
        jMEdicion = new javax.swing.JMenu();
        jMEliminar = new javax.swing.JMenu();
        jMIEliminarS = new javax.swing.JMenuItem();
        jMIEliminar = new javax.swing.JMenuItem();
        jMIAgregar = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenu1.setText("File");
        jMenuBar4.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar4.add(jMenu2);

        jMenu8.setText("File");
        jMenuBar5.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar5.add(jMenu9);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseDragged(evt);
            }
        });

        jMArchivo.setText("Archivo.");
        jMArchivo.setPreferredSize(new java.awt.Dimension(60, 10));

        jMINuevo.setText("Nuevo");
        jMINuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMINuevoActionPerformed(evt);
            }
        });
        jMArchivo.add(jMINuevo);

        jMIAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMIAbrir.setText("Abrir...");
        jMIAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMIAbrirMouseClicked(evt);
            }
        });
        jMIAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAbrirActionPerformed(evt);
            }
        });
        jMArchivo.add(jMIAbrir);

        jMIGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMIGuardar.setText("Guardar");
        jMIGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGuardarActionPerformed(evt);
            }
        });
        jMArchivo.add(jMIGuardar);

        jMIGuardarC.setText("Guardar como...");
        jMIGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGuardarCActionPerformed(evt);
            }
        });
        jMArchivo.add(jMIGuardarC);

        jMenuBar1.add(jMArchivo);

        jMEdicion.setText("Edicion.");
        jMEdicion.setPreferredSize(new java.awt.Dimension(60, 20));

        jMEliminar.setText("Eliminar.");

        jMIEliminarS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMIEliminarS.setText("Eliminar Simple.");
        jMIEliminarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEliminarSActionPerformed(evt);
            }
        });
        jMEliminar.add(jMIEliminarS);

        jMIEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMIEliminar.setText("Eliminar Especifico.");
        jMIEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEliminarActionPerformed(evt);
            }
        });
        jMEliminar.add(jMIEliminar);

        jMEdicion.add(jMEliminar);

        jMIAgregar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMIAgregar.setText("Agregar Nodo.");
        jMIAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAgregarActionPerformed(evt);
            }
        });
        jMEdicion.add(jMIAgregar);

        jMenuBar1.add(jMEdicion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAgregarActionPerformed
        Object val = showInputDialog(this,"Valor...");
        if(val == null){return;}
        int prioridad;
    try{ prioridad = Integer.parseInt(showInputDialog(this,"Prioridad..."));}catch(Exception err){return;}
        ed.lp.insertar(val,prioridad);
        l.repaint();
        if(ed.lp != null){
        jMIEliminar.setEnabled(true);
        jMIEliminarS.setEnabled(true);}
    }//GEN-LAST:event_jMIAgregarActionPerformed

    private void jMIAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAbrirActionPerformed
        if(ed.url != null){
            BaseDeDatos temp = new BaseDeDatos(ed.url);
        if(!ed.lp.igual(temp.lp)){
            int opcion = showConfirmDialog(this,"Desea guardar cambios?");
            if(opcion == YES_OPTION){ed.guardar();}
            if(opcion == CANCEL_OPTION){return;}
                }
                }
        JFileChooser img=new javax.swing.JFileChooser(new File (".").getAbsolutePath ());
        img.setFileFilter(new FileNameExtensionFilter("EDD para el miniProyecto.","EDD"));
        if(img.showOpenDialog(this)==JFileChooser.APPROVE_OPTION ){
            String formato = img.getSelectedFile().getPath();
            formato = formato.substring(formato.length()-3,formato.length());
            if(formato.equals("EDD")){
            ed = new BaseDeDatos(img.getSelectedFile().getPath());
            l.lp = ed.lp;
            l.repaint();
            jMIGuardar.setEnabled(true);
            jMINuevo.setEnabled(true);
            if(!ed.lp.estaVacia()){
            jMIEliminar.setEnabled(true);
            jMIEliminarS.setEnabled(true);}
            }else{
                showMessageDialog(this,"Formato invalido!!!");
            }
        }
    }//GEN-LAST:event_jMIAbrirActionPerformed

    private void jMIAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMIAbrirMouseClicked

    }//GEN-LAST:event_jMIAbrirMouseClicked

    private void jMINuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMINuevoActionPerformed
        if(ed.url != null){
            BaseDeDatos temp = new BaseDeDatos(ed.url);
        if(!ed.lp.igual(temp.lp)){
            int opcion = showConfirmDialog(this,"Desea guardar cambios?");
            if(opcion == YES_OPTION){ed.guardar();}
            if(opcion == CANCEL_OPTION){return;}
                    }
                }
        ed = new BaseDeDatos();
        l.lp = ed.lp;
        jMIGuardar.setEnabled(false);
        jMINuevo.setEnabled(false);
        jMIEliminar.setEnabled(false);
        jMIEliminarS.setEnabled(false);
        l.repaint();
    }//GEN-LAST:event_jMINuevoActionPerformed

    private void jMIEliminarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEliminarSActionPerformed
        ed.lp.eliminar();
        if(ed.lp.estaVacia()){
        jMIEliminar.setEnabled(false);
        jMIEliminarS.setEnabled(false);}
        l.repaint();
    }//GEN-LAST:event_jMIEliminarSActionPerformed

    private void jMIEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEliminarActionPerformed
        String e = showInputDialog(this,"Cual desea eliminar?");   
        if(!e.equals("")){
            ed.lp.eliminar(e);
            l.repaint();
            }
        if(ed.lp.estaVacia()){
        jMIEliminar.setEnabled(false);
        jMIEliminarS.setEnabled(false);}
    }//GEN-LAST:event_jMIEliminarActionPerformed

    private void jMIGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGuardarActionPerformed
        if(ed.url != null){ed.guardar();}
    }//GEN-LAST:event_jMIGuardarActionPerformed

    private void jMIGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGuardarCActionPerformed
        guardarComo();
    }//GEN-LAST:event_jMIGuardarCActionPerformed

    private void jScrollPane1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseDragged

    }//GEN-LAST:event_jScrollPane1MouseDragged

    private void guardarComo(){
        JFileChooser img=new javax.swing.JFileChooser(new File (".").getAbsolutePath ());
        img.setFileFilter(new FileNameExtensionFilter("EDD para el miniProyecto.","EDD"));
        if(img.showSaveDialog(this) == JFileChooser.APPROVE_OPTION ){
            String path = img.getSelectedFile().getPath()+".EDD";
            ed.url = path;
            ed.guardar();
            jMIGuardar.setEnabled(true);
            jMINuevo.setEnabled(true);
        } 
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMArchivo;
    private javax.swing.JMenu jMEdicion;
    private javax.swing.JMenu jMEliminar;
    private javax.swing.JMenuItem jMIAbrir;
    private javax.swing.JMenuItem jMIAgregar;
    private javax.swing.JMenuItem jMIEliminar;
    private javax.swing.JMenuItem jMIEliminarS;
    private javax.swing.JMenuItem jMIGuardar;
    private javax.swing.JMenuItem jMIGuardarC;
    private javax.swing.JMenuItem jMINuevo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {        
        if(ed.lp.estaVacia() && ed.url == null){return;}
         if(ed.url != null){
            BaseDeDatos temp = new BaseDeDatos(ed.url);
            if(ed.lp.igual(temp.lp)){return;}
         }
        if(showConfirmDialog(this,"Desea guardar cambios?") != YES_OPTION){return;}
        if(ed.url == null){
        guardarComo();
        }else{
            ed.guardar();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) { }

    @Override
    public void windowDeactivated(WindowEvent e) {}
}
