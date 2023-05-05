/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.as.arquitetura.swing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class JLabelEstylize extends javax.swing.JLabel {

    private void getJLabel(JLabel jLabel) {
        JLabel label = new JLabel("Exemplo de JLabel");
        jLabel.setFont(new Font("Arial", Font.BOLD, 12));
        jLabel.setForeground(Color.BLACK);
        //jLabel.setBackground(CollorConstants.BACKGROUND_DEFAULT_BUTTON);
        jLabel.setOpaque(true);
        jLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // adiciona uma borda vazia de 10 pixels em cada lado

// para alinhar o texto no centro da label, você pode usar o método setHorizontalAlignment()
        label.setHorizontalAlignment(JLabel.CENTER);
    }

    public static void estylize(JLabel jLabel) {
        JLabelEstylize util = new JLabelEstylize();
        util.getJLabel(jLabel);
    }

}
