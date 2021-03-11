package paulinaksienzyk.com.github.task3;

import paulinaksienzyk.com.github.task3.Person.Gender;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Let's practice writing and reading objects.
 *
 * <lo>
 * <li>First go to {@code Person} class and change it so that it can be serialized.</li>
 * <li>Implement methods below.</li>
 * </lo>
 * The read file should return to us a correctly serialized object of the Person class.
 */
public class PersonSerializer {

    public static void main(String[] args) {

        Person person = new Person(3884240001L, "Roman", Gender.MALE, LocalDate.of(1980, 4, 30));
        serializePerson(person);
        Person deserializedPerson = deserializePerson("person.ser");
        System.out.println(Objects.requireNonNull(deserializedPerson).toString());

    }

    static void serializePerson(Person person) {
        // TODO 1: Implement this method to write an person to a 'person.ser' file.
    }

    static Person deserializePerson(String fileName) {
        // TODO 1: Implement this method to write an person to a 'person.ser' file.
        return null;
    }
}
