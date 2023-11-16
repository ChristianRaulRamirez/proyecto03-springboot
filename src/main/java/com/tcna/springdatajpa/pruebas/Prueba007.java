package com.tcna.springdatajpa.pruebas;

import com.tcna.springdatajpa.entities.entity7.Alumno;
import com.tcna.springdatajpa.entities.entity7.Curso;
import com.tcna.springdatajpa.repositories.repository7.AlumnoRepository;
import com.tcna.springdatajpa.repositories.repository7.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Prueba007 implements CommandLineRunner {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        //Operaciones CRUD
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Juan");

        Alumno alumno2 = new Alumno();
        alumno1.setNombre("Ana");

        Curso curso1 = new Curso();
        curso1.setNombre("Matematicas");

        Curso curso2 = new Curso();
        curso1.setNombre("Historia");

        alumno1.getCursos().add(curso1);
        alumno2.getCursos().add(curso2);

        alumno2.getCursos().add(curso1);

        alumnoRepository.save(alumno1);
        alumnoRepository.save(alumno2);

        //Búsqueda
        Alumno alumnoRecuperado = alumnoRepository.findById(1L).orElse(null);
        System.out.println("Alumno recuperado : " + alumnoRecuperado.getNombre());

        Curso cursoRecuperado = cursoRepository.findById(1L).orElse(null);
        System.out.println("Curso recuperado : " + cursoRecuperado.getNombre());

        //Eliminar un estudiante por su ID utilizando el repositorio
        alumnoRepository.deleteById(1L);

        //Eliminar un curso por su ID
        cursoRepository.deleteById(1L);
    }
}
