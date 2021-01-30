package com.daniel.cursomc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.cursomc.domain.Pedido;

@Repository
public interface PedidoDAO extends JpaRepository<Pedido, Integer>{
	

}
