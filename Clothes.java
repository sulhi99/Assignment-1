/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author H P
 */
public class Clothes {
    
    public static void main(String[] args){
        System.out.println("Welcome to our Boutique!!!");
                
        String BajuKurung[] = {"Scarf", "Colour", "Silky"};
        String Cheongsam[] = {"Collar", "Skirt", "Silky"};
        String Sari[] = {"SixYard", "Thin", "Silky"};
        int priceOfClothes[] = {100, 199, 200, 250, 300, 400};
        
        System.out.println("******BajuKurung items****");
        System.out.println(BajuKurung[0]);
        System.out.println(BajuKurung[1]);
        System.out.println(BajuKurung[2]);
        System.out.println("RM" + priceOfClothes[4]);
        
        System.out.println("******Cheongsam items*****"); 
        System.out.println(Cheongsam[0]);
        System.out.println(Cheongsam[1]);
        System.out.println(Cheongsam[2]);
        System.out.println("RM" + priceOfClothes[1]);
        
        System.out.println("********Sari items********");
        System.out.println(Sari[0]);
        System.out.println(Sari[1]);
        System.out.println(Sari[2]);
        System.out.println("RM" + priceOfClothes[2]);
  }
}
