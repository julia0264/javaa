
package javaapplication1;
import java.util.Scanner;
import java.util.Random;
import jdk.nashorn.internal.ir.BreakNode;
public class cpu {
    public static void main(String[] args) {
           Scanner ler = new Scanner(System.in);
           Random ale = new Random();
           int numero = ale.nextInt(10);
           JavaApplication1 Jogo = new JavaApplication1();
           String posi;
           int vale = 0, jvezes = 0;
           
           while(true){
               System.out.println("JOGO DA VELHA");
           }
           Jogo.Ver();
           System.out.println("Quem joga é o jogador: ");
           
           do{//inicia jogador 
               System.out.print("Jogador , informe uma posição: ");
               
               posi = ler.next();//posição 
               
               while(!Jogo.Verdade(posi)){//vê se os dois jogadores não marcaram o mesmo numero
                   System.out.println("Jogada inválida, tente novamente");
                   System.out.print("Jogador , informe uma posição: ");
                   posi = ler.next();
                   vale = 0; 
       }
       Jogo.jogada(posi, "X");
       vale = 1;
       
       }while(vale==0);//fim jogador 1 
           jvezes++;
           vale=0;
           Jogo.Ver();
           if(!Jogo.ganhou(jvezes).equals("null")){
               
               break;
           }
        do{
            String str_x = 
            String.valueOf(numero);
            
            posi = str_x;
            
            while(!Jogo.Verdade(posi)){
                posi = ler.next();
            vale = 0;
        
            Jogo.jogada(posi, "0");
            vale = 1;
            }while (vale == 0);{
            System.out.println("Fim");
        }
            
            
       

        

        }
        }
}
}


