package com.example.demo.mapStruct;

import org.mapstruct.Mapper;

import com.example.demo.dto.sucursalInputDto;
import com.example.demo.dto.sucursalViewDto;
import com.example.demo.entity.Sucursal;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SucursalMapper {
	
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "clientes", ignore = true)
	@Mapping(target="nombreSucursal", source="sucursalInputDto.nombreSucursal")
	@Mapping(target="direccion", source="sucursalInputDto.direccion")
	Sucursal toSucursal(sucursalInputDto sucursalInputDto);
	
	sucursalViewDto toSucursalViewDto(Sucursal Sucursal);

}
