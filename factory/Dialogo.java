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
public abstract class Dialogo implements MetodosComunes{//creamos la clase dialogo abstracta implementando la interfaz metodoscomunes
   
    enum Tipo{CONSOLA,VENTANA}
    
     public static Dialogo crearDialogo(Tipo tipo){//elegimos la opcion ventana o consola
        Dialogo dialogoCreado;
        switch (tipo){
            case CONSOLA:
                dialogoCreado=new ConsDialogo();//dialogo por consola
                return dialogoCreado;
            case VENTANA:
                dialogoCreado= new WinDialogo();//dialogo por ventana
                return dialogoCreado;
            default:
                dialogoCreado=null;
                
        }
        return dialogoCreado;//devolvemos un dialogo
    }
}
