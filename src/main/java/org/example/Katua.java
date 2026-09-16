package org.example;

public class Katua extends Animalia {

    public Katua(String izena, int adina, double pisua){
        super(izena, adina, pisua); //Deitu gurasoen eraikitzaileari
    }

    @Override
    public String  espeziea(){
        return "Katua";
    }

    @Override
    public void eginSoinua(){
        System.out.println("Katuak miau egin du");
    }
}
