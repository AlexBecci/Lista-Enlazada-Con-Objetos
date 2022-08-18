package ListaEnlazadaSimpleConObjetos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista();
        int opcion = 0;
        do {
            String op = JOptionPane.showInputDialog(null,"Lista\n1-Insertar datos\n2-Mostrar datos\n6-Salir");
            opcion = Integer.parseInt(op);
            switch(opcion)
            {
                case 1:
                {
                    String nombre,apellido,anos;
                    int edad;
                    nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre");
                    apellido = JOptionPane.showInputDialog(null,"Ingrese su apellido");
                    anos = JOptionPane.showInputDialog(null,"Ingrese su edad");
                    edad = Integer.parseInt(anos);
                    lista.insertar(new Persona(nombre, apellido, edad));
                    break;
                }
                case 2:
                {
                    lista.mostrar();
                    break;
                }
                default:
                {
                    opcion = 6;
                    break;
                }
            }
                   
        } while (opcion != 6);
    }

}
