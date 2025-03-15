package br.com.felipe.pedidos.worker.service;

import br.com.felipe.pedidos.worker.entity.ItemPedido;
import java.util.List;
import br.com.felipe.pedidos.worker.entity.Produto;
import br.com.felipe.pedidos.worker.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void save(List<ItemPedido> itens) {
        for (ItemPedido item : itens) {
            Produto produto = item.getProduto();
            if (produto != null) {
                // Salva ou atualiza o produto no banco
                produtoRepository.save(produto);
            }
        }
    }
}