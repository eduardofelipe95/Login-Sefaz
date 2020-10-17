package dao;

import model.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneDao  extends JpaGenericDao<Phone, Long>{
    public PhoneDao(Class<Phone> classe) {
        super(classe);
    }

    public void saveAll(Iterable<Phone> phones) {
        List<Phone> result = new ArrayList<Phone>();

        if (phones != null) {
            for (Phone phone : phones) {
                super.save(phone);
            }
        }

    }
}
