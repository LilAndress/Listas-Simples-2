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
    
    
    public void insertarEnPosicion(String nombre, int edad, float promedio) {
    if (inicio == null) {
        insertarInicio(nombre, edad, promedio);
        return;
    }

    int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición donde desea insertar el nodo (comenzando desde 0):"));

    Nodo nuevo = new Nodo();
    nuevo.setNombre(nombre);
    nuevo.setEdad(edad);
    nuevo.setPromedio(promedio);

    if (posicion <= 0) {
        nuevo.setEnlace(inicio);
        inicio = nuevo;
        return;
    }

    Nodo actual = inicio;
    for (int i = 0; i < posicion - 1 && actual.getEnlace() != null; i++) {
        actual = actual.getEnlace();
    }

    nuevo.setEnlace(actual.getEnlace());
    actual.setEnlace(nuevo);
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
        
     public void eliminarPorSeleccion() {
    if (inicio == null) {
        JOptionPane.showMessageDialog(null, "La lista está vacía.");
        return;
    }

    // Mostrar los nombres de los nodos y pedir al usuario que ingrese uno
    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nodo a eliminar:");

    if (nombre == null || nombre.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se ha ingresado un nombre.");
        return;
    }

    // Eliminar el primer nodo si coincide
    if (inicio.getNombre().equalsIgnoreCase(nombre)) {
        inicio = inicio.getEnlace();
        JOptionPane.showMessageDialog(null, "Nodo eliminado: " + nombre);
        return;
    }

    // Buscar y eliminar el nodo
    Nodo actual = inicio;
    while (actual.getEnlace() != null && !actual.getEnlace().getNombre().equalsIgnoreCase(nombre)) {
        actual = actual.getEnlace();
    }

    if (actual.getEnlace() != null) {
        actual.setEnlace(actual.getEnlace().getEnlace());
        JOptionPane.showMessageDialog(null, "Nodo eliminado: " + nombre);
    } else {
        JOptionPane.showMessageDialog(null, "No se encontró un nodo con ese nombre.");
    }
}
        
        public void ordenarPorNombreAscendente() {
    if (inicio == null || inicio.getEnlace() == null) {
        // La lista está vacía o solo tiene un nodo
        return;
    }

    Nodo actual = inicio;
    while (actual != null) {
        Nodo siguiente = actual.getEnlace();
        while (siguiente != null) {
            // Comparar nombres y, si es necesario, intercambiar datos
            if (actual.getNombre().compareToIgnoreCase(siguiente.getNombre()) > 0) {
                // Intercambio de datos de los nodos
                String tempNombre = actual.getNombre();
                actual.setNombre(siguiente.getNombre());
                siguiente.setNombre(tempNombre);
                
                int tempEdad = actual.getEdad();
                actual.setEdad(siguiente.getEdad());
                siguiente.setEdad(tempEdad);
                
                float tempPromedio = actual.getPromedio();
                actual.setPromedio(siguiente.getPromedio());
                siguiente.setPromedio(tempPromedio);
            }
            siguiente = siguiente.getEnlace();
        }
        actual = actual.getEnlace();
    }
    JOptionPane.showMessageDialog(null, "Lista ordenada alfabéticamente por nombre.");
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
