/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author igonzaleziglesias
 */
public class ConsDialogo extends Dialogo {//extiende de la superclase Dialogo

    @Override
    public void mostrar(String mensage) {//definimos el metodo a usar
        System.out.println(mensage);
    }
    
}
