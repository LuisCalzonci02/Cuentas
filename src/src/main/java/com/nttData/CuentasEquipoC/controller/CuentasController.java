package com.nttData.CuentasEquipoC.controller;

import com.nttData.CuentasEquipoC.entity.Cuentas;
import com.nttData.CuentasEquipoC.repository.CuentaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CuentasController {

    @Autowired
    private CuentaDAO cuentaDAO;

    @GetMapping("/cuentas")
    public List<Cuentas> todasLasCuentas(){
        return (List<Cuentas>) cuentaDAO.findAll();
    }
    @GetMapping("/cuentas/{idCuentas}")
    public Optional<Cuentas> buscarPorId(@PathVariable("idCuentas") Integer id){
        return cuentaDAO.findById(id);
    }
    @PostMapping("/crearCuentas")
    public Cuentas createCuentas(@RequestBody Cuentas cuentas) {

        return cuentaDAO.save(cuentas);
    }

}
