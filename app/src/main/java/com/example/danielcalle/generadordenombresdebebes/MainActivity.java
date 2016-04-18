package com.example.danielcalle.generadordenombresdebebes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView  a,b ;
    RadioButton ene,feb,mar,abr,may,jun,jul,agos,sep,oct,nov,dic;
    TextView muestra;
    Varones nom = new  Varones();
    Mujeres nomM= new Mujeres();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(ImageView)findViewById(R.id.nombreVaron);
        b=(ImageView)findViewById(R.id.nombreMujer);
        ene=(RadioButton)findViewById(R.id.enero);
        feb=(RadioButton)findViewById(R.id.febrero);
        mar=(RadioButton)findViewById(R.id.marzo);
        abr=(RadioButton)findViewById(R.id.abril);
        may=(RadioButton)findViewById(R.id.mayo);
        jun=(RadioButton)findViewById(R.id.junio);
        jul=(RadioButton)findViewById(R.id.julio);
        agos=(RadioButton)findViewById(R.id.agosto);
        sep=(RadioButton)findViewById(R.id.septiembre);
        oct=(RadioButton)findViewById(R.id.octubre);
        nov=(RadioButton)findViewById(R.id.noviembre);
        dic=(RadioButton)findViewById(R.id.diciembre);
        muestra=(TextView)findViewById(R.id.mostrarNombre);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


public void GenerarV(View view){
        int x =(int)(Math.random()*25);
        String nombre = nom.getV(x);
        muestra.setText(nombre);

}
    public void GenerarM(View v){
            int x =(int)(Math.random()*25);
            String nombreM =nomM.getM(x);
            muestra.setText(nombreM);
    }

}

