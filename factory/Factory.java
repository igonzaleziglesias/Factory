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
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//damos valores y probamos
        // TODO code application logic here
        Dialogo miDialogo;
        miDialogo = Dialogo.crearDialogo(Dialogo.Tipo.CONSOLA);
        miDialogo.mostrar("HOLA DESDE UNA CONSOLA");
        Dialogo otroDialogo = Dialogo.crearDialogo(Dialogo.Tipo.VENTANA);
        otroDialogo.mostrar("HOLA DESDE UNA VENTANA");
    }
    
}
