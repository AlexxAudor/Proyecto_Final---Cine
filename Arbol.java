public class Arbol {
    
    Nodo raiz;
    public Arbol(){
        raiz = null;
    }
    
    private class Nodo{
    
        public Nodo padre;
        public Nodo sala1;
        public Nodo sala2;
        public Nodo sala3;
        public int llave;
        public Object contenido;
        
        
        public Nodo(int indice){
        llave = indice;
        sala1=null;
        sala2=null;
        sala3=null;
        padre=null;
        contenido=null;
    }
 
    }
  
    public void insertar(int i, Object estado){
        Nodo n = new Nodo(i);
        n.contenido=estado;
        
        
        if (raiz==null) {
            raiz=n;
        }else{
           
            Nodo aux = raiz;
            
            while(aux != null){
                
                n.padre = aux;
                
                if (n.llave <=aux.llave) {
                        aux=aux.sala2;
                }else{ 
                        aux=aux.sala1;
                }

                
            }
            
            if (n.llave > n.padre.llave) {
                n.padre.sala1 = n;
            }else{
                n.padre.sala2=n;
            }
        }
    }
    
    
    
    public void recorrer(Nodo n){
        if (n != null) {
            
            recorrer(n.sala2);
            System.out.println("sala: " +n.llave+" estado de sala: " + n.contenido);
            recorrer(n.sala1);
            recorrer(n.sala3);
 
            
        }
    }
    
  
    
    
    
}

