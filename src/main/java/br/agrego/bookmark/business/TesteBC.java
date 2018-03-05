package br.agrego.bookmark.business;

import br.agrego.bookmark.domain.Teste;
import br.agrego.bookmark.persistence.TesteDAO;
import br.gov.frameworkdemoiselle.lifecycle.Startup;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@BusinessController
public class TesteBC extends DelegateCrud<Teste, Long, TesteDAO> {

	private static final long serialVersionUID = 1L;

	@Startup
	@Transactional
	public void load() {
		findAll();
		Teste teste = new Teste("teste123");
		super.insert(teste);
	}
}
