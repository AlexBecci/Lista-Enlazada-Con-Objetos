package ListaEnlazadaSimpleConObjetos;

import javax.swing.JOptionPane;

public class Lista {
    private Nodo cabeza;
    private Nodo fin;
    
    public Lista()
    {
        cabeza=null;
        fin = null;
    }
    
    public boolean estaVacia()
    {
        if(cabeza==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void insertar(Persona persona)
    {
        Nodo actual;
        if(estaVacia())
        {
            actual = new Nodo(persona,null);
            cabeza = actual;
            fin = actual;
        }
        else
        {
            actual = new Nodo(persona,null);
            fin.setSiguiente(actual);
            fin = actual;
        }
    }
    public void mostrar()
    {
        if(estaVacia())
        {
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
            return;
        }
        else
        {
            Nodo temporal;
            temporal = cabeza;
            while(temporal!=null)
            {
                JOptionPane.showMessageDialog(null,temporal.getPersona().toString());
                temporal = temporal.getSiguiente();
            }
        }
    }
}
