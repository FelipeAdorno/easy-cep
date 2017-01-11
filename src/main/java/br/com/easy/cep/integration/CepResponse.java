package br.com.easy.cep.integration;

import lombok.Data;

@Data
public class CepResponse {
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
}
