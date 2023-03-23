package conta;

import java.util.Scanner;

import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		
		System.out.println("Digite o Numero da Agência: ");
		agencia = leia.nextInt();
		
        System.out.println("Digite o Nome do Titular: ");
        leia.skip("\\R?");
        titular = leia.nextLine();
        
        do {
            System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
            tipo = leia.nextInt();
            
        } while (tipo < 1 && tipo > 2);

        System.out.println("Digite o Saldo da Conta (R$): ");
        saldo = leia.nextFloat();
		
       while (true) {
    	   System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND +"*******************************************");
    	   System.out.println("                                           ");
    	   System.out.println("          BANCO DO BRAZIL COM Z            ");
    	   System.out.println("                                           ");
    	   System.out.println("*******************************************");
    	   System.out.println("                                           ");
    	   System.out.println("             1- Criar Conta                ");
    	   System.out.println("             2- Lista todas as Contas      ");
    	   System.out.println("             3- Buscar conta por Numero    ");
    	   System.out.println("             4- Atualizar Dados da Conta   ");
    	   System.out.println("             5- Apagar Conta               ");
    	   System.out.println("             6- Sacar                      ");
    	   System.out.println("             7- Depositar                  ");
    	   System.out.println("             8- Transferência entre Contas ");
    	   System.out.println("             9- Sair                       ");
    	   System.out.println("                                           ");
    	   System.out.println("*******************************************");
    	   System.out.println(" Entre com a opção desejada:               ");
    	   System.out.println("                                           " + Cores.TEXT_RESET);
    	   
    	   opcao = leia.nextInt();
    	   
    	   if(opcao == 9) {
    		   sobre();
    		   System.out.println(Cores.TEXT_CYAN + "\\nBanco do Brazil com Z - O seu Futuro começa aqui!");
    		   leia.close();
    		   System.exit(0);
    	   }
    	   switch (opcao) {
    	   
    	   case 1 -> {
    		   System.out.println("Digite o Limite de Crédito (R$): ");
               limite = leia.nextFloat(); // criar o objeto conta corrente
    	   }
    	   case 2 -> {
    		   System.out.println("Digite o dia do Aniversario da Conta: ");
               aniversario = leia.nextInt(); // criar o objeto conta poupanca
        	   }
    	   case 3 -> {
    		   System.out.println("Digite o número da conta: ");
               numero = leia.nextInt();
        	   }
    	   case 4 -> {
        	   System.out.println("Atualizar dados da Conta\n\n");
        	   }
    	   case 5 -> {
    		   System.out.println("Digite o número da conta: ");
               numero = leia.nextInt();
        	   }
    	   case 6 -> {
    		   System.out.println("Digite o número da conta: ");
               numero = leia.nextInt();
               
               System.out.println("Digite o número da conta: ");
               valor = leia.nextFloat();
        	   }
    	   case 7 -> {
    		   System.out.println("Digite o número da conta: ");
               numero = leia.nextInt();
               
               System.out.println("Digite o número da conta: ");
               valor = leia.nextFloat();
        	   }
    	   case 8 -> {
        	   System.out.println("Transferência entre Contas\n\n");
        	   }
    	   default -> System.out.println("\nOpção Inválida!\n    ");
       }
       }
	}
       public static void sobre() {
			System.out.println("Queren Neves");
	}
}
