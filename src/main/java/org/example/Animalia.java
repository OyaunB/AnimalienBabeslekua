package org.example;

public class Animalia {
    private String Izena;
    private int Adina;
    private double Pisua;
    private boolean Adoptatua;

    //Eraikitzailea-Constructor__:
    public  Animalia(String izena, int adina, double pisua){
        Izena = izena;
        Adina = adina;
        Pisua = pisua;
        Adoptatua = false;  // Hasieran ez dago adoptatuta
    }

    //Metodo abstraktua, beheko klase bakoitzak bere espeziea bueltatuko du (Katua,txakurra, untxia)
    public abstract String Espeziea;

    //Funtzioak=  ((ToString, adoptatu,, eginSoinua>>>
    //Espeziea, adoptatua, adina, pisua, izena
    //Herentzia: Untxia, Katua, Txakurra

}
