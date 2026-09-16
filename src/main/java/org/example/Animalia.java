package org.example;

public abstract class Animalia {
    private String izena;
    private int adina;
    private double pisua;
    private boolean adoptatua;

    //Eraikitzailea -- Constructor
    public Animalia(String izena, int adina, double pisua){
        this.izena = izena;
        this.adina = adina;
        this.pisua = pisua;
        this.adoptatua = false; //Hasieran false izango da defektuz (ez adoptatua)  True=adoptatua
    }

    public abstract String espeziea();

    public void adoptatu(){
        this.adoptatua = true;
    }

    public abstract void eginSoinua();

    //toString metodoa datuak erakusteko
    @Override
    public String toString(){
        return "izena: " + izena + ",Espeziea: " + espeziea() + ", Adina: " + adina + ", Pisua: " + pisua + "Adoptatua: " + adoptatua;
    }

    //Getterr-ak eta Setterrak
    public String getIzena() {return izena; }
    public int getAdina() {return adina; };
    public double getPisua() {return pisua;};
}
