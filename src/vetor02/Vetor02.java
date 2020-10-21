/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Scanner;


/**
 *
 * @author jucimardeb
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago",
            "Set","Out","Nov","Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        System.out.println("Digite o ano: ");
        Scanner an = new Scanner(System.in);  
        int ano = an.nextInt();
        int total = 0;
        
        for(int counter = 0; counter < tot.length; counter++ )
        total += tot[counter];
        
        if(ano % 4 == 0 && (ano % 400 == 0 || ano % 100 != 0 ))
         { 
            System.out.println("É um ano bissexto");
            System.out.println("Quantidade de dias: " + (total+1));
            tot[1]++;
            {
            for(int c=0; c<mes.length; c++){    
            System.out.println("O mês de " + mes[c] + " tem " +
                    tot[c] + " dias ao todo");
           
                    }
               }
            }else{System.out.println("Não é Bissexto");
            System.out.println("Quantidade de dias: " + total);{
            for(int c=0; c<mes.length; c++){
            System.out.println("O mês de " + mes[c] + " tem " +
                    tot[c]  + " dias ao todo");
                }
                
            }         
        }
    }
}
