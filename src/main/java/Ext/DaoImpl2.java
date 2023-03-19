package Ext;

import DAO.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public Double getData() {
        System.out.println("version Web Service");
        double data = 43;
        return data;
    }
}
