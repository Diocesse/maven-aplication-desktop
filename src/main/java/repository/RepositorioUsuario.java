package repository;

import config.ConfigJPAHibernate;
import model.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transaction;

public class RepositorioUsuario {

    private ConfigJPAHibernate jpaHibernate;

    public RepositorioUsuario() {
     try {
         jpaHibernate = (ConfigJPAHibernate) getClass().forName("config.ConfigJPAHibernate").newInstance();
     }catch (Exception e){
         System.out.println("Log -- > "+e.getLocalizedMessage());
     }
     }

    public void save(Object ob){
        EntityManager em = jpaHibernate.getManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(ob);
        et.commit();
    }

    public static void main(String aths[]){
        Pessoa p = new Pessoa();
        p.setUser("ifba");
        p.setPassword("ifba");
        new RepositorioUsuario().save(p);
    }
}
