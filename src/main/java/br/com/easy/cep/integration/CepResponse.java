package br.com.easy.cep.integration;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class CepResponse {

    @Id
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
}
