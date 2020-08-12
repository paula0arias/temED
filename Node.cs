using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
 
namespace Node
{
    class Node
    {
        
            public int dato;
            public Node sigui;

    
        private Node raiz;
    
        public Node () 
        {
            raiz=null;
        }
      
        void Insertar (int x) {
 
                Node nuevo = new Node ();
                nuevo.dato = x;
 
                    if (raiz == null){
                        nuevo.sigui = null;
                        raiz = nuevo;
                    }else{
                        nuevo.sigui = raiz;
                        raiz = nuevo;
                    }
                } 
 
        public int Extraer (int x)
        {
                  if (raiz!=null)
            {
                int informacion = raiz.dato;
                raiz = raiz.sigui;
                return informacion;
            }
            else
            {
                return int.MaxValue;
            }
        }
 
            
    
        public bool Vacia ()
        {
            if (raiz == null)
                return true;
            else
                return false;
        }
    
        public void Imprimir ()
        {
            Node reco = raiz;
            while (reco != null) 
            {
                Console.Write (reco.dato + "-");
                reco = reco.sigui;
            }
            Console.WriteLine();
        }
        
 
        static void Main(string[] args)
        {
            Node lg =new Node();
            lg.Insertar (10);
            lg.Insertar (20);
            lg.Insertar (30);
            lg.Insertar (15);
            lg.Insertar (115);
            lg.Imprimir ();
            Console.WriteLine("Luego de Extraer el segundo");
            lg.Extraer (2);
            lg.Imprimir ();
        }
    }
}
