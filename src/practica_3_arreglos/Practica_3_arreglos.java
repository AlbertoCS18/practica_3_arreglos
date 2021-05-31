/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_3_arreglos;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Alberto Corona
 */
public class Practica_3_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona personaUno = new Persona("Alberto","Corona","Sanchez","2462094343","albetyolo@gmail.com");
        Persona personaDos = new Persona("Juan","Lopez","Hernandez","2461234567","juanlo@gmail.com");
        Persona personaTres = new Persona("Francisco","Jimenez","Jimenez","2462452367","paco@gmail.com");
        ArrayList<Persona> arregloPersonas = new ArrayList<>();
        arregloPersonas.add(personaUno);
        arregloPersonas.add(personaDos);
        arregloPersonas.add(personaTres);
        System.out.println("Numero de personas actual: "+arregloPersonas.size());
        arregloPersonas.remove(0);
        System.out.println("Numero de personas actual: "+arregloPersonas.size());
        arregloPersonas.remove(personaDos);
        System.out.println("Numero de personas actual: "+arregloPersonas.size());
        for (int i = 0; i < arregloPersonas.size(); i++){
            System.out.println("Posicion en el arreglo: "+i);
            System.out.println("El nombre de la persona es: "+arregloPersonas.get(i).getNombre()+" "+arregloPersonas.get(i).getApellidoP()+" "+arregloPersonas.get(i).getApellidoM());
            System.out.println("El telefono es: "+arregloPersonas.get(i).getTelefono());
            System.out.println("El correo es: "+arregloPersonas.get(i).getCorreo());
        }
        
        for (Persona persona : arregloPersonas){
            System.out.println("El nombre de la persona es: "+persona.getNombre()+" "+persona.getApellidoP()+" "+persona.getApellidoM());
            System.out.println("El telefono es: "+persona.getTelefono());
            System.out.println("El correo es: "+persona.getCorreo());
        }
        
        HashMap<Integer,Persona> arregloPersonasDos = new HashMap<>();
        arregloPersonasDos.put(1, personaUno);
        arregloPersonasDos.put(2, personaDos);
        arregloPersonasDos.put(3, personaTres);
        System.out.println("Numero de personas en Hash: "+arregloPersonasDos.size());
        arregloPersonasDos.remove(1);
        System.out.println("Numero de personas en Hash: "+arregloPersonasDos.size());
        for (Integer integer : arregloPersonasDos.keySet()){
            System.out.println("El nombre de la persona en Hash es: "+arregloPersonasDos.get(integer).getNombre()+" "+arregloPersonasDos.get(integer).getApellidoP()+" "+arregloPersonasDos.get(integer).getApellidoM());
            System.out.println("El telefono en Hash es: "+arregloPersonasDos.get(integer).getTelefono());
            System.out.println("El correo en Hash es: "+arregloPersonasDos.get(integer).getCorreo());
        }
    }
    
}
