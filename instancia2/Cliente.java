public class Cliente{
    private String nombre;
    private String ciudad;
    private int presupuesto;
    
    public void setNombre(String nombre){
        
        this.nombre= nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    
    
       public void setCiudad(String ciudad){
        this.ciudad= ciudad;
    }
    
    public String getCiudad(){
        return this.ciudad;
    }
    
    
    
        public void setPresupuesto(int presupuesto){
        this.presupuesto= presupuesto;
    }
    
    public int getPresupuesto(){
        return this.presupuesto;
    }
    
    
}
