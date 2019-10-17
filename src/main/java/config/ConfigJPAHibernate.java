package config;

import model.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ConfigJPAHibernate {

    private static EntityManagerFactory factory;
    private EntityManager manager;

    public EntityManager getManager() {
        return manager = factory.createEntityManager();
    }

    public ConfigJPAHibernate() {
        factory = Persistence.createEntityManagerFactory("app-jpa");
/*        manager = factory.createEntityManager();
        Pessoa p = new Pessoa();
        p.setUser("root");
        p.setPassword("root");
        manager.getTransaction().begin();
        manager.persist(p);
        manager.getTransaction().commit();

        Query q = manager.createQuery("select p from Pessoa p where p.user like :valide");
        q.setParameter("valide","root");
        Pessoa pessoa =(Pessoa) q.getSingleResult();
        System.out.println("User :"+pessoa.getUser() + " Passwd: "+pessoa.getPassword());
   */ }


}
