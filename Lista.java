public class Lista {
 
    class Nodo {
        int dato;
        Nodo sigui;
    }
 
    private Nodo origen;
    
    public Lista () {
        origen = null;
    }
    
    public void insertar(int x) {
     Nodo nuevo;
        nuevo = new Nodo();
        nuevo.dato = x;
        if (origen == null)
        {
            nuevo.sigui = null;
            origen = nuevo;
        }
        else
        {
            nuevo.sigui = origen;
            origen = nuevo;
        }
    }
    
    public int extraer ()
    {
        if (origen!=null)
        {
            int informacion = origen.dato;
            origen = origen.sigui;
            return informacion;
        }
        else
        {
            return Integer.MAX_VALUE;
        }
    }
    
    public void imprimir() {
        Nodo reco = origen;
        System.out.println("Listado de todos los elementos de la pila.");
        while (reco!=null) {
            System.out.print(reco.dato+"-");
            reco=reco.sigui;
        }
        System.out.println();
    }
    
    public static void main(String[] ar) {
        Lista pila1=new Lista();
        pila1.insertar(10);
        pila1.insertar(40);
        pila1.insertar(3);
        pila1.imprimir();
        System.out.println("Extraemos de la pila:"+pila1.extraer());
        pila1.imprimir();        
    }
}