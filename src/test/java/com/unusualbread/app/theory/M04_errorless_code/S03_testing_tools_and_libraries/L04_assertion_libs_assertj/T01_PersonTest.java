package com.unusualbread.app.theory.M04_errorless_code.S03_testing_tools_and_libraries.L04_assertion_libs_assertj;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

class PersonTest {

    @Test
    public void isEqualToObjectExample() {
        Person actual = new Person("John", "Doe", 30);
        Person expected = new Person("John", "Doe", 30);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void listAsserts() {
        List<String> languages = Arrays.asList("Java", "Python", "JavaScript");

        // Check if the list contains the given elements (order doesn't matter)
        assertThat(languages)
                .contains("Python", "Java");

        // Check if the list contains exactly the given elements (and nothing else) in any order
        assertThat(languages)
                .containsExactlyInAnyOrder("JavaScript", "Python", "Java");

        // Check if the list contains the given elements in the specified order
        assertThat(languages)
                .containsExactly("Java", "Python", "JavaScript");

        // Check if the list doesn't contain the given element
        assertThat(languages)
                .doesNotContain("PHP");
    }

    @Test
    public void setAsserts() {
        Set<String> languages = new HashSet<>(Arrays.asList("Java", "Python", "JavaScript"));

        // Check if the set contains the given elements
        assertThat(languages)
                .contains("Python", "Java");

        // Check if the set contains exactly the given elements (and nothing else)
        assertThat(languages)
                .containsExactlyInAnyOrder("JavaScript", "Python", "Java");

        // Check if the set doesn't contain the given element
        assertThat(languages)
                .doesNotContain("PHP");
    }

    @Test
    public void mapAsserts() {
        Map<String, Integer> languageRanks = new HashMap<>();
        languageRanks.put("Java", 1);
        languageRanks.put("Python", 2);
        languageRanks.put("JavaScript", 3);

        // Check if the map contains the given entry
        assertThat(languageRanks)
                .containsEntry("Python", 2);

        /*// Check if the map contains the given entries
        assertThat(languageRanks)
                .containsEntries(
                        new HashMap.SimpleEntry<>("Java", 1),
                        new HashMap.SimpleEntry<>("Python", 2)
                );*/

        // Check if the map contains the given key
        assertThat(languageRanks)
                .containsKey("Java");

        // Check if the map contains the given value
        assertThat(languageRanks)
                .containsValue(3);

        // Check if the map has the expected size
        assertThat(languageRanks)
                .hasSize(3);

        // Check if the map doesn't contain the given key
        assertThat(languageRanks)
                .doesNotContainKey("PHP");
    }

    @Test
    public void typeAsserts() {
        Object number = 42;

        // Check if the object is an instance of the specified class
        assertThat(number)
                .isInstanceOf(Integer.class);

        // Check if the object is an instance of any of the specified classes
        assertThat(number)
                .isInstanceOfAny(Integer.class, Long.class);

        // Check if the object is not an instance of the specified class
        assertThat(number)
                .isNotInstanceOf(String.class);

        // Check if the object is not an instance of any of the specified classes
        assertThat(number)
                .isNotInstanceOfAny(String.class, Float.class);
    }

    @Test
    public void fieldAsserts() {
        Person person = new Person("John", "Doe", 30);

        // Check if the object has the specified field with the given value
        assertThat(person)
                .hasFieldOrPropertyWithValue("firstName", "John");

        // Check if the object has the specified field (or property)
        assertThat(person)
                .hasFieldOrProperty("lastName");

        /*// Check if the object has the specified fields (or properties)
        assertThat(person)
                .hasFieldOrProperties("firstName", "age");

        // Check if the object doesn't have the specified field (or property)
        assertThat(person)
                .doesNotHaveFieldOrProperty("middleName");

        // Check if the object doesn't have the specified fields (or properties)
        assertThat(person)
                .doesNotHaveFieldOrProperties("middleName", "nickName");

        // Check if the object has a property with the given value
        assertThat(person)
                .hasPropertyWithValue("fullName", "John Doe");*/
    }

    @Test
    public void satisfiesAsserts() {
        Person person = new Person("John", "Brown", 30);

        // Check if the object satisfies the given condition(s)
        assertThat(person)
                .satisfies(p -> {
                    assertThat(p.firstName).isEqualTo("John");
                    assertThat(p.age).isGreaterThanOrEqualTo(18);
                });
    }

    @Test
    public void optionalAsserts() {
        Optional<String> presentOptional = Optional.of("AssertJ");
        Optional<String> emptyOptional = Optional.empty();

        // Check if the Optional is present (i.e., contains a value)
        assertThat(presentOptional)
                .isPresent();

        // Check if the Optional is empty (i.e., doesn't contain a value)
        assertThat(emptyOptional)
                .isEmpty();

        // Check if the Optional contains the specified value
        assertThat(presentOptional)
                .contains("AssertJ");

        /*// Check if the Optional doesn't contain the specified value
        assertThat(presentOptional)
                .doesNotContain("JUnit");*/

        // Check if the Optional contains a value that matches the given condition
        assertThat(presentOptional)
                .hasValueSatisfying(value -> assertThat(value).startsWith("Assert"));

        // Perform assertions on the value inside the Optional (if present)
        assertThat(presentOptional)
                .hasValueSatisfying(value -> {
                    assertThat(value).isNotEmpty();
                    assertThat(value).isEqualTo("AssertJ");
                });
    }

    @Test
    public void exceptionAsserts() {
        // Assert that an exception of the specified type is thrown
        assertThatThrownBy(() -> {
            throw new IllegalArgumentException("Invalid argument");
        }).isInstanceOf(IllegalArgumentException.class);

        // Assert that an exception with the specified message is thrown
        assertThatThrownBy(() -> {
            throw new IllegalArgumentException("Invalid argument");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid argument");

        // Assert that an exception with a message matching the specified pattern is thrown
        assertThatThrownBy(() -> {
            throw new IllegalArgumentException("Invalid argument");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageMatching("Invalid .*");

        // Assert that an exception with the specified cause is thrown
        Exception cause = new NullPointerException("Cause");
        assertThatThrownBy(() -> {
            throw new RuntimeException("Wrapper exception", cause);
        }).isInstanceOf(RuntimeException.class)
                .hasCause(cause);

        // Assert that an exception with a cause of the specified type is thrown
        assertThatThrownBy(() -> {
            throw new RuntimeException("Wrapper exception", cause);
        }).isInstanceOf(RuntimeException.class)
                .hasCauseInstanceOf(NullPointerException.class);
    }
}