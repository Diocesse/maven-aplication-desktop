package config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConfigJPAHibernate {

    private static EntityManagerFactory factory;
    private EntityManager manager;

    public EntityManager getManager() {
        return manager = factory.createEntityManager();
    }

    public ConfigJPAHibernate() {
        factory = Persistence.createEntityManagerFactory("app-jpa");
 }


}
