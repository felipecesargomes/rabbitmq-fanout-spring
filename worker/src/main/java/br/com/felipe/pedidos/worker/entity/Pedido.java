package br.com.felipe.pedidos.worker.entity;

import br.com.felipe.pedidos.worker.entity.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    private UUID id = UUID.randomUUID();
    private String cliente;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<ItemPedido> itens = new ArrayList<>();

    @Column(name = "valor_total")
    private Double valorTotal;

    @Column(name = "email_notificacao")
    private String emailNotificacao;

    @Enumerated(EnumType.STRING)
    private Status status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataHora = LocalDateTime.now();

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", valorTotal=" + valorTotal +
                ", status=" + status +
                ", dataHora=" + dataHora +
                ", itens=" + (itens != null ? itens.size() : 0) + " itens" +
                '}';
    }

}
