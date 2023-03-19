package DAO;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public Double getData() {
        System.out.println("getData version base de donnees");
        return 34.4;
    }
}
