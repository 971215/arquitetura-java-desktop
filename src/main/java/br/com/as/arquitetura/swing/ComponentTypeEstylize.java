/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.as.arquitetura.swing;

import java.util.List;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ComponentTypeEstylize {

    public static void estylize(List<JComponent> components) {

        components.forEach(component -> {
            if (ComponentTypeChecker.isJButton(component)) {
                JButtonEstylize.estylize((JButton) component);
            }

            if (ComponentTypeChecker.isJLabel(component)) {
                JLabelEstylize.estylize((JLabel) component);
            }

            if (ComponentTypeChecker.isJTextField(component)) {
                JTextFieldEstylize.estylize((JTextField) component);
            }
        });

    }

}
