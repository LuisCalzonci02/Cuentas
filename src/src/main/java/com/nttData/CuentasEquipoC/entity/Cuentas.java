package com.nttData.CuentasEquipoC.entity;


import com.nttData.CuentasEquipoC.config.TipoCuenta;
import com.nttData.CuentasEquipoC.config.TipoMoneda;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="Cuentas")
@Getter @Setter
public class Cuentas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCuentas;

    private String name;
    private String lastname;
    private String usuario;
    private String email;
    private Integer phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "fk_CuentaDeAhorro", referencedColumnName = "idCuentaAhorro")
    private CuentaAhorro cuentaAhorro;


    @Enumerated(EnumType.STRING)
    private TipoMoneda tipoMoneda;




}
