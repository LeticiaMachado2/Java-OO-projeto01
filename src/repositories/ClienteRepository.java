package repositories;

import java.io.PrintWriter;

import entities.Cliente;

public class ClienteRepository {

	// Metodo para receber os dados de um cliente
	// e graca-lo em arquivo TXT

	// nome do metodo- gravarArquivo
	// () os argumentos que o metodo vai receber
	public void gravarArquivo(Cliente cliente) {

		try {
			// abrindo um arquivo em modo de gravação
			PrintWriter printWriter = new PrintWriter("c:\\temp\\cliente.txt");
			// escrevendo o conteudo do arquivo
			printWriter.write("\nIDO DO CLIENTE..: " + cliente.getIdCliente());
			printWriter.write("\nINOME...........: " + cliente.getNome());
			printWriter.write("\nIEMAIL..........: " + cliente.getEmail());
			printWriter.write("\nICPF............: " + cliente.getCpf());

			printWriter.flush(); // salvar o arquivo
			printWriter.close(); // fechar o arquivo

			System.out.println("\nArquivo TXT gravado com sucesso");

		} catch (Exception e) {
			System.out.println("\nErro ao gravar o arquivo" + e.getMessage());
		}

	}

}
