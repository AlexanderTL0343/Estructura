/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praticaprogramada1;
import java.util.Date;
/**
 *
 * @author alext
 */
public class PraticaProgramada1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante felipe;
        felipe = new Estudiante("Perez", "Fernadez", "Felipe", 12/2/2005);
         
        int[] nota = new int[10];
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ":");
        }
        felipe.Materias();
    }
    
}
