
package javaapplication1;
import java.util.Scanner;
import java.util.Random;

public class main {
    
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       Random aleatorio = new Random();
       int numero = aleatorio.nextInt(2);
       JavaApplication1 jogo = new JavaApplication1();
       String p;
       int valida = 0, Jogadas = 0;
       
       while(true){
           System.out.println("JOGO DA VELHA");
           jogo.Ver();
           System.out.println("Quem joga é o jogador " + numero);
           
           do{//inicia jogador um
               System.out.print("Jogador , informe uma posição: ");
               
               p = ler.next();//posição 
               
               while(!jogo.Verdade(p)){//vê se os dois jogadores não marcaram o mesmo numero
                   System.out.println("Jogada inválida, tente novamente");
                   System.out.print("Jogador , informe uma posição: ");
                   p = ler.next();
                   valida = 0; 
       }
       jogo.jogada(p, "X");
       valida = 1;
    }while(valida==0);//fim jogador 1 
           Jogadas++;
           valida=0;
           jogo.Ver();
           if(!jogo.ganhou(Jogadas).equals("null")){
               break;
           }
           
            do{//inicia jogador dois
               System.out.print("Jogador , informe uma posição: ");
               p = ler.next();//posição 
               
               while(!jogo.Verdade(p)){//vê se os dois jogadores não marcaram o mesmo numero
                   System.out.println("Jogada inválida, tente novamente");
                   System.out.print("Jogador, informe uma posição: ");
                   p = ler.next();
                   valida = 0; 
       }
       jogo.jogada(p,"0");
       valida = 1;
    }while(valida==0);//fim jogador 2
           Jogadas++;
           valida = 0;
           jogo.Ver();
           if(!jogo.ganhou(Jogadas).equals("null")){
               break;
           }
           

       }
        System.out.println("O "+jogo.ganhou(Jogadas)+" venceu! ");
    }
}