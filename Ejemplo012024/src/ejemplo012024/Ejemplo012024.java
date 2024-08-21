/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo012024;

/**
 *
 * @author UNIVALLE
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Ejemplo012024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        Persona p = new Persona();
        String nombre = JOptionPane.showInputDialog("ingrese el nombre");
        String correo = JOptionPane.showInputDialog("ingrese el correo");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));

        p.setNombre(nombre);
        p.setCorreo(correo);
        p.setEdad(edad);

        JOptionPane.showMessageDialog(null, p);

        ArrayList<Persona> personas = new ArrayList<Persona>();
        // se creo la estructura de datos de varias personas
        personas.add(p); //se agrega objeto existente 
        personas.add(new Persona("Shannel", "ja@gmail.com", 22)); //creamos uno nuevo
        
        int i=0;
        while(i<=4){
            Persona p2 = new Persona();
            String nombre2 = JOptionPane.showInputDialog("ingrese el nombre");
            String correo2 = JOptionPane.showInputDialog("ingrese el correo");
            int edad2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
            
            //personas.add(new Persona("Shannel", "ja@gmail.com", 22));
            
            personas.add(p2); //se agrega objeto existente
            int respuesta = JOptionPane.showConfirmDialog(null,
             "Quieres continuar?", "Elije una", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.NO_OPTION){
                break;
            }

            i++;
        }
        JOptionPane.showMessageDialog(null,personas);
        String pregunta = JOptionPane.showInputDialog("que correo buscas?");
        for(i=0; i< personas.size(); i++){
            if (pregunta.equals(personas.get(i).getCorreo())){
                JOptionPane.showMessageDialog(null, personas.get(i));
            }
        }
        
       
            
            
        

    }

    private static void SystemOutPrintIn() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
