package com.example.danielcalle.generadordenombresdebebes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView  a,b ;
   Spinner      s;
    TextView muestra;
    Varones nom = new  Varones();
    Mujeres nomM= new Mujeres();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(ImageView)findViewById(R.id.nombreVaron);
        b=(ImageView)findViewById(R.id.nombreMujer);
       s=(Spinner)findViewById(R.id.spinner);
        String[]meses = { "MESES","Enero" ,"Febrero" , "Marzo" , "Abril" ,"Mayo" ,"Junio" ,"Julio" ,"Agosto" ,"Septiembre" ,"Octubre" ,"Noviembre","Diciembre"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,meses);
        s.setAdapter(adapter);
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

        switch (item.getItemId()){
            case R.id.acercade:
                Intent i = new Intent(this, SegundoActivity .class);
                startActivity(i);
                break;
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

