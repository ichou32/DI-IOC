package Presentation;

import DAO.IDao;
import Metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // DaoImpl dao = new DaoImpl()
        // get the dao class name
        Scanner scanner = new Scanner(new File("src/config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getConstructor().newInstance(); //instanciation dynamique

        //MetierImpl metier = new MetierImpl();
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

        // => metier.setDao(dao)
        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier, dao); // Injection dynamique des dependences

        System.out.println("res: "+ metier.calcul());
    }
}
