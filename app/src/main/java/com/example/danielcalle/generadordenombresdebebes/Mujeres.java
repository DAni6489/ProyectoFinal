package com.example.danielcalle.generadordenombresdebebes;

/**
 * Created by DANIEL CALLE on 18/4/2016.
 */
public class Mujeres {
    private int n=25;
    private String v[];
    public Mujeres(){

        v = new String[n];
        this.llenar();

    }

    public void llenar(){
        v[0]="Devora";
        v[1]="Rosa";
        v[2]="Pamela";
        v[3]="Vivian";
        v[4]="Mariana";
        v[5]="Adriana";
        v[6]="Nayla";
        v[7]="Mishel";
        v[8]="Natahaly";
        v[9]="Alejandra";
        v[10]="Angela";
        v[11]="Yanina";
        v[12]="Marcia";
        v[13]="Aleyda";
        v[14]="Carla";
        v[15]="Andrea";
        v[16]="Jhoselin";
        v[17]="Karen";
        v[18]="Melissa";
        v[19]="Mariela";
        v[20]="Paola";
        v[21]="Vanesa";
        v[22]="Carola";
        v[23]="Lois";
        v[24]="Fabiola";
    }

    public String getM(int numero) {
        return v[numero];
    }
}
