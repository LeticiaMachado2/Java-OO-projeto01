package principal; //definição do pacote

import java.util.Scanner;

import entities.Cliente;
import repositories.ClienteRepository;

//definição da classe
public class Program {

	// função / método para executar o projeto
	public static void main(String args[]) {

		// imprimindo mensagem
		System.out.println("Aula 01 - Java WebDeveloper");

		// declarando o componente Scanner
		Scanner scanner = new Scanner(System.in);

		// criando um objeto para a classe cliente
		Cliente cliente = new Cliente();

		// Onde fica localizado o codigo que pode dar erro
		try {
			// entrada de dados para cliente
			System.out.print("Entre com o id do cliente......: ");
			cliente.setIdCliente(Integer.parseInt(scanner.nextLine()));

			System.out.print("Entre com o nome do cliente....: ");
			cliente.setNome(scanner.nextLine());

			System.out.print("Entre com o email do cliente...: ");
			cliente.setEmail(scanner.nextLine());

			System.out.print("Entre com o cpf do cliente.....: ");
			cliente.setCpf(scanner.nextLine());

		}
		// Exception - classe do Java que captura o erro que fica localizado no catch
		catch (Exception e) {
			System.out.println("\nOcorreu um erro:");
			System.out.println(e.getMessage());

		}

		// imprimindo os dados do cliente
		System.out.println("\nDADOS DO CLIENTE:");
		System.out.println("\tID DO CLIENTE..:" + cliente.getIdCliente());
		System.out.println("\tNOME...........:" + cliente.getNome());
		System.out.println("\tEMAIL..........:" + cliente.getEmail());
		System.out.println("\tCPF............:" + cliente.getCpf());
		
		//criando um objeto para classe ClienteRepsitory
		ClienteRepository clienteRepository = new ClienteRepository();
		clienteRepository.gravarArquivo(cliente);
	}

}
