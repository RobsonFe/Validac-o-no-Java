import java.util.InputMismatchException;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite um valor: ");
    try {
        int n = scan.nextInt();
        System.out.println(n);
    } catch (InputMismatchException e) {
        System.out.println("Digite apenas números!");
    }
    
	
	
	scan.close();
	}
	
	
	//Metodos estaticos para retornar validação true ou false
	
	public static boolean validarNumeros(String n) {
	    return n.matches("\\d+"); // Verifica se a string contém apenas dígitos
	}
	
	public static boolean validarNumeros1(int n) {
	    return Integer.toString(n).matches("\\d+");
	} // metodo para validar true se for numero e false se não for numeros.

	
	public static boolean validarNumeros2(String texto) {
	    for (char c : texto.toCharArray()) {
	        if (!Character.isDigit(c)) {
	            return false; // Se um caractere não for um dígito, retorna false
	        }
	    }
	    return true; // Todos os caracteres são dígitos
	}


}
