package Metier;

import DAO.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
//    @Autowired
//@Qualifier in case the the package contains more than a component to be injected

    private IDao dao; //couplage faible

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

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
