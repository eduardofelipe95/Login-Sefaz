import dao.UserDao;
import dao.PhoneDao;
import model.Phone;
import model.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoginService {
    public static void main(String[] args) {
        UserDao userDao = new UserDao(User.class);
        PhoneDao phoneDao = new PhoneDao(Phone.class);


        Set<Phone> phones = new HashSet<Phone>();
        Phone phone = new Phone(82,"996883317","fax");
        Phone phone2 = new Phone(81,"946883317","cel");

        phones.add(phone);
        phones.add(phone2);

        User user = new User("eduardo", "33231743105","eduardofelipe@ic.ufal.br", null);

        phone.setUser(user);
        phone2.setUser(user);

        user.setPhones(phones);

        userDao.save(user);

        List<Phone> phones2 = phoneDao.findAll();
        List<User> users = userDao.findAll();
        for(Phone p : phones2){
            System.out.println(p.toString());
        }

    }
}
