package dao;
import model.User;

public class UserDao extends JpaGenericDao<User, Long>{
    public UserDao(Class<User> classe) {
        super(classe);
    }
}
