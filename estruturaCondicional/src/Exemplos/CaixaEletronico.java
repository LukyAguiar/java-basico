package Exemplos;

public class CaixaEletronico {
	
	// Exemplo de Condicional Simples
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 30.0;

        if(valorSolicitado < saldo)
         saldo = saldo - valorSolicitado;

         System.out.println(saldo);

     }
    
}
