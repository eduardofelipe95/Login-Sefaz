package dao;

import util.JpaUtil;

import java.util.List;
import javax.persistence.EntityManager;

public class JpaGenericDao<T, K> implements Dao<T, K> {

    protected EntityManager em;
    protected final Class<T> classe;

    public JpaGenericDao(Class<T> classe) {
        this.em = JpaUtil.getEntityManager();
        this.classe = classe;
    }

    public void save(T element) {
        this.em.getTransaction().begin();
        this.em.persist(element);
        this.em.getTransaction().commit();
    }

    public void remove(K id) {
        T element = findById(id);

        if (element != null) {
            this.em.getTransaction().begin();
            this.em.remove(element);
            this.em.getTransaction().commit();
        }
    }

    public void update(K id) {
        T element = findById(id);

        if (element != null) {
            this.em.getTransaction().begin();
            this.em.merge(element);
            this.em.getTransaction().commit();
        }
    }

    public T findById(K id) {
        return em.find(classe, id);
    }

    public List<T> findAll() {
        String query = "from " + classe.getSimpleName();

        System.out.println(query);

        return em.createQuery(query, classe).getResultList();
    }

}
