package br.com.pucminas.hubmap.domain.indexing;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface NGramRepository extends CrudRepository<NGram, Long>{
	
	Set<NGram> findByVocabularyOrderById(Vocabulary vocabulary);
}
