/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package projekt_1_npto;
import java.util.Random;

/**
 *
 * @author student
 */
public class Projekt_1_NPTO {

   
    
    public static void main(String[] args) {
        int N = 12;
        int []tab = new int[N];
        Random rand = new Random();
        for (int i = 0; i<N; i++){
            tab[i] = rand.nextInt(20);
            System.out.println(tab[i]);
        }
        
        tab[4] = 999;
        System.out.println(tab[4]);
        
        String abc;
        abc = "zielone markizy";
        
        System.out.println(abc);
        
        for(int i = 0; i<N; i++){
            tab[i] = tab[i] + 3;
            System.out.println(tab[i]);
        }
    }
    
}
