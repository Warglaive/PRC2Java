package comparing;

import static comparing.Student.Gender.F;
import static comparing.Student.Gender.M;
import static comparing.Student.Gender.U;
import static comparing.Students.st;
import static java.time.LocalDate.of;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.List;
import static org.assertj.core.api.Assertions.fail;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * The test students are defined in the class Students.
 *
 * @author Pieter van den Hombergh {@code p.vandenhombergh@fontys.nl}
 */
public class ComparingWithLambdasTest {

    /**
     * Unmodifiable list of students.
     */
    static final List<Student> students = List.of(
            st(3134521, "Malvina", "Moulden", of(1995, 1, 25), F),
            st(3134522, "Eugenio", "Elias", of(1998, 8, 9), M),
            st(3134523, "Eleanore", "Estey", of(1996, 7, 28), F),
            st(3134524, "Olympia", "Oliphant", of(1997, 3, 8), F),
            st(3134525, "Candi", "Cortinas", of(1997, 2, 23), F),
            st(3134526, "Edmundo", "Evett", of(1999, 4, 1), M),
            st(3134527, "Nicol", "Neufeld", of(1995, 5, 22), U),
            st(3134528, "Dewitt", "Dossey", of(1994, 8, 12), M),
            st(3134529, "Waneta", "Woodley", of(1997, 6, 6), F));
    static final Student malvina = students.get(0);
    static final Student eugenio = students.get(1);
    static final Student eleanore = students.get(2);
    static final Student olympia = students.get(3);
    static final Student candi = students.get(4);
    static final Student edmundo = students.get(5);
    static final Student nicol = students.get(6);
    static final Student dewitt = students.get(7);
    static final Student wanete = students.get(8);

    List<Student> modifiableList() {
        return new ArrayList<>(students);
    }

    /**
     * Compare student by student id. The student id is a long, use the
     * Long.compare(long,long) to do the actual comparison.
     */
    @Test
    void sortByStudentNumber() {
        List<Student> studentList = this.modifiableList();
        Comparator<Student> idComparatorCorrect = (s1, s2) -> {
            return Long.compare(s1.getSid(), s2.getSid());
        };
        studentList.sort(idComparatorCorrect);
        assertThat(studentList).containsExactly(
                malvina,
                eugenio,
                eleanore,
                olympia,
                candi,
                edmundo,
                nicol,
                dewitt,
                wanete
        );

        assertThat(studentList).isSortedAccordingTo(idComparatorCorrect);
    }

    /**
     * Create a lambda comparator to compare students by age. Use
     * assertThat().containsExactly() to verify that a list sorted by the
     * expected. Note that when dato of birth decreases, the age increases.
     */
    @Test
    void compareByAge() {
        // test sort by age
        //Get the list with students
        List<Student> studentList = this.modifiableList();
        //Make comparator to compare age 
        Comparator<Student> ageComparator = (s1, s2) -> {
            return s1.getDob().compareTo(s2.getDob());
        };
        //sort from yonger to older age
        studentList.sort(ageComparator);
        //test the sorting
        assertThat(studentList).containsExactly(
                dewitt,
                malvina,
                nicol,
                eleanore,
                candi,
                olympia,
                wanete,
                eugenio,
                edmundo
        );
    }

    /**
     * To compare use the
     * {@code Comparator.comparing(Function<? super T,​? extends U> keyExtractor)}
     * with getFirstName as the extractor.
     */
    @Test
    void compareByFirstName() {
        // sort by first name
        Comparator<Student> firstNameComparator = (s1, s2) -> {
            return s1.getFirstName().compareTo(s2.getFirstName());
        };
        List<Student> studentList = this.modifiableList();
        studentList.sort(firstNameComparator);
        assertThat(studentList).containsExactly(candi, dewitt, edmundo, eleanore, eugenio, malvina, nicol, olympia, wanete);
    }

    /**
     * Compare using the length of the last name. If this results in a tie,
     * compare by firstName
     */
  
    @Test
    void compareByLastNameLengthThenComparingFirstName() {
        List<Student> studentsList = this.modifiableList();
        Comparator<Student> lastNameLength = (s1, s2) -> {
            if (s1.getLastName().length() - s2.getLastName().length() == 0) {
                return s1.getFirstName().compareTo(s2.getFirstName());
            }
            return s1.getLastName().length() - s2.getLastName().length();
        };
        studentsList.sort(lastNameLength);
        assertThat(studentsList).isSortedAccordingTo(lastNameLength);
    }
}
