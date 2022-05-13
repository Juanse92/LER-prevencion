package com.ler.backend.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.ler.backend.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
