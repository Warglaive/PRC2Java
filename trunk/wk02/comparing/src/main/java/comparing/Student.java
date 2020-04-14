package comparing;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Simple example student.
 *
 * @author hom
 */
class Student {

    enum Gender {
        F, M, U
    }

    private final long sid;
    private final String firstName;
    private final String lastName;
    private final Gender gender;
    private final LocalDate dob;

    Student(long sid, String firstName, String lastName, LocalDate dob,
            Gender gender) {
        this.sid = sid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    Gender getGender() {
        return gender;
    }

    LocalDate getDob() {
        return dob;
    }

    long getSid() {
        return sid;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.firstName);
        hash = 73 * hash + Objects.hashCode(this.lastName);
        hash = 73 * hash + Objects.hashCode(this.gender);
        hash = 73 * hash + Objects.hashCode(this.dob);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.dob, other.dob)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return firstName + ", " + lastName + ", " + dob + ", " + gender;
    }

    static Student fromParams(String... params) {
        long sid = Long.parseLong(params[0]);
        String firstName = params[1];
        String lastName = params[2];
        LocalDate dob = LocalDate.parse(params[3]);
        Gender sex = Gender.valueOf(params[4]);
        return new Student(sid, firstName, lastName, dob, sex);
    }

    public String ctorString() {
        return String.format("new Student(%d,\"%s\",\"%s\","
                + "LocalDate.of(%d,%d,%d),"
                + "Gender.%s),", sid, this.firstName, lastName,
                dob.getYear(), dob.getMonthValue(),
                dob.getDayOfMonth(), gender);
    }

}
