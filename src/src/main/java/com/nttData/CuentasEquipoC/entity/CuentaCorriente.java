package com.nttData.CuentasEquipoC.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="CuentaaCorriente")
@Getter @Setter
public class CuentaCorriente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCuentaCorriente;
    private String description;


}
