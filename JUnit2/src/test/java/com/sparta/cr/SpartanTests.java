package com.sparta.cr;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.time.LocalDate;
import java.util.stream.Stream;

public class SpartanTests {
    public static Stream<Arguments> getListOfNames() {
        return Stream.of(
                Arguments.of("Manish"),
                Arguments.of("Alex")
        );
    }

    @RepeatedTest(value = 10, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("Simple Test")
    void simpleTest() {
        Assertions.assertEquals(1, 1);
    }

    @Test
//    @Disabled("Waiting for method to be completed")
    @DisplayName("Check name of Spartan")
    void checkNameOfSpartan() {
        Assumptions.assumeFalse(true);
        Assertions.assertEquals(1, 1);

    }
    //Hooks
    //BeforeAll - once before all tests - static
    //BeforeEach - once before each test
    //AfterAll - once after all tests - static
    //AfterEach - once after each test
    //JUnit tests don't work in order, they work in parallel

    private static Spartan manish;

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        manish = new Spartan(1, "Manish", "Java", LocalDate.now());
        System.out.println(testInfo.getTestMethod());
        //Connect to database
        //instantiate variables
    }

    @BeforeEach
    void setup() {

    }

    @AfterEach
    void tearDown() {

    }

    @AfterAll
    static void tearDownAll() {
        //Disconnect from database
    }

    @ParameterizedTest
    @NullAndEmptySource
    @MethodSource("getListOfNames")
        //Can compare to Null and Empty
    void checkLengthOfString(String name) {
        Assertions.assertEquals(5, name.length());
    }

    // @CsvFileSource
    // @ValueSource

}
