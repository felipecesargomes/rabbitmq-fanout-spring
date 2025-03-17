# RabbitMQ Fanout com Spring

![Badge](https://img.shields.io/static/v1?label=Spring&message=Framework&color=6DB33F&style=for-the-badge&logo=spring)
![Badge](https://img.shields.io/static/v1?label=RabbitMQ&message=Message%20Broker&color=FF6600&style=for-the-badge&logo=rabbitmq)
![Badge](https://img.shields.io/static/v1?label=Java&message=Language&color=007396&style=for-the-badge&logo=java)
![Badge](https://img.shields.io/static/v1?label=Maven&message=Build%20Tool&color=C71A36&style=for-the-badge&logo=apache-maven)

## Queue and Exchange

<p align="center">
  <img src="https://github.com/user-attachments/assets/9fdfceee-fd74-4398-9b21-4fb9d6d7b187" alt="Imagem" />
</p>

## Descrição do Projeto
 
Projeto criado para exemplificar um exemplo de mensageria com rabbitmq no padrão fanout. E utilização do mailhog para receber as notificações.

## Tecnologias Utilizadas

- **Java**
- **Spring Framework**
- **RabbitMQ**
- **Maven**
- **MailHog**

## Funcionalidades

- **Envio de Mensagens**: Capacidade de enviar mensagens para um exchange do tipo fanout.
- **Recebimento de Mensagens**: Consumidores recebendo e processando mensagens de diferentes filas vinculadas ao exchange.

## Necessário

- **Java 11** ou superior instalado.
- **RabbitMQ**: Instância do RabbitMQ.

  ```bash
  docker composer up -d
