package model;

import javax.persistence.*;

@Entity
public class Profission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProfissao;
    @Column(nullable = false)
    private String profissao;

    public long getIdProfissao() {
        return idProfissao;
    }

    public void setIdProfissao(long idProfissao) {
        this.idProfissao = idProfissao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
