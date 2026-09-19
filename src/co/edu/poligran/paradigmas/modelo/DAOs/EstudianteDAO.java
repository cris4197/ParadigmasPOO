/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.poligran.paradigmas.modelo.DAOs;
import co.edu.poligran.paradigmas.modelo.Estudiante;
import java.util.List;

/**
 *
 * @author CRISTIAN
 */
public class EstudianteDAO {
     public List<Estudiante> crearEstudiante(Estudiante miEstudiante, List<Estudiante> miLista){
    
        miLista.add(miEstudiante);
        
        return miLista;
    }
     public void verLista(List<Estudiante> miLista){
        System.out.println(miLista);
    }


    
}
