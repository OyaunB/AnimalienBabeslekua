package org.example;

public class Untxia extends Animalia{

    public Untxia(String izena, int adina, double pisua){
        super(izena, adina, pisua); //Gurasoen eraikitzaileari deia
    }

    @Override
    public String espeziea(){
        return "Untxia";
    }

    @Override
    public void eginSoinua(){
        System.out.println("Untxia kantatzen hasi da");
    }
}
