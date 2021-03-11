package paulinaksienzyk.com.github.task3;

import java.time.LocalDate;

// TODO: Modify this class so that its objects can be serialized. Also are you sure we want to write
//  all these fields? What keyword would help us here?
class Person {

    static private String companyName = "Google";
    private final long SSN;
    private final String name;
    private final Gender gender;
    private final LocalDate birth;

    public Person(long SSN, String name, Gender gender, LocalDate birth) {
        this.SSN = SSN;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "SSN=" + SSN + " -> (shouldn't be here)" +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birth=" + birth +
                '}';
    }

    enum Gender {
        FEMALE,
        MALE
    }
}