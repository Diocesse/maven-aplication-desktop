package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NamedQueries({
        @NamedQuery(name = "consultar-pessoa-pelo-nome",query = "select p from Pessoa  p where p.user like :consulta")

})
public class Pessoa implements Serializable {

    @Id
    @Column(nullable = false,unique = true)
    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
