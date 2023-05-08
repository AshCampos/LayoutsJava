package com.mycompany.layoutsjava;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;

public class Ventana extends Frame {
    private Label lblEtiqueta1;
    private Label lblEtiqueta2; 
    private TextField txtCuadro1;
    private TextField txtCuadro2;
    private Button boton1;
    private FlowLayout layout;

    public Ventana(String string) throws HeadlessException {
        super(string);
        layout = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout);
        lblEtiqueta1 = new Label("Etiqueta 1");
        this.add(lblEtiqueta1);
        txtCuadro1 = new TextField(60);
        this.add(txtCuadro1);
        lblEtiqueta2 = new Label("Etiqueta 2");
        this.add(lblEtiqueta2);
        txtCuadro2 = new TextField(60);
        this.add(txtCuadro2);
        this.setSize(800,600);
        this.setVisible(true);
    }
    
}
