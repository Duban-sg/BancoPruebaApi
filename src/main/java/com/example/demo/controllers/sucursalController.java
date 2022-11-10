package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapStruct.SucursalMapper;
import com.example.demo.services.ISucursalService;
import com.example.demo.dto.sucursalInputDto;
import com.example.demo.dto.sucursalViewDto;
import com.example.demo.entity.Sucursal;

@RestController
@RequestMapping(value = "/sucursal")
public class sucursalController {

	@Autowired
	private SucursalMapper sucursalMapper;

	@Autowired
	private ISucursalService sucursalService;

	public sucursalController() {
	}

	@PostMapping("/save")
	public sucursalViewDto save(@RequestBody sucursalInputDto sucursalInputDto) {
		Sucursal newSucursal = sucursalMapper.toSucursal(sucursalInputDto);
		return sucursalMapper.toSucursalViewDto(sucursalService.save(newSucursal));
	}

}
