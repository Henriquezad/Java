import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
      
        final String SENHA_CORRETA = "Ab123";
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        String senhaDigitada;
        
       
        do {
            
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
            
            
            if (!senhaDigitada.equals(SENHA_CORRETA)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senhaDigitada.equals(SENHA_CORRETA));
        
        
        System.out.println("Senha correta! Acesso concedido.");
        
       
        scanner.close();
    }
}
