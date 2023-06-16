package ru.hogwarts.school.controller;

import org.junit.jupiter.api.Test;
import ru.hogwarts.school.service.FacultyService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.hogwarts.school.Constants.Constants.*;

class FacultyControllerTest {
private final FacultyService out = new FacultyService();
    @Test
    void createFaculty() {
        assertEquals(FACULTY1, out.createFaculty(FACULTY0));
    }

    @Test
    void getFaculty() {
        out.createFaculty(FACULTY1);
        out.createFaculty(FACULTY2);
        out.createFaculty(FACULTY3);
        out.createFaculty(FACULTY4);
        assertEquals(FACULTY2, out.getFaculty(2));
    }

    @Test
    void updateFaculty() {
        out.createFaculty(FACULTY1);
        out.createFaculty(FACULTY2);
        out.createFaculty(FACULTY3);
        out.createFaculty(FACULTY4);
        assertEquals(UPDATEFACULTY, out.updateFaculty(UPDATEFACULTY));
    }

    @Test
    void deleteFaculty() {
        out.createFaculty(FACULTY1);
        out.createFaculty(FACULTY2);
        out.createFaculty(FACULTY3);
        out.createFaculty(FACULTY4);
        assertEquals(FACULTY3, out.deleteFaculty(3));
    }

    @Test
    void getFacultiesByColor() {
        out.createFaculty(FACULTY1);
        out.createFaculty(FACULTY2);
        out.createFaculty(FACULTY3);
        out.createFaculty(FACULTY4);
        assertEquals(FACULTY_LIST, out.filterFacultiesAtColor("White"));
    }
    @Test
    void allFaculties(){
        out.createFaculty(FACULTY1);
        out.createFaculty(FACULTY2);
        out.createFaculty(FACULTY3);
        out.createFaculty(FACULTY4);
        assertEquals(ALLFACULTIES, out.getAll());
    }
}