package br.com.felipe.pedidos.worker.service;

import br.com.felipe.pedidos.worker.entity.ItemPedido;
import br.com.felipe.pedidos.worker.entity.Pedido;
import br.com.felipe.pedidos.worker.repository.PedidoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PedidoService {
    private final Logger logger = LoggerFactory.getLogger(PedidoService.class);
    private final PedidoRepository pedidoRepository;
    private final ProdutoService produtoService;
    private final ItemPedidoService itemPedidoService;

    public PedidoService(PedidoRepository pedidoRepository, ProdutoService produtoService, ItemPedidoService itemPedidoService) {
        this.pedidoRepository = pedidoRepository;
        this.produtoService = produtoService;
        this.itemPedidoService = itemPedidoService;
    }

    public void save(Pedido pedido) {
        produtoService.save(pedido.getItens());
        List<ItemPedido> itemPedidos = itemPedidoService.save(pedido.getItens());
        pedidoRepository.save(pedido);
        itemPedidoService.updateItemPedido(pedido.getItens(), pedido);
        logger.info("Pedido salvo com sucesso: ", pedido.toString());
    }
    public void updateItemPedido(List<ItemPedido> itens, Pedido pedido) {
        for (ItemPedido item : itens) {
            item.setPedido(pedido);
        }
    }

}
