package com.william.gerenciamento_de_vendas.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
