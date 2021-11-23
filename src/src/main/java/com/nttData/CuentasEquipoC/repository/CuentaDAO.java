package com.nttData.CuentasEquipoC.repository;

import com.nttData.CuentasEquipoC.entity.Cuentas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CuentaDAO extends CrudRepository<Cuentas, Integer> {
    Optional<Cuentas> findById(@Param("idCuentas") Integer id);
}
