public class ArbolBina {
 
    Nodo Raiz;
 
    public ArbolBina(){
        Raiz= null;
    }
 
    public void introducirValor(int i){
        Nodo nodo = new Nodo(i);
 
        if(Raiz == null){
            Raiz = nodo;
        }else{
            Nodo aux = Raiz;
            while(aux != null){
                nodo.raizPrin = aux;
                if(nodo.valor >= aux.valor){
                    aux = aux.der;
                }else{
                    aux = aux.izq;
                }
            }
            if(nodo.valor < nodo.raizPrin.valor){
                nodo.raizPrin.izq = nodo;
            }else{
                nodo.raizPrin.der = nodo;
            }
        }
 
    }
 
    public void imprimirArbol(Nodo nodo_raiz, int cont){
        if(nodo_raiz == null){
            return;
        }else{
            imprimirArbol(nodo_raiz.der, cont+1);
            for(int i = 0; i < cont; i++){
                System.out.print("   ");
            }
            System.out.println(nodo_raiz.valor);
            imprimirArbol(nodo_raiz.izq, cont+1);
        }
    }
 
    private class Nodo{
        public Nodo raizPrin;
        public int valor;
        public Nodo der;
        public Nodo izq;
 
        public Nodo(int indice){
            valor = indice;
            der = null;
            izq = null;
            raizPrin = null;
        }
    }

    

    public static void main(String[] args){
        ArbolBina Arbol = new ArbolBina();

        System.out.println("---------------------------------------------------------------------------------");
 
        Arbol.introducirValor(2);
        Arbol.introducirValor(4);
        Arbol.introducirValor(8);
        Arbol.introducirValor(10);
        Arbol.introducirValor(3);
        Arbol.introducirValor(5);
        Arbol.introducirValor(16);
        Arbol.introducirValor(18);
        Arbol.introducirValor(40);
        Arbol.introducirValor(15);
        Arbol.introducirValor(24);
        Arbol.introducirValor(26);
        Arbol.introducirValor(1);
        Arbol.introducirValor(30);
        
    
        Arbol.imprimirArbol(Arbol.Raiz,0);
    }
}
