
package jPack_Heladeria;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Josue
 */
public class jFrame_Heladeria extends javax.swing.JFrame {

    /**
     * Creates new form jFrame_Heladeria
     */
    public jFrame_Heladeria() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        ///visualizacion del imagen
        SetImagenLabel(jLabel_Imagen1, "src/jPack_Imagenes/Imagen2.jpg");//visualizacion de la imagen
        SetImagenLabel(jLabel_Imagen2, "src/jPack_Imagenes/Imagen4.jpg");//visualizacion de la imagen
        
        //Agregamos boton por boton 
        buttonGroup_Tipos.add(jRadioButton_Rollito);
          buttonGroup_Tipos.add(jRadioButton_Paleta);
            buttonGroup_Tipos.add(jRadioButton_Sandwich);
              buttonGroup_Tipos.add(jRadioButton_Vasito);
                buttonGroup_Tipos.add(jRadioButton_Combinado);
                          
    jRadioButton_Combinado.setSelected(true); /*Selección por Defecto en RadioButton: (Combinado) */    
        
      if (jRadioButton_Combinado.isSelected()==true){
          
                //Activamos la visualización: 
                    jCheckBox_Leche.setSelected(true);
                        jCheckBox_Chocolate.setSelected(true);
                            jCheckBox_Vainilla.setSelected(true);
                            
                //Desactivamos la visualización:               
                    jCheckBox_Fresa.setVisible(false);
                        jCheckBox_Lucuma.setVisible(false);
                            jCheckBox_Mango.setVisible(false);
                                                    }
                  
             
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_Tipos = new javax.swing.ButtonGroup();
        jPanel_Sabores = new javax.swing.JPanel();
        jCheckBox_Fresa = new javax.swing.JCheckBox();
        jCheckBox_Lucuma = new javax.swing.JCheckBox();
        jCheckBox_Mango = new javax.swing.JCheckBox();
        jCheckBox_Vainilla = new javax.swing.JCheckBox();
        jCheckBox_Chocolate = new javax.swing.JCheckBox();
        jCheckBox_Leche = new javax.swing.JCheckBox();
        jLabel_Titulo = new javax.swing.JLabel();
        jPanel_Tipos = new javax.swing.JPanel();
        jRadioButton_Rollito = new javax.swing.JRadioButton();
        jRadioButton_Paleta = new javax.swing.JRadioButton();
        jRadioButton_Sandwich = new javax.swing.JRadioButton();
        jRadioButton_Vasito = new javax.swing.JRadioButton();
        jRadioButton_Combinado = new javax.swing.JRadioButton();
        jLabel_Resultado = new javax.swing.JLabel();
        jButton_TotalPagar = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();
        jLabel_Imagen1 = new javax.swing.JLabel();
        jLabel_Imagen2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel_Sabores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sabores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jCheckBox_Fresa.setText("Fresa");

        jCheckBox_Lucuma.setText("Lúcuma");

