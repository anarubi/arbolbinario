/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author ana
 */
public class Nodo {
    
    protected Object dato;
    protected Object izdo;
    protected Object dcho;
    
    public Nodo (Object valor){
        dato= valor;
        izdo = dcho = null;
    }
    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho){
        this(dato);
        izdo = ramaIzdo;
        dcho = ramaDcho;
        
    }
    public Object valorNodo(){
        return valor;
        
    }
    public Nodo subarbolIzdo(){
        return izdo;
    }
    
    public Nodo subarbolDcho(){
        return dcho;
    
}
   public void nuevoValor(Object){
    dato = d;
    
}
public void ramaIzdo(Nodo n){
    izdo = n;
}
public void ramaDcho(Nodo n){
    dcho = n;
}
}
