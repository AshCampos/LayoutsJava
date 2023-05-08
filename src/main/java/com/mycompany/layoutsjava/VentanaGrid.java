package com.mycompany.layoutsjava;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class VentanaGrid extends Frame {

    private Label lblEtiqueta1;
    private Label lblEtiqueta2;
    private TextField txtCuadro1;
    private TextField txtCuadro2;
    private Button boton1;
    private GridLayout layout;

    public VentanaGrid(String string) throws HeadlessException {
        super(string);
        layout = new GridLayout(3, 2);
        
        this.setSize(600, 800);
        this.setLayout(layout);
        lblEtiqueta1 = new Label("Etiqueta 1");
        this.add(lblEtiqueta1, 0);
        txtCuadro1 = new TextField(30);
        this.add(txtCuadro1, 1);
        lblEtiqueta2 = new Label("Etiqueta 2");
        this.add(lblEtiqueta2, 2);
        txtCuadro2 = new TextField(30);
        this.add(txtCuadro2, 3);
        boton1 = new Button("Presioname");
        this.add(boton1,4);
        
        boton1.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
          String texto = txtCuadro1.getText() + " " + txtCuadro2.getText();
          JOptionPane.showMessageDialog(null, texto);
          
                  }
        });
        this.addWindowListener(new WindowAdapter(){
        @Override 
        public void windowClosing(WindowEvent e){
        System.exit(0);
        }
        });
        this.setVisible(true);
    }

}
