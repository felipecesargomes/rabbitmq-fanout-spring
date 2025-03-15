package br.com.felipe.pedidos.worker.repository;
import java.util.UUID;
import br.com.felipe.pedidos.worker.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, UUID> {

}
