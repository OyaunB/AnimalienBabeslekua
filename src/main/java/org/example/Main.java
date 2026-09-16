package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("ONGI ETORRI ANIMALIEN BABESLEKURA!"));

       Txakurra animaliaBat = new Txakurra("Kai", 4, 12);
       Katua katuaBat = new Katua("mitxi", 1, 1.24);
       System.out.println(animaliaBat);
        System.out.println(katuaBat);
       animaliaBat.adoptatu();
       katuaBat.adoptatu();
       System.out.println("_______Animalia adoptatzen______");
       System.out.println(animaliaBat);
       System.out.println(katuaBat);
       System.out.println("_______SOINUA EGIN______");
       animaliaBat.eginSoinua();
       katuaBat.eginSoinua();
    }
}
