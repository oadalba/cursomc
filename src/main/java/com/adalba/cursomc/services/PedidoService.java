package com.adalba.cursomc.services;

import com.adalba.cursomc.domain.Pedido;
import com.adalba.cursomc.repositores.PedidoRepository;
import com.adalba.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id +	", Tipo:" + Pedido.class.getName()));
		}
	

}
