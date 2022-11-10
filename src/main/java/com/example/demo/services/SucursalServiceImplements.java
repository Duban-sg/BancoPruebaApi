package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.ISucursal;
import com.example.demo.entity.Sucursal;

@Service
public class SucursalServiceImplements implements ISucursalService {
	
	@Autowired
	private ISucursal SucursalDao;

	@Override
	@Transactional
	public Sucursal save(Sucursal sucursal) {
		
		SucursalDao.save(sucursal);
		return sucursal;
	}

}
