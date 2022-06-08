import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       
       
       Cantante cantante1= new Cantante();
       Actor actor1= new Actor();
       Bailarina bailarina1= new Bailarina();
       Cantante cantante2= new Cantante();
       Actor actor2= new Actor();
       Bailarina bailarina2= new Bailarina();
       
       System.out.println(cantante1.interpretar());
       System.out.println(actor1.interpretar());
       System.out.println(bailarina1.interpretar());
       
       Interprete interpretes[]={cantante1, actor1, bailarina1, cantante2, actor2, bailarina2};
       System.out.println(interpretes[4].interpretar()); //ejemplo de polimorfismo por herencia en
       //el que todas las clases heredan un método en común de su padre, pero cada uno la ejecuta 
       //a su manera y desde un array en el que se encuentran todas estas clases instanciadas podemos elegir cual ejecutar
    }  
}
