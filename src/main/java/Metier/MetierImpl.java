package Metier;

import DAO.IDao;

public class MetierImpl implements IMetier{
    private IDao dao; //couplage faible
    @Override
    public double calcul() {
        double d = dao.getData();
        double res = d*24;
        return res;
    }

    /**
    * setData permet d'injecter dans la variable dao
    * un objet d'une class qui implement l'interface IDao
    */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
