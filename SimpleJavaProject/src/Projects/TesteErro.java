package Projects;

//O Erro Proposital: Crie uma classe TesteErro. 
//Declare uma String numeroInvalido com o valor "123z". 
//Tente fazer o parse dela para int usando Integer.parseInt(). 
//Execute o programa. Ele vai quebrar. 
//Copie a primeira linha da mensagem de erro que aparece no console e 
//cole-a como um comentário no seu código para documentar o que aconteceu.

public class TesteErro {

	public static void main(String[] args) {
		String numeroInvalido = "123z";
		int parseInvalido = Integer.parseInt(numeroInvalido);
	}

//Exception in thread "main" java.lang.NumberFormatException: For input string: "123z"
//at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//at java.base/java.lang.Integer.parseInt(Integer.java:662)
//at java.base/java.lang.Integer.parseInt(Integer.java:778)
//at SimpleJavaProject/Projects.TesteErro.main(TesteErro.java:14)

}
