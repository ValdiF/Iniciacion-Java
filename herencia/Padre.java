public abstract class Padre{ //con abstract no se puede instanciar una clase
    public String texto;
    public int num;
    
    public void Padre(String texto, int num){
        this.texto=texto;
        this.num=num;
    }
    
    public String saludar(){
        return "Hola, soy el padre";
    }
    
}
