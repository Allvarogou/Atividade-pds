import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class atvd2 {
	public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 10: ");
		int numero = leitor.nextInt();
		String nomearquivo = "tabuada_" + numero + ".txt";
		
		File fr = new File(nomearquivo);
		if (!fr.exists()) {
			System.out.println("Arquivo não existe.");
		} else {
			try {
				@SuppressWarnings("resource")
				BufferedReader br = 
						new BufferedReader(new FileReader(nomearquivo));
				System.out.println("Lendo arquivo...");
				String linha = "";
				while((linha = br.readLine()) != null) {
					System.out.println(linha);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}



