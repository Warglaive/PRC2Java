
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class Phonebook {

    private ArrayList<Person> entries;

    public Phonebook() {
        this.entries = new ArrayList<>();
    }

    public void add(String name, String number) {
        Person buffer = new Person(name, number);
        this.entries.add(buffer);
    }

    public void printAll() {
        for (Person i : this.entries) {
            i.toString();
        }
    }

    public String searchNumber(String name) {
        for (Person entry : this.entries) {
            if (entry.getName().equals(name)) {
                return entry.getNumber();
            }
        }
        return null;
    }

    public String searchByName(String name) {
        for (Person entry : this.entries) {
            if (entry.getName().equals(name)) {
                return name;
            }
        }
        return null;
    }
}
