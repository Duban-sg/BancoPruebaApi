package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Cliente;
//esta es una interfaz para generar operaciones crud

public interface IClienteDao extends CrudRepository<Cliente,Long> {

	List<Cliente> findAll();

}
