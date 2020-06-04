import java.util.ArrayList;

public class ArrayListsProj {
    
    public static void main(String[] args) {
        
        String[] BajuKurung = new String[3];
        BajuKurung[0] = "Cekak Musang"; 
        BajuKurung[1] = "Teluk Belanga";
        BajuKurung[2] = "Moden";
        System.out.println(BajuKurung[1]);
        
        ArrayList BajuKurungList = new ArrayList();
        BajuKurungList.add("Cekak Musang");
        BajuKurungList.add("Teluk Belanga");
        BajuKurungList.add("Sari");   
        BajuKurungList.add("Kedah");
        
        BajuKurungList.remove("Teluk Belanga");
        System.out.println(BajuKurungList);
     
    }
}
