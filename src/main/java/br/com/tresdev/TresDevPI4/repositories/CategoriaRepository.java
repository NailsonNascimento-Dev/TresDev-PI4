package br.com.tresdev.TresDevPI4.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.tresdev.TresDevPI4.dominio.Categoria;





@Repository
	public interface CategoriaRepository extends PagingAndSortingRepository<Categoria, Integer> {
	
	public Iterable<Categoria> findByNomeContaining(String parteNome);

}
