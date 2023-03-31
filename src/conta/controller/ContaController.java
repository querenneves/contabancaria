package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);

		if (conta != null)
			conta.visualizar();
		else
			System.out.println("A conta não foi encontrada!");

	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}

	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("A Conta numero: " + conta.getNumero() + " foi criada!");

	}

	@Override
	public void atualizar(Conta conta) {
	
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if(conta.sacar(valor) == true)
				System.out.println("O Saque foi efetuado com sucesso!");
		}else
			System.out.println("A conta não foi encontrada!");


	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if(conta.sacar(valor) == true)
				System.out.println("O Saque foi efetuado com sucesso!");
		}else
			System.out.println("A conta não foi encontrada!");

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
		
		if (contaOrigem != null && contaDestino != null) {
			if(contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("A Transferência foi efetuada com sucesso!");
			}
		}else
			System.out.println("A conta não foi encontrada!");

	}

	/* metodos auxiliares */
	public int gerarNumero() {
		return ++ numero;
	}

	public Conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		
		return null;

	}
}