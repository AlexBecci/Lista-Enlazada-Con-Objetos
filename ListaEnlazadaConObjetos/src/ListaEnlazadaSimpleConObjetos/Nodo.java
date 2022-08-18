
package ListaEnlazadaSimpleConObjetos;

public class Nodo {
    private Nodo siguiente;
    private Persona dato;
    
    public Nodo(Persona dato,Nodo siguiente)
    {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    public Nodo getSiguiente()
    {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }
    public Persona getPersona()
    {
        return dato;
    }
    public void setPersona(Persona dato)
    {
        this.dato = dato;
    }
}
