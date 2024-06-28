package com.sparta.cr;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestExampleTest {
    private Spartan chris;

    @BeforeEach
    void setup(){
        chris = new Spartan(1,"Chris","Java", LocalDate.of(2027,1,1));
    }

    @Nested
    @DisplayName("Hamcrest Spartan Tests")
    class hamcrestSpartanTests{
        @Test
        @DisplayName("Check that spartan is called Chris")
        void checkThatSpartanIsCalledChris(){
            assertThat(chris.getName(), equalTo("Chris"));
        }
        @Test
        @DisplayName("Check that spartan has a field called name")
        void checkThatSpartanHasFieldCalledName(){
            assertThat(chris, hasProperty("name"));
        }
        @Test
        @DisplayName("check that spartan has a field called course set to Java")
        void checkThatSpartanHasFieldCalledCourseSetToJava(){
            assertThat(chris, hasProperty("course",equalTo("Java")));
        }
    }
    @Nested
    @DisplayName("Hamcrest String Methods")
    class HamcrestStringMethods{
        @Test
        @DisplayName("Check that name is not empty")
        void checkThatNameIsNotEmptyOrNull(){
            assertThat(chris.getName(),is(not(emptyOrNullString())));
        }
        @Test
        @DisplayName("Check that name ends in ris")
        void checkThatNameEndsWithRis(){
            assertThat(chris.getName(), endsWith("ris"));
        }
        @Test
        @DisplayName("Check that date is valid Date")
        void checkThatDateIsValid(){
            assertThat(chris.getStartDate(), is(greaterThan(LocalDate.now())));
        }
        @Test
        @DisplayName("Check that spartan is a Spartan")
        void checkThatSpartanExists(){
            assertThat(chris, is(instanceOf(Spartan.class)));
        }
        @Test
        @DisplayName("Check that name begins with ch")
        void checkThatNameBeginsWith(){
            assertThat(chris.getName(), startsWith("Ch"));
        }
//        @Test
//        @DisplayName("")
    }
}
