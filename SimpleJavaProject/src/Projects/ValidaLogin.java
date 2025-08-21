package Projects;

import java.util.Scanner;

// Login Simples: Crie uma classe ValidaLogin. 
// Declare duas variáveis String, usuarioCorreto e senhaCorreta, 
// com os valores "admin" e "java123". 
// Declare outras duas variáveis, usuarioDigitado e senhaDigitada. 
// Use um if para verificar se os dados digitados são iguais aos corretos. 
// Se forem, imprima "Login bem-sucedido!". Senão, imprima "Usuário ou senha inválidos.".

public class ValidaLogin {

	public static void main(String[] args) {
		System.out.print("Digite o usuário correta: ");
		Scanner leitor = new Scanner(System.in);
		String usuarioCorreto = leitor.next();
		System.out.print("Digite a senha correta: ");
		String senhaCorreta = leitor.next();
		
		if(usuarioCorreto.equals("admin") && senhaCorreta.equals("java123")) {
			System.out.print("Login bem-sucedido");
		} else {
			System.out.print("Usuário ou senha inválido");
		}
		
		leitor.close();

	}

}
