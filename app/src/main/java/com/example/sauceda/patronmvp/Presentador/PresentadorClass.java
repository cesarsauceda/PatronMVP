package com.example.sauceda.patronmvp.Presentador;

import com.example.sauceda.patronmvp.Interactor.InteractorClass;
import com.example.sauceda.patronmvp.Interactor.InteractorInterface;
import com.example.sauceda.patronmvp.Vista.Radio_View;

/**
 * Created by sauceda on 15/05/18.
 */
//Se implementa la interfaz del presentador para hacer uso de sus metodos
public class PresentadorClass implements PresentadorInterface{

    //Se instancía la vista y la interfaz del Interactor
    Radio_View radio_view;
    InteractorInterface interactorInterface;

    //se crea constructor de la vista para apropiarse del valor
    public PresentadorClass(Radio_View radio_view) {
        this.radio_view = radio_view;
        interactorInterface=new InteractorClass(this);
    }

    //Se le envía a la interfaz de interactor que la vista a solicitado cambiar de Estacion
    @Override
    public void cambiarEstacion(String camEstacion) {
        interactorInterface.cambiarEstacion(camEstacion);
    }

    //Se le envía a la interfaz de interactor que la vista a solicitado cambiar de Frecuencia
    @Override
    public void cambiarFrecuencia(String camFrecuencia) {
        interactorInterface.cambiarFrecuencia(camFrecuencia);
    }

    //Le Regresa a la Vista el nuevo estado de la Estación
    @Override
    public void mostrarEstadoEstacion(String estado) {
        radio_view.mostrarEstadoEstacion(estado);
    }

    //Le Regresa a la Vista el nuevo valor de la Frecuencia
    @Override
    public void mostrarFrecuencia(String frecuencia) {
        radio_view.mostrarFrecuencia(frecuencia);
    }
}
