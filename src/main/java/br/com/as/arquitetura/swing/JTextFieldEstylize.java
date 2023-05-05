/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.as.arquitetura.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class JTextFieldEstylize extends JTextField {
    
    
    public static void estylize(JTextField jTextField){
         jTextField.setBackground(Color.WHITE);
         
        // Definir a fonte
        jTextField.setFont(new Font("Arial", Font.PLAIN, 18));
        // Definir a borda
        jTextField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        // Definir o alinhamento do texto
        jTextField.setHorizontalAlignment(JTextField.LEFT);
        // Definir o comportamento ao pressionar a tecla Enter
        jTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // fazer algo quando a tecla Enter for pressionada
            }
        });
    }
      // construtor padrão
    public JTextFieldEstylize() {
        super();
        configurar();
    }

    // construtor com tamanho definido
    public JTextFieldEstylize(int tamanho) {
        super(tamanho);
        configurar();
    }

    // método para configurar as propriedades do JTextField
    private void configurar() {
        // Definir a cor de fundo
        setBackground(Color.WHITE);
        // Definir a fonte
        setFont(new Font("Arial", Font.PLAIN, 12));
        // Definir a borda
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
        // Definir o alinhamento do texto
        setHorizontalAlignment(JTextField.LEFT);
        // Definir o comportamento ao pressionar a tecla Enter
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // fazer algo quando a tecla Enter for pressionada
            }
        });
    }
    
}
