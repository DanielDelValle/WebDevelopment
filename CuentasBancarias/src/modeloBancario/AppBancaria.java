/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBancario;

/**
 *
 * @author Daniel
 */
public class AppBancaria extends javax.swing.JFrame {
        CuentaCorriente cc = new CuentaCorriente();   //creo 2 clases vacías para usarlas de manera global en todos los métodos
        CuentaAhorro ca = new CuentaAhorro();        


    
    public AppBancaria() {
        initComponents();

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actualizarSaldo = new javax.swing.JButton();
        retirar = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        crearCorriente = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        doubleInteres = new javax.swing.JTextField();
        doubleCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        crearAhorro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        txtNumeroCuenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        actualizarSaldo.setText("Actualizar Saldo");
        actualizarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarSaldoActionPerformed(evt);
            }
        });

        retirar.setText("Retirada");
        retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarActionPerformed(evt);
            }
        });

        ingresar.setText("Ingreso");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        crearCorriente.setText("Crear Cuenta Corriente");
        crearCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCorrienteActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Direccion");

        jLabel3.setText("Telefono");

        jLabel4.setText("Tipo Interes");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        doubleInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleInteresActionPerformed(evt);
            }
        });

        doubleCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleCantidadActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad");

        crearAhorro.setText("Crear Cuenta Ahorro");
        crearAhorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearAhorroActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        txtNumeroCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCuentaActionPerformed(evt);
            }
        });

        jLabel6.setText("Numero Cuenta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(retirar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(crearCorriente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(crearAhorro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doubleInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(doubleCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 28, Short.MAX_VALUE)
                                .addComponent(actualizarSaldo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doubleInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearCorriente)
                    .addComponent(crearAhorro))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresar)
                    .addComponent(actualizarSaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(doubleCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(retirar))
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void crearCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCorrienteActionPerformed
        doubleInteres.setText("0.15");
        Cliente c = new Cliente(1001, txtNombre.getText(), txtDireccion.getText(), txtTelefono.getText());
        cc.setSaldo(0);
        cc.setNumeroCuenta(101);
        cc.setTitular(c);
        txtArea.setText("Bienvenido, Don " + txtNombre.getText() + "\n" + "Usted ha creado una Cuenta Corriente" + "\n" + "\n" +
        "Datos de contacto: "+ "\n" +
        " - Direccion : " + c.getDireccion()+ "\n" +
        " - Telefono :" + c.getTelefono()+ "\n" + "\n" +
        "Datos de la cuenta: " + "\n" +
        " - Numero de cliente: " +c.getIdCliente()+ "\n" +
        " - Numero de cuenta: "+ cc.getNumeroCuenta()+ "\n" +
        " - Interes Fijo: 0.15% \n" +
        " - Saldo Mínimo Requerido: Ninguno (admite descubiertos, consulte sus condiciones) \n \n");
                
             
    }//GEN-LAST:event_crearCorrienteActionPerformed
    
    
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        String chequeo = txtNumeroCuenta.getText();
        if (chequeo.equals(String.valueOf(cc.getNumeroCuenta()))){
            cc.ingresar(Double.parseDouble(doubleCantidad.getText()));
            txtArea.setText("Ha ingresado usted " + doubleCantidad.getText() + " €uros " + "en la cuenta numero " + txtNumeroCuenta.getText()+System.lineSeparator()
            + "Su nuevo saldo es "+ cc.getSaldo() + " €uros" + System.lineSeparator()+ System.lineSeparator());
        }
        else if (chequeo.equals(String.valueOf(ca.getNumeroCuenta()))){
            ca.ingresar(Double.parseDouble(doubleCantidad.getText()));
            txtArea.setText("Ha ingresado usted " + doubleCantidad.getText() + " €uros " + "en la cuenta numero " + txtNumeroCuenta.getText()+System.lineSeparator()
        + "Su nuevo saldo es "+ ca.getSaldo() + " €uros" + System.lineSeparator()+ System.lineSeparator());
        }

       
    }//GEN-LAST:event_ingresarActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void doubleCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doubleCantidadActionPerformed

    private void doubleInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleInteresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doubleInteresActionPerformed

    private void crearAhorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearAhorroActionPerformed
        double interes = Double.parseDouble(doubleInteres.getText());
        Cliente c = new Cliente(2002, txtNombre.getText(), txtDireccion.getText(), txtTelefono.getText());
        ca.setSaldo(0);
        ca.setNumeroCuenta(202);
        ca.setTitular(c);
        ca.setInteresVariable(interes);
        txtArea.setText("Bienvenido, Don " + txtNombre.getText() + "\n" + "Usted ha creado una Cuenta Corriente" + "\n" + "\n" +
        "Datos de contacto: "+ "\n" +
        " - Direccion : " + c.getDireccion()+ "\n" +
        " - Telefono :" + c.getTelefono()+ "\n" + "\n" +
        "Datos de la cuenta: " + "\n" +
        " - Numero de cliente: " +c.getIdCliente()+ "\n" +
        " - Numero de cuenta: "+ ca.getNumeroCuenta()+ "\n" +
        " - Interes Variable: "+ ca.getInteresVariable() +"\n" + 
        " - Saldo Mínimo Requerido: 500€uros \n \n");
    }//GEN-LAST:event_crearAhorroActionPerformed

    private void actualizarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarSaldoActionPerformed
        String chequeo = txtNumeroCuenta.getText();  //creo esta variable para simplificar al identificar que la cuenta introducida sea correcta y esté en memoria
        if (chequeo.equals(String.valueOf(ca.getNumeroCuenta()))){  
            ca.actualizarSaldo();            
            txtArea.append("Estimado Don "+ txtNombre.getText()+":"+ System.lineSeparator() +"Su saldo en la cuenta numero " + txtNumeroCuenta.getText()+ ", tras añadir el interés anual variable del "+ System.lineSeparator() +
            ca.getInteresVariable()+ "% es "+ ca.getSaldo()+ System.lineSeparator()+ System.lineSeparator());
   
        }
        else if(chequeo.equals(String.valueOf(cc.getNumeroCuenta()))){
            cc.actualizarSaldo();
            txtArea.append("Estimado Don "+ txtNombre.getText()+":"+ System.lineSeparator()+ "Su saldo en la cuenta numero " + txtNumeroCuenta.getText()+ ", tras añadir el interés anual fijo del "+ System.lineSeparator() +
            "0.15 % es "+ cc.getSaldo()+ System.lineSeparator()+ System.lineSeparator());
        }


    }//GEN-LAST:event_actualizarSaldoActionPerformed

    private void retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarActionPerformed
        String chequeo = txtNumeroCuenta.getText();
        
        if (chequeo.equals(String.valueOf(cc.getNumeroCuenta()))){        
           cc.retirar((Double.parseDouble(doubleCantidad.getText())));
           txtArea.append("Ha retirado usted " + doubleCantidad.getText() + " €uros de la cuenta "+ txtNumeroCuenta.getText()
           + System.lineSeparator()+ "Su nuevo saldo es "+ cc.getSaldo() + " €uros"+ System.lineSeparator()+ System.lineSeparator());
        }
        
        if (chequeo.equals(String.valueOf(ca.getNumeroCuenta()))){
            if (ca.saldo - Double.parseDouble(doubleCantidad.getText())>= ca.saldoMinimo){ //si el saldo a retirar es menor que el mínimo
                ca.retirar(Double.parseDouble(doubleCantidad.getText()));
                txtArea.append("Ha retirado usted " + doubleCantidad.getText() + " €uros de la cuenta "+ txtNumeroCuenta.getText() 
                + System.lineSeparator() + "Su nuevo saldo es "+ ca.getSaldo() + " €uros"+ System.lineSeparator()+ System.lineSeparator());
            }
        
            else{
                txtArea.append("La cantidad que quiere retirar dejaría su cuenta" + System.lineSeparator()+ "por debajo del saldo mínimo de "+ ca.saldoMinimo +"€uros"
                        + System.lineSeparator()+" - Por favor, introduzca una cantidad menor a retirar"+ System.lineSeparator()+ System.lineSeparator());
                
                }       
                 
        }
    }//GEN-LAST:event_retirarActionPerformed

    private void txtNumeroCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(AppBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppBancaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarSaldo;
    private javax.swing.JButton crearAhorro;
    private javax.swing.JButton crearCorriente;
    private javax.swing.JTextField doubleCantidad;
    private javax.swing.JTextField doubleInteres;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton retirar;
    private javax.swing.JButton salir;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroCuenta;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}