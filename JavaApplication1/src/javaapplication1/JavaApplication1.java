
package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {
    
    private String [][] tab = {{"1", "2", "3"},
                              {"4", "5", "6"}, 
                              {"7", "8", "9"}};
    
       public String Ver (){
           for (int linha = 0; linha < 3; linha++) {
               for (int coluna = 0; coluna < 3; coluna++) {
                   System.out.printf(" " + tab[linha][coluna]);
               }
               System.out.println("\n");
           }
           return null;
       }//---------------------------------
       
       public boolean Verdade (String posicao){
           for (int linha = 0; linha < 3; linha++){
               for (int coluna = 0; coluna < 3; coluna++) {
                   if(tab[linha][coluna].equals(posicao))
                       return true;
                   
               }
               
           }
          return false;
       }//----------------
       
       //metodo jogada
       public void jogada (String posicao, String j){
           if(posicao.equals("1"))
           tab[0][0] = j;
         else if(posicao.equals("2"))
            tab[0][1]=j;
        else if(posicao.equals("3"))
            tab[0][2]=j;
        else if(posicao.equals("4"))
            tab[1][0]=j;
        else if(posicao.equals("5"))
            tab[1][1]=j;
        else if(posicao.equals("6"))
            tab[1][2]=j;
        else if(posicao.equals("7"))
            tab[2][0]=j;
        else if(posicao.equals("8"))
            tab[2][1]=j;
        else if(posicao.equals("9"))
            tab[2][2]=j;

           
       }//--------------
       
       public String ganhou(int jogadas){
           String[] a = new String [8];
           String vencedor = "null";
           if(jogadas == 9){
               vencedor = "EMPATE";
           }
           a[0] = tab[0][0] + tab[0][1] + tab[0][2];
           a[1] = tab[1][0] + tab[1][1] + tab[1][2];
           a[2] = tab[2][0] + tab[2][1] + tab[2][2];
           
           a[3] = tab[0][0] + tab[1][0] + tab[2][0];
           a[4] = tab[0][1] + tab[1][1] + tab[2][1];
           a[5] = tab[0][2] + tab[1][2] + tab[2][2];
           
           a[6] = tab[0][0] + tab[1][1] + tab[2][2];
           a[7] = tab[0][2] + tab[1][1] + tab[2][0];
           
           for (int i = 0; i < a.length; i++) {
               if(a[i].equals("xxx")){
                   vencedor = "jogador 1";
               }else if(a[i].equals("000")){
                   vencedor = "jogador 2";
           }
       }
       return vencedor;
           
    }

       
    }
    

