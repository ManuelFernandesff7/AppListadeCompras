package manuel.compras.de.lista.app.com.applistadecompras.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import manuel.compras.de.lista.app.com.applistadecompras.EnviarMensaje;
import manuel.compras.de.lista.app.com.applistadecompras.R;

/**
 * Created by GLOBAL-TEAM on 26/01/2017.
 */

public class izquierda extends Fragment {
        View rootView;
    EditText campo;
    Button boton;
    EnviarMensaje em;
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
    rootView = inflater.inflate(R.layout.izquierda,container,false);
    campo=(EditText) rootView.findViewById(R.id.campotxt);
    boton=(Button) rootView.findViewById(R.id.boton);
    boton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String mensaje=campo.getText().toString();
            em.enviarDatos(mensaje);
        }
    });

    return rootView;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            em=(EnviarMensaje) activity;

        }catch (ClassCastException e){
            throw new ClassCastException("Necesitas implementar");
        }


    }
}
