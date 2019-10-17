package model;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@SequenceGenerator(name = "seq_associado",sequenceName = "seq_associado",initialValue = 1,allocationSize = 1)
public class Associate {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_associado")
    private long idAssociado;
    @Column(nullable = false)
    private String nome;
    @Temporal(TemporalType.DATE)
    private Calendar nascimento;
    @Column(unique = true)
    private String cpf;
    @Column(unique = true)
    private String rg;
    @Column(nullable = false)
    private String endereco;
    @Column(unique = true)
    private String contato;
    @Lob
    private byte [] fotoPerfil;
    @Column(nullable = false)
    private String sexo;
    @OneToOne
    @JoinColumn(nullable = false)
    private Profission cargo;

    public void setCargo(Profission cargo) {
        this.cargo = cargo;
    }

    public Profission getCargo() {
        return cargo;
    }

    public long getIdAssociado() {
        return idAssociado;
    }

    public void setIdAssociado(long idAssociado) {
        this.idAssociado = idAssociado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public byte[] getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(byte[] fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
