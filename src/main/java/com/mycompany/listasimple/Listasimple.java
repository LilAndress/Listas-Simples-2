package com.mycompany.listasimple;

import javax.swing.JOptionPane;

public class Listasimple {
    
    Nodo inicio;
    Listasimple(){
        inicio = null;
    }
    
    public void insertarInicio(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();

        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            inicio = nuevo;
        }
        else{
            nuevo.setEnlace(inicio);
            inicio = nuevo;
        }
    }
    
    public void insertarFinal(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            inicio = nuevo;
        }
        else{
            Nodo temporal = inicio;
            while(temporal.getEnlace()!=null){
                temporal = temporal.getEnlace();
            }
            temporal.setEnlace(nuevo);
        }
    }
    
        public void insertareleccion(String nombre, int edad, float promedio){
         if (inicio == null) {
        JOptionPane.showMessageDialog(null, "La lista está vacía, se insertará el nodo al inicio");
        insertarInicio(nombre, edad, promedio);
        return;
    }

    String nombreReferencia = JOptionPane.showInputDialog("Ingrese el nombre del nodo después del cual desea insertar el nuevo nodo:");
    Nodo nuevo = new Nodo();
    nuevo.setNombre(nombre);
    nuevo.setEdad(edad);
    nuevo.setPromedio(promedio);

    Nodo actual = inicio;
    boolean encontrado = false;

    // Recorrer la lista para encontrar el nodo con el nombre dado
    while (actual != null) {
        if (actual.getNombre().equals(nombreReferencia)) {
            encontrado = true;
            break;
        }
        actual = actual.getEnlace();
    }

    // Si se encontró el nodo, insertamos el nuevo nodo después del nodo encontrado
    if (encontrado) {
        nuevo.setEnlace(actual.getEnlace());
        actual.setEnlace(nuevo);
        JOptionPane.showMessageDialog(null, "Nodo insertado con éxito después de " + nombreReferencia);
    } else {
        JOptionPane.showMessageDialog(null, "No se encontró un nodo con el nombre especificado.");
    }
}
    public void consultar(){
        
        Nodo temporal = inicio;
        if(inicio==null){
        JOptionPane.showMessageDialog(null, "La lista está vacía");
        }else{
            do{
                JOptionPane.showMessageDialog(null, "Nombre: " + temporal.getNombre() + " edad: " +  temporal.getEdad() + " promedio: " + temporal.getPromedio());
                temporal = temporal.getEnlace();
            }while(temporal.getEnlace() != null);
        }
        
    }
}
