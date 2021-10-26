
public class TiposNumericos {
	public static void main(String[] args) {
		
		//Inteiros:
		
		Byte numeroByte = 1; //consegue armazenar um numero que vai de -128 ate 127
		
		Short numeroShort = 1; //armazena um numero de -32768 ate 32767
		
		Integer numeroInteger = 1; //armazena um numero de -2147483648 ate 2147483647 = - 2 elevado a 31 ate 2 elevado a 31-1
		
		Long numeroLong = 1l; //Apesar de ja ser declarado tipo Long, precisa colocar o L depois do valor.
		//armazena um numero de - 2 elevado a 63 ate 2 elevado a 63-1.
		
		//Decimais:
		
		Float numeroFloat = 1.0f;//precisa declarar que é float (f) apos o numero.
		 
		
		Double numeroDouble = 1.0;//Nao precisa declarar o d, igual o Double e Long.
		
	}

}
//A diferenca entre os tipos é o tamanho do numero que cada uma consegue armazenar//
//dar preferecia para o integer, é o mais utilizado dentro do java quando precisar trabalhar com numero inteiro.