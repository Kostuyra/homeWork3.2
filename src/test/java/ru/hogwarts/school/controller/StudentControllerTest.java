package ru.hogwarts.school.controller;

import org.junit.jupiter.api.Test;
import ru.hogwarts.school.service.StudentService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.hogwarts.school.Constants.Constants.*;

class StudentControllerTest {
private final StudentService out = new StudentService();
    @Test
    void createStudent() {
        assertEquals(STUDENT1, out.createStudent(STUDENT0));
    }

    @Test
    void getStudent() {
        out.createStudent(STUDENT1);
        out.createStudent(STUDENT2);
        out.createStudent(STUDENT3);
        out.createStudent(STUDENT4);
        assertEquals(STUDENT2, out.getStudent(2));
    }

    @Test
    void updateStudent() {
        out.createStudent(STUDENT1);
        out.createStudent(STUDENT2);
        out.createStudent(STUDENT3);
        out.createStudent(STUDENT4);
        assertEquals(UPDATESTUDENT, out.updateStudent(UPDATESTUDENT));
    }

    @Test
    void deleteStudent() {
        out.createStudent(STUDENT1);
        out.createStudent(STUDENT2);
        out.createStudent(STUDENT3);
        out.createStudent(STUDENT4);
        assertEquals(STUDENT3, out.deleteStudent(3));
    }

    @Test
    void getStudentsEquallyAge() {
        out.createStudent(STUDENT1);
        out.createStudent(STUDENT2);
        out.createStudent(STUDENT3);
        out.createStudent(STUDENT4);
        assertEquals(STUDENT_LIST, out.filterStudentsByAge(20));
    }

    @Test
    void allStudents(){
        out.createStudent(STUDENT1);
        out.createStudent(STUDENT2);
        out.createStudent(STUDENT3);
        out.createStudent(STUDENT4);
        assertEquals(ALLSTUDENTS, out.getAll());
    }
}