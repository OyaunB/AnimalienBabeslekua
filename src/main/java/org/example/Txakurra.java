package org.example;

public class Txakurra  extends Animalia{

    public Txakurra(String izena, int adina, double pisua){
        super(izena, adina, pisua); //Gurasoaren eraikitzaileari deia__
    }
        @Override
        public String espeziea(){
            return "Txakurra";
        }

        @Override
        public void eginSoinua(){
            System.out.println("Lotu txakurra faorez_________________uau uau.....");
        }

}
