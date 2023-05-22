
package contagemdepalavras;

import java.util.Scanner;
        
public class ContagemDePalavras {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();
        
        int contadorPalavras = 0;
        
        if (!frase.isEmpty()){
            String[] palavras = frase.split("\\s+");
            
            contadorPalavras = palavras.length;
        }
        System.out.println("Número de palavras: "+contadorPalavras);
        scanner.close();
    }
    
}
