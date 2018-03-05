package br.agrego.bookmark.persistence;

import br.agrego.bookmark.domain.Teste;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;

@PersistenceController
public class TesteDAO extends MeuJPACrud<Teste, Long> {

	private static final long serialVersionUID = 1L;
	
//	@Inject
//    @Name("bookmark-ds2")
//    private EntityManager entityManager;
//
//	@Override
//	public EntityManager getEntityManager() {
//		return entityManager;
//	}
}
