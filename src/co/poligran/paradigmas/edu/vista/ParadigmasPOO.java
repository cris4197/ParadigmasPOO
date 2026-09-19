/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.poligran.paradigmas.edu.vista;
import co.edu.poligran.paradigmas.modelo.DAOs.EstudianteDAO;
import co.edu.poligran.paradigmas.modelo.Estudiante;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CRISTIAN
 */
public class ParadigmasPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Estudiante> misEstudiantes = new ArrayList<Estudiante>();
        Scanner sc = new Scanner (System.in);
        
        Estudiante alum1 = new Estudiante();
        
        Estudiante miEstudiante;
        
        EstudianteDAO miDAO ;
        
        miDAO = new EstudianteDAO();
        boolean bandera = true;
        do{
            
System.out.print("Ingresa tu nombre: "); 
String entradaNombre= sc.next();


System.out.print("Ingresa tu edad: "); 
int entradaEdad= sc.nextInt();


System.out.print("Ingresa tu Id de estudiante: "); 
int entradaId= sc.nextInt();


miEstudiante = new Estudiante(entradaId,entradaNombre,entradaEdad);
miDAO.crearEstudiante(miEstudiante, misEstudiantes);
miDAO.verLista(misEstudiantes);
System.out.println("Para agregar más estudiantes, digite 1");
Integer param = sc.nextInt();
if(param.compareTo(1)!=0){
   bandera = false;
}
}while(bandera);

    }
    
}
