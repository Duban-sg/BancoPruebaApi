package com.example.demo.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.IClienteDao;
import com.example.demo.entity.Cliente;


@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired //anotacion para inyectar al cliente dao
	private IClienteDao clienteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		// aqui accederemos para retornar la lista de clientes
		return (List<Cliente>) clienteDao.findAll();
	}

	
	
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}

	@Transactional(readOnly = true)
	public Cliente save(Cliente cliente) {
		
		return clienteDao.save(cliente);
		
	}


	@Transactional
	public void delete(Long id) {
		
		clienteDao.deleteById(id);
	} 
		
	

	

}
