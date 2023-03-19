package Presentation;

import DAO.IDao;
import Metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres22 {
    public static void main(String[] args) throws Exception{
        /* saisi les couche a utilise lors de demarrage de l'app */

        // DaoImpl dao = new DaoImpl()
        // get the dao class name
        Scanner scanner = new Scanner(System.in);
        System.out.print("donner la couche dao: ");
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getConstructor().newInstance(); //instanciation dynamique

        //MetierImpl metier = new MetierImpl();
        System.out.print("donner la couche metier: ");
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

        // => metier.setDao(dao)
        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier, dao); // Injection dynamique des dependences

        System.out.println("res: "+ metier.calcul());
    }
}
