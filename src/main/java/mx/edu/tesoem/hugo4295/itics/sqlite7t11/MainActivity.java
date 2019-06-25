package mx.edu.tesoem.hugo4295.itics.sqlite7t11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import mx.edu.tesoem.hugo4295.itics.basedatos.DatosHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gvdatos = (GridView) findViewById(R.id.gvdatos);
        conexion.open();
        String[] cadena = conexion.llegagridview();
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(context: this,android.R.layout.simple_list_item_1,cadena);
        Contenedor.put(DatosHelper.tabladatos.COLUMNA_ID,value: null);
        contenedor.put(DatosHelper.tabladatos.COLUMNA_NOMBRE,value: null);


    }
}
