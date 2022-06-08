public class Subclase1 extends Base{
    private int unidades;
    private float precio;
    private boolean aprobado;
    private float total;
    
    //constructor
    public Subclase1(int u, float p, boolean a){
        this.unidades=u;
        this.precio=p;
        this.aprobado=a;
    }
    
    //setters y getters
    public void setUnidades(int unidades){
        this.unidades=unidades;
    }
     public void setPrecio(float precio){
        this.precio=precio;
    }
     public void setAprobado(boolean aprobado){
        this.aprobado=aprobado;
    }
    
    public int getUnidades(){
        return this.unidades;
    }
    public float getPrecio(){
        return this.precio;
    }
     public boolean getAprobado(){
        return this.aprobado;
    }
    
    
    
    public float total(){
        total=unidades*precio;
        return this.total;
    }
    
      public String informar(String texto){
      return "hola , este es el mensaje de la clase hija y de "+texto; 
   } 
}
