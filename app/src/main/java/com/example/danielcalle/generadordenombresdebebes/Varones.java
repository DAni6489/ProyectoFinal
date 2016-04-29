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

        v[0]="DANIEL :\nPerro Loco";
        v[1]="ROBERTO :\nEl que tiene fama  de origen germano";
        v[2]="LUIS :\nEl guerrero famoso";
        v[3]="CESAR :\nhijo de cachorritas";
        v[4]="JHONNY :\nPleno de gracia divina";
        v[5]="FRANCO :\nEl hombre libre";
        v[6]="MARCELO : \nProviene de mar y cielo";
        v[7]="IVAN :\nPleno de gracia";
        v[8]="BRAYAN :\nOrigen celta";
        v[9]="ADRIAN :\nEl que viene del mar";
        v[10]="ALVARO :\nQue es prevenido";
        v[11]="HECTOR :\nQue protege";
        v[12]="RONALDO :\nEl que es poderoso y fuerte";
        v[13]="ANDRES :\nValiente y Varonil";
        v[14]="JOSE :\nAl que dios engrandece";
        v[15]="ERLAN :\nEl soldado";
        v[16]="JAVIER :\nEl que vive en casa nueva";
        v[17]="CARLOS :\nVaronil fuerte";
        v[18]="JOEL :\nDios es su señor";
        v[19]="HOMERO : \nEl que no ve";
        v[20]="TONY :\nQue se destaca entre todos";
        v[21]="OSCAR :\nLa lanza de los dioses";
        v[22]="BRUCE :\nEl moreno";
        v[23]="MANUEL :\nDios esta con nosotros";
        v[24]="RUBEN :\nRecibi un hijo de dios";
    }

    public String getV(int numero) {
        return v[numero];

    }
}
