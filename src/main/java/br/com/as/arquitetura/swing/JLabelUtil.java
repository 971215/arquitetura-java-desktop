/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.as.arquitetura.swing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author VIBE
 */
public class JLabelUtil extends javax.swing.JLabel {
    
    private void getJLabel(JLabel jLabel){
        jLabel.setFont(getFont().deriveFont(Font.BOLD | Font.ITALIC)); // texto em negrito e itálico
        jLabel.setForeground(Color.BLUE); // cor do texto
    }
    
    public static void estiliza(JLabel jLabel){
        JLabelUtil util = new JLabelUtil();
        util.getJLabel(jLabel);
    }
    
}
