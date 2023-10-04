package com.example.controllador;

import com.example.modelo.Persona;
import com.example.vista.Pantalla;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CLASE CONTROLADOR PARA EJECUTAR LA LOGICA
 * DE LOS COMPONENTES
 */
public class PantallaControlador implements ActionListener {
    //Declaras variables
    List<Persona> personas;
    Pantalla pantalla;

    /**
     * CONSTRUSCTOR
     */
    public PantallaControlador(){
        //Instanciar lista de personas
        personas = List.of(
                new Persona("Tamarindo","tamarindo@mail.com","618978548"),
                new Persona("Mango","mango@mail.com","618978548"),
                new Persona("papayita","papayita@mail.com","618978548")
        );
        //instanciar frame
        this.pantalla = new Pantalla();
        //ejecutar los listernes
        addListenersPantalla();
        //establecer el setmodel de comboBox
        this.pantalla.getCbPersonas().setModel(new DefaultComboBoxModel(personas.toArray()));
        this.pantalla.setVisible(true);


    }

    private void addListenersPantalla() {
        //activa la escucha del boton seleccionar
        this.pantalla.getBtnSeleccionar().addActionListener(this);

    }




    @Override
    public void actionPerformed(ActionEvent e) {
        //almacenar el boton seleccionado
        String command = e.getActionCommand();

        if(command == "seleccionar"){
            Persona personaSeleccionada = (Persona) this.pantalla.getCbPersonas().getSelectedItem();
            this.pantalla.getLabelTitulo().setText("Persona seleccionada: ");
            this.pantalla.getLabelPersona().setText(
                    personaSeleccionada.getNombre() + ", " +
                    personaSeleccionada.getEmail() + ", " +
                    personaSeleccionada.getMovil());
        }

    }
}
