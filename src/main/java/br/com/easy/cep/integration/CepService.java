package br.com.easy.cep.integration;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "cepService", url = "http://api.postmon.com.br", fallback = CepServiceFallback.class)
public interface CepService {

    @RequestMapping("/v1/cep/{cep}")
    CepResponse getCep(@PathVariable("cep") String cep);
}
