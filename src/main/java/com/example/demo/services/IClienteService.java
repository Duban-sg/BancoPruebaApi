package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Cliente;

public interface IClienteService {
	public List<Cliente>findAll();
	
	//buscar por id  
	public Cliente findById(Long id);
	
	//retorna el cliente guardado
	public Cliente save(Cliente cliente);
	
	
	public void delete(Long id);
	
}
