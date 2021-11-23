package com.nttData.CuentasEquipoC.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "CuentaAhorro")
@Getter @Setter
public class CuentaAhorro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCuentaAhorro;
    private String descripction;

    @JsonIgnore
    @OneToOne(mappedBy = "cuentaAhorro")
    private Cuentas cuentas;
}
