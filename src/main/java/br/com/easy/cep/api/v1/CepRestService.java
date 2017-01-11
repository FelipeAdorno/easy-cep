package br.com.easy.cep.api.v1;

import br.com.easy.cep.integration.CepResponse;
import br.com.easy.cep.integration.CepService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("v1/ceps")
public class CepRestService {

    private final CepService cepService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{cep}", method = RequestMethod.GET)
    public CepResponse getCep(@PathVariable String cep) {
        return cepService.getCep(cep);
    }
}
