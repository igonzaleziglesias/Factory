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
public abstract class Dialogo implements MetodosComunes{
   
    enum Tipo{CONSOLA,VENTANA}
    
     public static Dialogo crearDialogo(Tipo tipo){
        Dialogo dialogoCreado;
        switch (tipo){
            case CONSOLA:
                dialogoCreado=new ConsDialogo();
                return dialogoCreado;
            case VENTANA:
                dialogoCreado= new WinDialogo();
                return dialogoCreado;
            default:
                dialogoCreado=null;
                
        }
        return dialogoCreado;
    }
}
