package com.nttData.CuentasEquipoC.repository;

import com.nttData.CuentasEquipoC.entity.CuentaAhorro;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CuentaAhorroDAO extends CrudRepository <CuentaAhorro, Integer> {
    Optional<CuentaAhorro> findById(@Param("idCuentaCorrient") Integer id);
}
