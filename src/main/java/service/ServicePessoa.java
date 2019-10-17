package service;

import model.Pessoa;
import repository.RepositorioUsuario;

public class ServicePessoa {


    private RepositorioUsuario usuario;
    private Pessoa pessoa = new Pessoa();

    public void setUsuario( Pessoa pessoa){
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public boolean save(){
        usuario.save(pessoa);
        return true;
    }
}
