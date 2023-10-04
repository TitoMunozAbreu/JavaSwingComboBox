package com.example.vista;

import javax.swing.*;

public class Pantalla extends JFrame{
    private JPanel contentPane;
    private JComboBox cbPersonas;
    private JButton btnSeleccionar;
    private JLabel labelTitulo;
    private JLabel labelPersona;


    public Pantalla(){
        setContentPane(contentPane);
        setTitle("Papaya");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,350);
        setLocationRelativeTo(null);
    }

    public JComboBox getCbPersonas() {
        return cbPersonas;
    }

    public JButton getBtnSeleccionar() {
        return btnSeleccionar;
    }

    public JLabel getLabelTitulo() {
        return labelTitulo;
    }

    public JLabel getLabelPersona() {
        return labelPersona;
    }
}
