/**
 * 
 */
package br.com.amigosdesenv.teste;

import java.util.List;

import br.com.amigosdesenv.dao.ContatoDao;
import br.com.amigosdesenv.model.Contato;

/**
 * @author CAIO CARDOSO
 *
 */
public class TestaLista {

	public static void main(String[] args) throws ClassNotFoundException {

		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getLista();

		for (Contato contato : contatos) {
			System.out.println("Nome:	" + contato.getNome());
			System.out.println("Email:	" + contato.getEmail());
			System.out.println("Endereço:	" + contato.getEndereco());
			System.out.println("Data	de	Nascimento:	" + contato.getDataNascimento().getTime() + "\n");
		}

	}

}
