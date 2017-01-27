package manuel.compras.de.lista.app.com.applistadecompras.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import manuel.compras.de.lista.app.com.applistadecompras.EnviarMensaje;
import manuel.compras.de.lista.app.com.applistadecompras.R;
import manuel.compras.de.lista.app.com.applistadecompras.fragment.derecha;

public class MainActivity extends AppCompatActivity implements EnviarMensaje {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void enviarDatos(String mensaje) {
        derecha dere = (derecha) getFragmentManager().findFragmentById(R.id.derecha);
        dere.ObtenerDatos(mensaje);
    }
}
