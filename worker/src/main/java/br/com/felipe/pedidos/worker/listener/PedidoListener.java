package br.com.felipe.pedidos.worker.listener;

import br.com.felipe.pedidos.worker.entity.Pedido;
import br.com.felipe.pedidos.worker.entity.enums.Status;
import br.com.felipe.pedidos.worker.service.PedidoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PedidoListener {
    private final Logger logger = LoggerFactory.getLogger(PedidoListener.class);

    private final PedidoService pedidoService;

    public PedidoListener(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void salvarPedido(Pedido pedido) {
        pedido.setStatus(Status.PROCESSADO);
        pedidoService.save(pedido);
        logger.info("Pedido processado: {}", pedido.toString());
    }

}
