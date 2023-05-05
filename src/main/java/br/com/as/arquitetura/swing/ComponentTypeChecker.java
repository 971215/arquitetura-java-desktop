/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.as.arquitetura.swing;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ComponentTypeChecker {
    public static boolean isJButton(JComponent component) {
        return component instanceof JButton;
    }

    public static boolean isJTextField(JComponent component) {
        return component instanceof JTextField;
    }

    public static boolean isJLabel(JComponent component) {
        return component instanceof JLabel;
    }
}

