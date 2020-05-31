# Assignment-1

### CLOTHES :

##### Baju Kurung 

~~~public class BajuKurung extends clothes
{
   
   public static void scarf() {
      System.out.println("Wearing scarf on the head");
   }
   
   public static void colour() {
      System.out.println("colourfull"); 
   } 
   
    public static void silky() {
       System.out.println("SilkyDress"); 
    }

}
~~~

##### Cheongsam

~~~public class Cheongsam extends clothes
{

   public static void collar() {
      System.out.println("A silk one piece dress with a collar, either in the centre or on the side");
   }
   
   public static void skirt() {
      System.out.println("a long skirt ");
   }
   
    public static void silky() {
       System.out.println("silkyDress");
    }
}
~~~


##### Sari

~~~public class Sari extends clothes
{
 
  public static void sixYard() {
      System.out.println("Sari is a six yard piece of cloth");
   }
   
   public static void thin() {
      System.out.println("thin");
   }
   
    public static void silky() {
       System.out.println("silkyDress");
    }
   
}
~~~

##### Clothes (overloading)

~~~public class clothes
{
   
   public static void silky() {
      system.out.println("silkyDress");
   }
}
~~~

##### Main
~~~public class Main
{
   
   public static void main(String[] args){
   
   BajuKurung c1 = new BajuKurung();
   c1.scarf();
   c1.colour();
   c1.silky();
   
   Cheongsam c2 = new Cheongsam();
   c2.collar();
   c2.skirt();
   c2.silky();
   
   Sari c3 = new Sari();
   c3.sixYard();
   c3.thin();
   c3.silky(); 
   }
}
~~~

### Output 

~~~ 
----jGRASP exec: java Main
scarf
colourfull
SilkyDress
collar
skirt
silkyDress
sixYard
thin
silkyDress

 ----jGRASP: operation complete.
