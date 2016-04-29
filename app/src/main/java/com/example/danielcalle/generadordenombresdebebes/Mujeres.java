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

        v[0]="DAYANA :\nDe luz divina, brillante, diosa de la fertilidad";
        v[1]="ROSA :\nLinda como una rosa de origen latino" ;
        v[2]="PAMELA :\nLa que es dulce de origen griego";
        v[3]="VIVIAN :\nEl guerrero  ";
        v[4]="MARIANA :\n La elegida y llena de gracia";
        v[5]="ADRIANA :\n Mujer del mar ";
        v[6]="NAYELY : \nTe quiero de origen zapoteca";
        v[7]="MISHEL :\nProtector del pueblo elegido que es como el señor";
        v[8]="NATHALY :\nNacida en navidad de origen latino";
        v[9]="ALEJANDRA :\nLa protectora de origen griego";
        v[10]="ANGELA :\nEnviada de dios";
        v[11]="YANINA :\nLa llena de gracia de dios";
        v[12]="MARCIA :\nValiente consagrada de ,marte";
        v[13]="ALEYDA :\nDescendiente de la nobleza";
        v[14]="CARLA :\n Lo que es fuerte";
        v[15]="ANDREA :\nValiente y bella";
        v[16]="JHOSELIN :\nMiembro de una tribu";
        v[17]="KAREN :\nVariante danesa de Catalina";
        v[18]="MELISSA :\nDulce como la miel";
        v[19]="MARIELA :\nViene de la union de la maria";
        v[20]="PAOLA :\nVariante italiana de Paula";
        v[21]="VANESA :\nEstrella de origen hebreos o que viene de vanidad";
        v[22]="CAROLA :\n La que es fuerte";
        v[23]="ALOIS : \nGuerrera famosa";
        v[24]="FABIOLA :\nLa que cultiva las habas";
    }

    public String getM(int numero) {
        return v[numero];
    }
}
