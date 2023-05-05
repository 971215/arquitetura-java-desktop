/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.as.arquitetura.swing;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

public abstract class JFrame extends javax.swing.JFrame{

    private List<JComponent> components = new ArrayList<>();
    
    public void addComponent(JComponent component ){
        this.components.add(component);
    }
    
    public void estylize(){
        ComponentTypeEstylize.estylize(components);
    }
    
}
