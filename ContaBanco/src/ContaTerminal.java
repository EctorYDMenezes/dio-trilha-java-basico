import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Incialização da biblioteca Scanner, para assim pser feita a inserção dos valores via terminal
        Scanner scanner = new Scanner(System.in);
        
        //Importação  necessária para a leitura de '.' como separador da casa decimal como proposta no desafio!
        Locale.setDefault(Locale.US);

        System.out.println("Bom dia, vamos seguir com o seu cadastro no banco DIO, por favor sigas os passos seguintes: ");
        
        //Inserir o valor do ID
        System.out.println("Informe o seu número de acesso: ");
        var numero = scanner.nextInt();
        
        //Inserir o número da agência
        System.out.println("Informe o número da sua agência: ");
        var agencia = scanner.next();
        scanner.nextLine();
        
        //Inserir o nome
        System.out.println("Informe o seu nome: ");
        var nomeCliente = scanner.nextLine();
        
        //Inserir o valor do saldo dsiponível
        System.out.println("Informe o saldo disponível em R$: ");
        var saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo de R$%.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}
