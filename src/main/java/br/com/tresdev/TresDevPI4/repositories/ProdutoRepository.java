package br.com.tresdev.TresDevPI4.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.tresdev.TresDevPI4.dominio.Produto;


@Repository
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

	public Iterable<Produto> findByNomeContaining(String parteNome);
	
}
