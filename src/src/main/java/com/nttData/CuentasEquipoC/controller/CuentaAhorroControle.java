package com.nttData.CuentasEquipoC.controller;

import com.nttData.CuentasEquipoC.entity.CuentaAhorro;
import com.nttData.CuentasEquipoC.entity.Cuentas;
import com.nttData.CuentasEquipoC.repository.CuentaAhorroDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CuentaAhorroControle {
    @Autowired
    private CuentaAhorroDAO cuentaAhorroDAO;

    @GetMapping("/cuentasAhorro")
    public List<CuentaAhorro> allCuentasAhorro(){
        return (List<CuentaAhorro>) cuentaAhorroDAO.findAll();
    }
    @GetMapping("/cuentasAhorro/{idCuentaAhorro}")
    public Optional<CuentaAhorro> buscarPorId(@PathVariable("idCuentaAhorro") Integer id){
        return cuentaAhorroDAO.findById(id);
    }
    @PostMapping("/crearCuentasAhorro")
    public CuentaAhorro createCuentas(@RequestBody CuentaAhorro AhorroCuenta) {

        return cuentaAhorroDAO.save(AhorroCuenta);
    }
}
