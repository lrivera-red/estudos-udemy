package br.estudos.service;


import br.estudos.domain.entity.Pedido;
import br.estudos.domain.enums.StatusPedido;
import br.estudos.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
