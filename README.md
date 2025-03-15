# RabbitMQ Fanout com Spring

![Badge](https://img.shields.io/static/v1?label=Spring&message=Framework&color=6DB33F&style=for-the-badge&logo=spring)
![Badge](https://img.shields.io/static/v1?label=RabbitMQ&message=Message%20Broker&color=FF6600&style=for-the-badge&logo=rabbitmq)
![Badge](https://img.shields.io/static/v1?label=Java&message=Language&color=007396&style=for-the-badge&logo=java)
![Badge](https://img.shields.io/static/v1?label=Maven&message=Build%20Tool&color=C71A36&style=for-the-badge&logo=apache-maven)

## Descrição do Projeto

Este projeto demonstra a implementação de um sistema de mensageria utilizando o padrão **Fanout** do RabbitMQ integrado com o framework Spring. O objetivo é exemplificar como distribuir mensagens para múltiplas filas simultaneamente, permitindo que diferentes partes da aplicação processem essas mensagens de forma independente.

## Tecnologias Utilizadas

- **Java**
- **Spring Framework**
- **RabbitMQ**
- **Maven**

## Funcionalidades

- **Envio de Mensagens**: Capacidade de enviar mensagens para um exchange do tipo fanout.
- **Recebimento de Mensagens**: Consumidores recebendo e processando mensagens de diferentes filas vinculadas ao exchange.

## Pré-requisitos

- **Java 11** ou superior instalado.
- **RabbitMQ**: Instância do RabbitMQ em funcionamento. Você pode utilizar o Docker para subir uma instância rapidamente:

  ```bash
  docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:management