        jCheckBox_Mango.setText("Mango");
        jCheckBox_Mango.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jCheckBox_MangoComponentShown(evt);
            }
        });

        jCheckBox_Vainilla.setText("Vainilla");

        jCheckBox_Chocolate.setText("Chocolate");
        jCheckBox_Chocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ChocolateActionPerformed(evt);
            }
        });

        jCheckBox_Leche.setText("Leche");

        javax.swing.GroupLayout jPanel_SaboresLayout = new javax.swing.GroupLayout(jPanel_Sabores);
        jPanel_Sabores.setLayout(jPanel_SaboresLayout);
        jPanel_SaboresLayout.setHorizontalGroup(
            jPanel_SaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SaboresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_SaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_Fresa)
                    .addComponent(jCheckBox_Leche)
                    .addComponent(jCheckBox_Lucuma)
                    .addComponent(jCheckBox_Mango)
                    .addComponent(jCheckBox_Vainilla)
                    .addComponent(jCheckBox_Chocolate))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel_SaboresLayout.setVerticalGroup(
            jPanel_SaboresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SaboresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox_Fresa)
                .addGap(3, 3, 3)
                .addComponent(jCheckBox_Lucuma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_Mango)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_Vainilla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_Chocolate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_Leche))
        );

        jLabel_Titulo.setFont(new java.awt.Font("Vivaldi", 3, 36)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(153, 102, 255));
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Titulo.setText("Heladería \"Galaxia de Hielo\"");

        jPanel_Tipos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jRadioButton_Rollito.setText("Rollito");
        jRadioButton_Rollito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton_RollitoMouseClicked(evt);
            }
        });
        jRadioButton_Rollito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_RollitoActionPerformed(evt);
            }
        });

        jRadioButton_Paleta.setText("Paleta");
        jRadioButton_Paleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_PaletaActionPerformed(evt);
            }
        });

        jRadioButton_Sandwich.setText("Sandwich ");
        jRadioButton_Sandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_SandwichActionPerformed(evt);
            }
        });

        jRadioButton_Vasito.setText("Vasito");
        jRadioButton_Vasito.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jRadioButton_VasitoComponentAdded(evt);
            }
        });
        jRadioButton_Vasito.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton_VasitoStateChanged(evt);
            }
        });
        jRadioButton_Vasito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_VasitoActionPerformed(evt);
            }
        });

        jRadioButton_Combinado.setText("Combinado");
        jRadioButton_Combinado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_CombinadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_TiposLayout = new javax.swing.GroupLayout(jPanel_Tipos);
        jPanel_Tipos.setLayout(jPanel_TiposLayout);
        jPanel_TiposLayout.setHorizontalGroup(
            jPanel_TiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TiposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_TiposLayout.createSequentialGroup()
                        .addComponent(jRadioButton_Combinado)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(jPanel_TiposLayout.createSequentialGroup()
                        .addGroup(jPanel_TiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton_Sandwich)
                            .addComponent(jRadioButton_Paleta)
                            .addComponent(jRadioButton_Rollito)
                            .addComponent(jRadioButton_Vasito))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel_TiposLayout.setVerticalGroup(
            jPanel_TiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TiposLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jRadioButton_Rollito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_Paleta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton_Sandwich)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_Vasito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_Combinado)
                .addGap(17, 17, 17))
        );

        jLabel_Resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        jButton_TotalPagar.setBackground(new java.awt.Color(153, 255, 153));
        jButton_TotalPagar.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jButton_TotalPagar.setText("Total a Pagar");
        jButton_TotalPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153)));
        jButton_TotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TotalPagarActionPerformed(evt);
            }
        });

        jButton_Salir.setBackground(new java.awt.Color(255, 153, 102));
        jButton_Salir.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jButton_Salir.setText("Salir");
        jButton_Salir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 255, 0)));
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        jLabel_Imagen1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_Imagen2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel_Tipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel_Sabores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_TotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Imagen1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jLabel_Imagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel_Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jPanel_Tipos, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel_Sabores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_TotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel_Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox_ChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ChocolateActionPerformed

    }//GEN-LAST:event_jCheckBox_ChocolateActionPerformed

    private void jButton_TotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TotalPagarActionPerformed
         //declaramos variable Mensaje de tipo Strig
         String Mensaje  = "Precio por el helado: S/. ";
          double Precio = 0;
          
     if (jRadioButton_Rollito.isSelected()==true){
            Precio = 20;
            jLabel_Resultado.setText(Mensaje + Precio);
                                                 }
        
             else if(jRadioButton_Paleta.isSelected() == true){
                     Precio = 30;
                     jLabel_Resultado.setText(Mensaje + Precio);
                                                             }
             
                     else if(jRadioButton_Sandwich.isSelected() == true){
                             Precio = 50;
                             jLabel_Resultado.setText(Mensaje + Precio);
                                                                        }
                     
                              else if(jRadioButton_Vasito.isSelected() == true){
                                        Precio = 25;
                                         jLabel_Resultado.setText(Mensaje + Precio);
                                                                               }
                              
                                        else if(jRadioButton_Combinado.isSelected() == true){
                                                 Precio = 60;
                                                  jLabel_Resultado.setText(Mensaje + Precio);
                                                                                            }
        
        //Verificamos los Ingredientes seleccionado:
        if(jCheckBox_Fresa.isSelected()) {
            Precio = Precio + 3 ;
            jLabel_Resultado.setText(Mensaje + Precio);
                                         }
        
            if(jCheckBox_Lucuma.isSelected()) {
                Precio = Precio + 3.50 ;
                jLabel_Resultado.setText(Mensaje + Precio);
                                              }
            
                if(jCheckBox_Mango.isSelected()) {
                    Precio = Precio + 2 ;
                    jLabel_Resultado.setText(Mensaje + Precio);
                                                 }
                
                    if(jCheckBox_Vainilla.isSelected()) {
                        Precio = Precio + 2 ;
                        jLabel_Resultado.setText(Mensaje + Precio); 
                                                        }           
                    
                    if(jCheckBox_Chocolate.isSelected()) {
                        Precio = Precio + 3 ;
                        jLabel_Resultado.setText(Mensaje + Precio); 
                                                         } 
                    
                    if(jCheckBox_Leche.isSelected()) {
                        Precio = Precio + 2.50 ;
                        jLabel_Resultado.setText(Mensaje + Precio); 
                                                     }                                        
         

                    
    }//GEN-LAST:event_jButton_TotalPagarActionPerformed

    private void jRadioButton_RollitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_RollitoActionPerformed

             if (jRadioButton_Rollito.isSelected()==true){ 
                 
                //Activamos la visualización:
                    jCheckBox_Mango.setVisible(true);
                        jCheckBox_Fresa.setVisible(true);
                            jCheckBox_Lucuma.setVisible(true);
                                jCheckBox_Chocolate.setVisible(true);
                                    jCheckBox_Leche.setVisible(true);
                                    
                //Desactivamos la visualización: 
                    jCheckBox_Vainilla.setVisible(false);

                //Mostramos los CheckBox Desactivados
                    jCheckBox_Mango.setSelected(false);
                        jCheckBox_Fresa.setSelected(false);
                            jCheckBox_Lucuma.setSelected(true);
                                jCheckBox_Chocolate.setSelected(false);
                                    jCheckBox_Leche.setSelected(false);                        
                                                        }

    }//GEN-LAST:event_jRadioButton_RollitoActionPerformed

    private void jRadioButton_PaletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_PaletaActionPerformed
           
             if (jRadioButton_Paleta.isSelected()==true){  
                 
                //Activamos la visualización:                    
                    jCheckBox_Fresa.setVisible(true);
                        jCheckBox_Mango.setVisible(true);
                            jCheckBox_Lucuma.setVisible(true);
                                jCheckBox_Chocolate.setVisible(true);
                 
                //Desactivamos la visualización: 
                    jCheckBox_Vainilla.setVisible(false);
                        jCheckBox_Leche.setVisible(false);
                 
                //Mostramos los CheckBox Desactivados 
                    jCheckBox_Fresa.setSelected(false);
                        jCheckBox_Mango.setSelected(true);
                            jCheckBox_Lucuma.setSelected(false);
                                jCheckBox_Chocolate.setSelected(false);
                                                       }
        
        
        
    }//GEN-LAST:event_jRadioButton_PaletaActionPerformed

    private void jRadioButton_SandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_SandwichActionPerformed
        // TODO add your handling code here:
     
             if (jRadioButton_Sandwich.isSelected()==true){    
                 
                //Activamos la visualización:    
                    jCheckBox_Chocolate.setVisible(true);   
                    
                //Desactivamos la visualización:
                    jCheckBox_Fresa.setVisible(false);
                        jCheckBox_Lucuma.setVisible(false);
                            jCheckBox_Mango.setVisible(false);                        
                                jCheckBox_Vainilla.setVisible(false);
                                    jCheckBox_Leche.setVisible(false);
                    
                //Mostramos los CheckBox Activados                         
                    jCheckBox_Chocolate.setSelected(true);

                                                         }
             
        
    }//GEN-LAST:event_jRadioButton_SandwichActionPerformed

    private void jRadioButton_VasitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_VasitoActionPerformed

              if (jRadioButton_Vasito.isSelected()==true){ 
                  
                //Activamos la visualización:     
                    jCheckBox_Lucuma.setVisible(true);
                        jCheckBox_Vainilla.setVisible(true);
                            jCheckBox_Chocolate.setVisible(true);
        
                //Desactivamos la visualización:
                        jCheckBox_Fresa.setVisible(false);
                            jCheckBox_Mango.setVisible(false);
                                jCheckBox_Leche.setVisible(false);   
                  
                 //Mostramos los CheckBox Desactivados  
                    jCheckBox_Lucuma.setSelected(true);
                        jCheckBox_Vainilla.setSelected(false);
                            jCheckBox_Chocolate.setSelected(false);
                                                       }
        
        
    }//GEN-LAST:event_jRadioButton_VasitoActionPerformed

    private void jRadioButton_CombinadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_CombinadoActionPerformed

                if (jRadioButton_Combinado.isSelected()==true){  
    
                //Activamos la visualización:
                        jCheckBox_Leche.setVisible(true);
                            jCheckBox_Chocolate.setVisible(true);
                                jCheckBox_Vainilla.setVisible(true);
                    
                //Desactivamos la visualización:               
                    jCheckBox_Fresa.setVisible(false);
                        jCheckBox_Lucuma.setVisible(false);
                            jCheckBox_Mango.setVisible(false);
                    
                //Mostramos los CheckBox Activados     
                        jCheckBox_Leche.setSelected(true);
                            jCheckBox_Chocolate.setSelected(true);
                                jCheckBox_Vainilla.setSelected(true);
                                                             }         
  
    }//GEN-LAST:event_jRadioButton_CombinadoActionPerformed

    private void jRadioButton_VasitoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton_VasitoStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButton_VasitoStateChanged

    private void jRadioButton_VasitoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jRadioButton_VasitoComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_VasitoComponentAdded

    private void jRadioButton_RollitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton_RollitoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_RollitoMouseClicked

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed

        //Realizamos la acción de Salir
        System.exit(0);
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jCheckBox_MangoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jCheckBox_MangoComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_MangoComponentShown

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
            java.util.logging.Logger.getLogger(jFrame_Heladeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrame_Heladeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrame_Heladeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrame_Heladeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrame_Heladeria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_Tipos;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JButton jButton_TotalPagar;
    private javax.swing.JCheckBox jCheckBox_Chocolate;
    private javax.swing.JCheckBox jCheckBox_Fresa;
    private javax.swing.JCheckBox jCheckBox_Leche;
    private javax.swing.JCheckBox jCheckBox_Lucuma;
    private javax.swing.JCheckBox jCheckBox_Mango;
    private javax.swing.JCheckBox jCheckBox_Vainilla;
    private javax.swing.JLabel jLabel_Imagen1;
    private javax.swing.JLabel jLabel_Imagen2;
    private javax.swing.JLabel jLabel_Resultado;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JPanel jPanel_Sabores;
    private javax.swing.JPanel jPanel_Tipos;
    private javax.swing.JRadioButton jRadioButton_Combinado;
    private javax.swing.JRadioButton jRadioButton_Paleta;
    private javax.swing.JRadioButton jRadioButton_Rollito;
    private javax.swing.JRadioButton jRadioButton_Sandwich;
    private javax.swing.JRadioButton jRadioButton_Vasito;
    // End of variables declaration//GEN-END:variables
 
    //creamos una clase nueva para insertar imagenes
    private void SetImagenLabel(JLabel labelName, String root){
          ImageIcon image = new ImageIcon(root); 
 Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
          labelName.setIcon(icon);
          this.repaint();
        }

}

