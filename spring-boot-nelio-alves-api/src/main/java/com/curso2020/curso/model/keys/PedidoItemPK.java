package com.curso2020.curso.model.keys;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.curso2020.curso.model.entities.Pedido;
import com.curso2020.curso.model.entities.Produto;
import lombok.Data;

@Data
@Embeddable
public class PedidoItemPK implements Serializable {

	@ManyToOne
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;
}
