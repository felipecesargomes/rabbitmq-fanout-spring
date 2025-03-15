package br.com.felipe.pedidos.worker.service;

import br.com.felipe.pedidos.worker.entity.ItemPedido;
import br.com.felipe.pedidos.worker.entity.Pedido;
import br.com.felipe.pedidos.worker.repository.ItemPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemPedidoService {
    private final ItemPedidoRepository itemPedidoRepository;
    public ItemPedidoService(ItemPedidoRepository itemPedidoRepository) {
        this.itemPedidoRepository = itemPedidoRepository;
    }

    public List<ItemPedido> save(List<ItemPedido> itens) {
        return itemPedidoRepository.saveAll(itens);
    }

    public void save(ItemPedido item) {
        itemPedidoRepository.save(item);
    }

    public void updateItemPedido(List<ItemPedido> itens, Pedido pedido) {
        itens.forEach(item -> {
            item.setPedido(pedido);
            this.save(item);
        });
    }
}
