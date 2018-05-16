package com.example.sauceda.patronmvp.Presentador;

/**
 * Created by sauceda on 15/05/18.
 */

public interface PresentadorInterface {

    void cambiarEstacion(String camEstacion);//Permite Cambiar entre AM y FM
    void cambiarFrecuencia(String camFrecuencia);//cambia la frecuencia

    void mostrarEstadoEstacion(String estado);//Muestra el estado de la Estacion AM o FM
    void mostrarFrecuencia(String frecuencia);//Muestra la frecuencia nueva Ej 80.1

}
