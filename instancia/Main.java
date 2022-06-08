import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
       Trabajador trabajador = new Trabajador();
       
       trabajador.setNombre("Alicia");
       trabajador.setCiudad("Córdoba");
       trabajador.setSalarioBruto(1200.95f);
       trabajador.setContratoTemporal(true);
       
       trabajador.fichaTrabajador();
    }
}
