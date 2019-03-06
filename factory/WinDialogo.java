/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import javax.swing.JOptionPane;

/**
 *
 * @author igonzaleziglesias
 */
public class WinDialogo extends Dialogo {

    @Override
    public void mostrar(String mensage) {
        JOptionPane.showMessageDialog(null,mensage);
    }
}
