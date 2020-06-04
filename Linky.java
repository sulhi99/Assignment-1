
import java.util.Iterator;
import java.util.LinkedList;

public class Linky {
    
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<String>();
        
        linky.add("Cekak Musang");
        linky.add("Teluk Belanga");
        linky.add("Moden");
        System.out.println(linky);
        
        linky.remove(0);
        System.out.println(linky);
                
        Iterator it = linky.iterator();
        while (it.hasNext()) {
            if((String) it.next() == "Teluk Belanga") {
                System.out.println("We found it ! ");
            }
        }
        
        System.out.println(linky.getFirst());
        System.out.println(linky.getLast());
        
        linky.clear();
        System.out.println(linky);        
    }   
}
