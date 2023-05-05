/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.as.arquitetura.swing.singleton;

import javax.swing.JFrame;

public enum DisplayManager {
    INSTANCE;

    private JFrame currentFrame;

    public void showFrame(JFrame frame) {
        if (currentFrame != null) {
            currentFrame.dispose();
        }
        currentFrame = frame;
        currentFrame.setVisible(true);
    }

    public void closeCurrentFrame() {
        if (currentFrame != null) {
            currentFrame.dispose();
            currentFrame = null;
        }
    }
    
    
}
