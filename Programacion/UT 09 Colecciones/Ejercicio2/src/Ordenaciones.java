
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import Modelos.*;
import Comparadores.*;

import java.util.ArrayList;

public class Ordenaciones  {

    public static void main(String[] args) {
        ArrayList<Producto> productos = DAOproductos.getProductos(); 
        ArrayList<Producto> copia;

        mostrarColeccion(productos);
        
        System.out.println(" --- COLECCION SIN ORDENAR --- ");
        copia = copiarProductos(productos);
        System.out.println(" --- COLECCION POR NOMBRE ---");
        Collections.sort(productos); 

        
        System.out.println(" --- COLECCION SIN ORDENAR --- ");
        mostrarColeccion(productos);

        System.out.println( " --- COLECCION ORDENADA POR ALTO ---");
        mostrarColeccion(ordenarAltoProducto(productos));

        System.out.println(" --- COLECCION SIN ORDENAR --- ");
        mostrarColeccion(productos);

        System.out.println(" --- COLECCION ORDENADA POR ANCHO ---");
        mostrarColeccion(ordenarAnchoProducto(copia));
        
        
        System.out.println(" --- COLECCION SIN ORDENAR --- ");
        mostrarColeccion(productos);

        System.out.println(" --- COLECCION ORDEBADA POR LARGO");
        mostrarColeccion(ordenarLargoProducto(copia));

        
        
                
            }
          
            public static ArrayList<Producto> ordenarAltoProducto(ArrayList<Producto> coleccion) {
             
                Collections.sort(coleccion,new ComparadorPorAlto());
        
                return coleccion; 
            }
        
            
           
            public static ArrayList<Producto> ordenarAnchoProducto(ArrayList<Producto> coleccion) {
               Collections.sort(coleccion, new ComparadorPorLargo());  // Sort using the length comparator
                return coleccion;
            }
        
          
            public static ArrayList<Producto> ordenarLargoProducto(ArrayList<Producto> coleccion) {
                Collections.sort(coleccion, new ComparadorLargo());
                return coleccion;
            }
        
            private static void mostrarColeccion(ArrayList<Producto> coleccion){
        
                Iterator<Producto> it = coleccion.iterator();
                while (it.hasNext()) {
                    Producto p = it.next();
                    System.out.println(p);
                }
        
            }
        
            private static ArrayList<Producto> copiarProductos(ArrayList<Producto> productos){
        ArrayList<Producto>  copia = new ArrayList<>(); 
        //copia = new ArrayList<>(productos); 
        for(Producto p: productos){
            copia.add(p); 
        }
        return copia; 
    }


    }

    

