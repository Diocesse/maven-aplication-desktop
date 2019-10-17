package model;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "",sequenceName = "",initialValue = 1,allocationSize = 1)
public class Employee {
    @Id
    @Column(nullable = false)
    private long idEmployee;
    private String nome;
    private String cpf;
    private String rg;
    private String  user;
    private String passwd;
    private String sexo;
    @OneToOne
    private Works works;

}
