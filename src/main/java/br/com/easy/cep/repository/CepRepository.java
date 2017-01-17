package br.com.easy.cep.repository;

import br.com.easy.cep.integration.CepResponse;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CepRepository extends PagingAndSortingRepository<CepResponse, String> {}
