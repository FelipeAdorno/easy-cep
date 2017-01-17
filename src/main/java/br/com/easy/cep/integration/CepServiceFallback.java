package br.com.easy.cep.integration;

import br.com.easy.cep.exception.ResourceNotFoundException;
import br.com.easy.cep.repository.CepRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;

@Component
@AllArgsConstructor
public class CepServiceFallback implements CepService {

    private final CepRepository cepRepository;

    @Override
    public CepResponse getCep(String cep) {
        CepResponse cepResponse = cepRepository.findOne(cep);
        if(isNull(cepResponse)) {
            throw new ResourceNotFoundException();
        }
        return cepResponse;
    }
}
