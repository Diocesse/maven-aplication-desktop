package model;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "seq_cargo", sequenceName = "seq_cargo",initialValue = 1 ,allocationSize = 1)
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "seq_cargo")
    private long idCargo;
    @Column(nullable = false,unique = true)
    private String cargoName;

    public long getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(long idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }
}
