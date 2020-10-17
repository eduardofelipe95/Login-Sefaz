package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager = null;

    public static EntityManager getEntityManager() {

        if (entityManager == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("hello-jpa-pu");
            entityManager = Persistence.createEntityManagerFactory("hello-jpa-pu").createEntityManager();
        }

        return entityManager;

    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
