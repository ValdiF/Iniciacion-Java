import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Subclase1 subclase1 = new Subclase1(20,9.95f,true);
       
       subclase1.setPrecio(8.95f);
       
       System.out.println(subclase1.getUnidades()+" unidades");
       System.out.println(subclase1.getPrecio()+" euros");
       System.out.println(subclase1.getAprobado());
       System.out.println(subclase1.total()+" euros en total");  
       
       
       String texto=subclase1.informar("Alicia");
       System.out.println(texto);
    }
}
