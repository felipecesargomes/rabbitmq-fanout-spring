package br.com.felipeapi.notification.notification.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Produto {

    private UUID id = UUID.randomUUID();
    private String nome;
    private Double valor;



}
