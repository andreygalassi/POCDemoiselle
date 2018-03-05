package br.agrego.bookmark.persistence;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.gov.frameworkdemoiselle.annotation.Name;
import br.gov.frameworkdemoiselle.template.JPACrud;

public class MeuJPACrud<T, I> extends JPACrud<T, I> {

	private static final long serialVersionUID = 1L;

	@Inject
    @Name("bookmark-ds2")
    private EntityManager entityManager;

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
