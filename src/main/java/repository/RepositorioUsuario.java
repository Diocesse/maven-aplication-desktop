package repository;

import config.ConfigJPAHibernate;
import model.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.transaction.Transaction;
import java.util.List;

public class RepositorioUsuario extends GenericoRepository<Pessoa> {

    public List<Pessoa> filtrarPorNome (String nome){
        try{
            Query query = getConfigJPAHibernate().getManager().createNamedQuery("consultar-pessoa-pelo-nome");
            query.setParameter("consulta","%"+nome+"%");
            return query.getResultList();
        }catch (Exception e){
            return null;
        }
    }
}
