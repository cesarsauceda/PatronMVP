package com.example.sauceda.patronmvp.Vista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.sauceda.patronmvp.Presentador.PresentadorClass;
import com.example.sauceda.patronmvp.Presentador.PresentadorInterface;
import com.example.sauceda.patronmvp.R;

public class Radio_View extends AppCompatActivity implements Radio_ViewInterface{

    TextView tvEstacion, tvFrecuencia;

    PresentadorInterface presentadorInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio__view);

        presentadorInterface=new PresentadorClass(this);

        tvEstacion=findViewById(R.id.txtEstacion);
        tvFrecuencia=findViewById(R.id.txtFrecuencia);




    }
    public void selected(View view) {
        String sel;
        switch (view.getId()){
            //En caso de Precionar el boton AM se envia al presentador "AM"
            case R.id.btnAM:
                sel="AM";
                presentadorInterface.cambiarEstacion(sel);
            break;
            //En caso de Precionar el boton FM se envia al presentador "FM"
            case R.id.btnFM:
                sel="FM";
                presentadorInterface.cambiarEstacion(sel);
            break;
            //En caso de Precionar el boton aumentar se envia al presentador "aumentar"
            case R.id.btnAumFec:
                sel = "aumentar";
                presentadorInterface.cambiarFrecuencia(sel);
            break;
            //En caso de Precionar el boton aumentar se envia al presentador "disminuir"
            case R.id.btnDisFec:
                sel = "disminuir";
                presentadorInterface.cambiarFrecuencia(sel);
            break;


        }
    }

    /*Después de enviar la nueva peticion al
    presentador y este la enviara al Interactor donde se hizo la modificación le
    regresó el resultado al presentador y este a su vez lo envía a la Vista para
    que el usuario vea los resultados*/
    @Override
    public void mostrarEstadoEstacion(String estado) {
        tvEstacion.setText(estado);
    }

    @Override
    public void mostrarFrecuencia(String frecuencia) {
        tvFrecuencia.setText(frecuencia);
    }


}
