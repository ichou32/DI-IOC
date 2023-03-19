package Presentation;

import DAO.DaoImpl;
import Metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        // new someClacc() => couplage fort => bad practice
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao); // Injection des dependences
        System.out.println("res :"+ metier.calcul());
    }
}
