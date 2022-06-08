public class Hija extends Padre{
    
 
    public String saludar(){ // Overwrite- sobreescritura del método saludar que hereda de la clase Padre
        return "Hola, soy la hija de mi padre";
    }
  
    public void Hija(String texto, int num){
        this.texto=texto;
        this.num=num;
        
    }
    
    public void prueba(){
        System.out.println(texto+num);
    }
}
