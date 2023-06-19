package ru.hogwarts.school.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.repository.FacultyRepository;
import ru.hogwarts.school.service.FacultyService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.hogwarts.school.Constants.Constants.*;

@ExtendWith(MockitoExtension.class)
class FacultyControllerTest {
    @Mock
    private FacultyRepository facultyRepository;
    @InjectMocks
    private FacultyService out;

    @Test
    void createFaculty() {
        Mockito.when(facultyRepository.save(FACULTY1)).thenReturn(FACULTY1);
        Faculty test = out.createFaculty(FACULTY1);
        assertEquals(FACULTY1, test);
    }

    @Test
    void getFaculty() {
        Mockito.when(facultyRepository.findById(2L)).thenReturn(Optional.of(FACULTY2));
        assertEquals(FACULTY2, out.getFaculty(2));
    }

    @Test
    void updateFaculty() {
        Mockito.when(facultyRepository.findById(2L)).thenReturn(Optional.of(FACULTY2));
        assertEquals(FACULTY2, out.getFaculty(2));
        assertEquals(UPDATEFACULTY, out.updateFaculty(UPDATEFACULTY));
    }

    @Test
    void deleteFaculty() {
        Mockito.when(facultyRepository.findById(3L)).thenReturn(Optional.of(FACULTY3));
        assertEquals(FACULTY3, out.getFaculty(3));
        assertEquals(FACULTY3, out.deleteFaculty(3));
    }

    @Test
    void getFacultiesByColor() {
        Mockito.when(facultyRepository.findFacultiesByColor("White")).thenReturn(FACULTY_LIST);
        assertEquals(FACULTY_LIST, out.filterFacultiesAtColor("White"));
    }

    @Test
    void allFaculties() {
        Mockito.when(facultyRepository.findAll()).thenReturn(ALLFACULTIES);
        assertEquals(ALLFACULTIES, out.getAll());
    }
}