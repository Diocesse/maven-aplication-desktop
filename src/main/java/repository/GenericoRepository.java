package repository;

import config.ConfigJPAHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.io.Serializable;

public class GenericoRepository<T extends Object> {
    public ConfigJPAHibernate configJPAHibernate;

    public GenericoRepository(){
         try {
             configJPAHibernate = (ConfigJPAHibernate)getClass().forName("config.ConfigJPAHibernate").newInstance();
         }catch (Exception e){
             System.out.println("Log-> "+e.getLocalizedMessage());
         }

    }

    public ConfigJPAHibernate getConfigJPAHibernate() {
        return configJPAHibernate;
    }

    public void save(T t){
        EntityManager em = configJPAHibernate.getManager();
        EntityTransaction et = em.getTransaction();
        try{
            et.begin();
            em.merge(t);
            et.commit();
        }catch (Exception e){
            et.rollback();
        }
    }

}
