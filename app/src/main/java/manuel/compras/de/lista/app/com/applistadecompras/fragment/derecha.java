package manuel.compras.de.lista.app.com.applistadecompras.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import manuel.compras.de.lista.app.com.applistadecompras.R;

/**
 * Created by GLOBAL-TEAM on 26/01/2017.
 */

public class derecha extends Fragment{
    View rootView;
    TextView txt;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.derecha,container,false);
        txt=(TextView) rootView.findViewById(R.id.txt);
        return rootView;
    }
    public void ObtenerDatos(String mensaje){
        txt.setText(mensaje);
    }
}
