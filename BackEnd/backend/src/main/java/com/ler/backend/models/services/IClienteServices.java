package com.ler.backend.models.services;

import java.util.List;

import com.ler.backend.models.entity.Cliente;

public interface IClienteServices {
	
public List<Cliente> findAll();

public Cliente findById(Long id);

public Cliente save(Cliente cliente);

public void delete(Long id);
}
