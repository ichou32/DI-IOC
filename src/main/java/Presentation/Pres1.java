package Presentation;

import DAO.DaoImpl;
import Metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao); // Injection des dependences
        System.out.println("res :"+ metier.calcul());
    }
}
