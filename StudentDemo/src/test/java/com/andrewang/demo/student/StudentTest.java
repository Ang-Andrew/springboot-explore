package com.andrewang.demo.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;


class StudentTest {

    private static final String NAMETEST = "Jane Doe";
    private static final LocalDate DOBTEST = LocalDate.of(1981, Month.JANUARY, 1);
    private static final String EMAILTEST = "jane.doe@gmail.com";

    @Test
    public void createStudent() {

        Student student = new Student(NAMETEST, DOBTEST, EMAILTEST);
        assertSame(student.getName(), NAMETEST);
        assertSame(student.getDob(), DOBTEST);
        assertSame(student.getEmail(), EMAILTEST);

    }


}