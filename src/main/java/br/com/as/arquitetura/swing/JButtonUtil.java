/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.as.arquitetura.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

/**
 *
 * @author VIBE
 */
public class JButtonUtil extends javax.swing.JButton {

    public JButtonUtil() {

    }

    public static void estiliza(List<JButton> buttons) {       
    buttons.forEach(button -> estiliza(button));
}
        

    
    
     private static void estiliza(JButton button) {
        button.setOpaque(true);
        button.setBackground(CollorConstants.BACKGROUND_DEFAULT_BUTTON);
        button.setForeground(CollorConstants.FOREGROUND_DEFAULT_BUTTON);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        button.setFocusPainted(false);
        button.setPreferredSize(new Dimension(273, 40)); // tamanho padronizado
        button.setMinimumSize(new Dimension(273, 40)); // tamanho mínimo
        button.setMaximumSize(new Dimension(273, 40)); // tamanho máximo        
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(CollorConstants.FOREGROUND_DEFAULT_BUTTON);
                button.setForeground(CollorConstants.BACKGROUND_DEFAULT_BUTTON);
                button.setBorder(BorderFactory.createLineBorder(CollorConstants.FOREGROUND_DEFAULT_BUTTON, 2));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(CollorConstants.BACKGROUND_DEFAULT_BUTTON);
                button.setForeground(CollorConstants.FOREGROUND_DEFAULT_BUTTON);
                button.setBorder(BorderFactory.createLineBorder(CollorConstants.BACKGROUND_DEFAULT_BUTTON, 2));

            }

        });

    }

}
