public class Trabajador{
    private String nombre;
    private String ciudad;
    private float salarioBruto;
    private boolean contratoTemporal;
    
    
    // Setters y Getters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
        public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    }
    
        public void setSalarioBruto(float salarioBruto){
        this.salarioBruto=salarioBruto;
    }
    
        public void setContratoTemporal(boolean contratoTemporal){
        this.contratoTemporal=contratoTemporal;
    }
    
    
    
        public String getNombre(){
        return this.nombre;
    }
    
        public String getCiudad(){
        return this.ciudad;
    }
    
        public float getSalarioBruto(){
        return this.salarioBruto;
    }
    
        public boolean getContratoTemporal(){
        return this.contratoTemporal;
    }
    
    
    public void fichaTrabajador(){
        System.out.println("El trabajador "+this.getNombre()+" trabaja en "+this.getCiudad()+" con un salario bruto de "+this.getSalarioBruto()+"€ y un contrato temporal: "+this.getContratoTemporal());
    }
}
