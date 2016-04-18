package com.example.danielcalle.generadordenombresdebebes;

/**
 * Created by DANIEL CALLE on 18/4/2016.
 */
public class Varones {
   private int n=25;
    private String v[];

    public Varones(){

        v = new String[n];
        this.llenar();
    }

    public void llenar(){

        v[0]="Daniel";
        v[1]="Roberto";
        v[2]="Luis";
        v[3]="Cesar";
        v[4]="Jhon";
        v[5]="Franco";
        v[6]="Marcelo";
        v[7]="Ivan";
        v[8]="Brayan";
        v[9]="Adrian";
        v[10]="Alvaro";
        v[11]="Hector";
        v[12]="Ronaldo";
        v[13]="Andres";
        v[14]="Jose";
        v[15]="Erlan";
        v[16]="Javier";
        v[17]="Carlos";
        v[18]="Joel";
        v[19]="Homero";
        v[20]="Tony";
        v[21]="Shane";
        v[22]="Bruce";
        v[23]="Manuel";
        v[24]="Jhony";
    }

    public String getV(int numero) {
        return v[numero];

    }
}
