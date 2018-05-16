package com.example.sauceda.patronmvp.Interactor;

import com.example.sauceda.patronmvp.Presentador.PresentadorInterface;

/**
 * Created by sauceda on 15/05/18.
 */


//La clase Interactor hace las operaciones o funciona como si fuera la lógica del negocio
public class InteractorClass implements InteractorInterface{

    PresentadorInterface presentador;
    double valorfrecuencia=80.0; //Variable inicializada para aumentar o disminuir la Frecuencia

    public InteractorClass(PresentadorInterface presentador)
    {
        this.presentador = presentador;
    }

    @Override
    public void cambiarEstacion(String camEstacion) {
        String estadoEstacion;

        //EL Valor Que llegó sea AM o FM se envía al metodo mostrarEstadoEstacion
        switch (camEstacion){
            case "AM":
                estadoEstacion = "AM";
                presentador.mostrarEstadoEstacion(estadoEstacion);//Devuelve al presentador el valor
            break;
            case "FM":
                estadoEstacion ="FM";
                presentador.mostrarEstadoEstacion(estadoEstacion);
            break;
        }
    }

    @Override
    public void cambiarFrecuencia(String camFrecuencia) {
        double actualFrecuencia;
        switch (camFrecuencia){
            case "aumentar":
                actualFrecuencia=valorfrecuencia+0.1;
                valorfrecuencia=actualFrecuencia;
                presentador.mostrarFrecuencia(String.valueOf(String.format("%.1f",actualFrecuencia)));
                //Se Convierte la VAriable para enviarla al presentador y que solo sea de un decimal
                break;
            case  "disminuir":
                actualFrecuencia=valorfrecuencia-0.1;
                valorfrecuencia=actualFrecuencia;
                presentador.mostrarFrecuencia(String.valueOf(String.format("%.1f",actualFrecuencia)));
                //Se Convierte la VAriable para enviarla al presentador y que solo sea de un decimal
                break;
        }

    }
}
