public class Main{
    public static void main(String[] args){
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        
        cliente1.setNombre("Indra");
        cliente1.setCiudad("Madrid");
        cliente1.setPresupuesto(1000);
        
       cliente1.setCiudad("Sevilla");    
        
       cliente2.setNombre("Vass");
       cliente2.setCiudad("Valencia");
       cliente2.setPresupuesto(12000);
       
       System.out.println("El cliente "+cliente1.getNombre()+"-"+cliente1.getCiudad()+" tiene un presupuesto de "+cliente1.getPresupuesto());
       System.out.println("El cliente "+cliente2.getNombre()+"-"+cliente2.getCiudad()+" tiene un presupuesto de "+cliente2.getPresupuesto());
       
    }
}
