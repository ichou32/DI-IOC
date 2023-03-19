package DAO;

public class DaoImpl implements IDao{
    @Override
    public Double getData() {
        System.out.println("getData version base de donnees");
        return 34.4;
    }
}
