package atvd1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Atv1 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 10: ");
		int numero = leitor.nextInt();
		String nomearquivo = "tabuada_" + numero + ".txt";

		try (BufferedWriter escrita = new BufferedWriter(new FileWriter(nomearquivo))) {
			for (int i = 1; i <= 10; i++) {
				escrita.write(numero + "x" + i + "=" + (numero * i));
				escrita.newLine();
			}
			System.out.println("Arquivo salvo em" + nomearquivo);
		} catch (IOException e) {
			System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
		} finally {
			leitor.close();
		}

	}

}
