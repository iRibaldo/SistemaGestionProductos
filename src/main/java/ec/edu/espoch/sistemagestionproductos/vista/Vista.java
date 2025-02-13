/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espoch.sistemagestionproductos.vista;

/**
 *
 * @author SO-LAB1-PC27
 */
public class Vista extends javax.swing.JFrame {

 
    public Vista() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgBoolean = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblEtiquitaNombre = new javax.swing.JLabel();
        lblEtiquetaPrecio = new javax.swing.JLabel();
        txtCampoNombre = new javax.swing.JTextField();
        txtCampoPrecio = new javax.swing.JTextField();
        lblSeccionDisponibilidad = new javax.swing.JLabel();
        rbtDisponible = new javax.swing.JRadioButton();
        rbtNoDisponible = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        lblListaProductos = new javax.swing.JLabel();
        lblMostrarLista = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Sistema de Gestion de Productos");

        lblEtiquitaNombre.setText("Nombre del Producto");

        lblEtiquetaPrecio.setText("Precio del Producto");

        lblSeccionDisponibilidad.setText("Disponibilidad");

        btgBoolean.add(rbtDisponible);
        rbtDisponible.setText("Disponible");

        btgBoolean.add(rbtNoDisponible);
        rbtNoDisponible.setText("No Disponible");

        btnGuardar.setText("G U A R D A R");

        btnMostrar.setText("M O S T R A R");

        lblListaProductos.setText("Lista de Productos");

        lblError.setText("------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblListaProductos)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lblSeccionDisponibilidad))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEtiquitaNombre)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbtDisponible)
                                .addComponent(lblEtiquetaPrecio)
                                .addComponent(btnGuardar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCampoNombre)
                                .addComponent(txtCampoPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnMostrar)
                                .addComponent(rbtNoDisponible))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(lblError)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(lblMostrarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblListaProductos))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEtiquitaNombre)
                            .addComponent(txtCampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEtiquetaPrecio)
                            .addComponent(txtCampoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(lblSeccionDisponibilidad)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtDisponible)
                            .addComponent(rbtNoDisponible))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnMostrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(lblError))
                    .addComponent(lblMostrarLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getNombre (){
        return txtCampoNombre.getText();
    }
    
    public String getPrecio (){
        return txtCampoPrecio.getText();
    }
    
    public boolean getDisponiblidad (){
        return rbtDisponible.isSelected();
    }
    
    public void Error (String text){
        return lblError.setText(text);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgBoolean;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblEtiquetaPrecio;
    private javax.swing.JLabel lblEtiquitaNombre;
    private javax.swing.JLabel lblListaProductos;
    private javax.swing.JLabel lblMostrarLista;
    private javax.swing.JLabel lblSeccionDisponibilidad;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtDisponible;
    private javax.swing.JRadioButton rbtNoDisponible;
    private javax.swing.JTextField txtCampoNombre;
    private javax.swing.JTextField txtCampoPrecio;
    // End of variables declaration//GEN-END:variables
}
