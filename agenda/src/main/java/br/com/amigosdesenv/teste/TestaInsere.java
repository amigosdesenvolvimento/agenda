/**
 * 
 */
package br.com.amigosdesenv.teste;

import java.util.Calendar;

import br.com.amigosdesenv.dao.ContatoDao;
import br.com.amigosdesenv.model.Contato;

/**
 * @author CAIO CARDOSO
 *
 */
public class TestaInsere {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
//		pronto	para	gravar
		Contato	contato	=	new	Contato();
		contato.setNome("Vinicius");
		contato.setEmail("vinicius@teste.com.br");
		contato.setEndereco("Rua da Padaria 11");
		contato.setDataNascimento(Calendar.getInstance());
		//	grave	nessa	conexão!!!
		ContatoDao	dao	=	new	ContatoDao();
		//	método	elegante
		dao.adiciona(contato);
		System.out.println("Gravado!");

	}

}
