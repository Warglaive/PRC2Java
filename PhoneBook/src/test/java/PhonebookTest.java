/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Warglaive
 */
public class PhonebookTest {

    private Phonebook phonebook;

    @Test
    @BeforeEach
    public void setup() {
        this.phonebook = new Phonebook();
    }

    @Test
    public void phonebookSearchByNameNotFound() {
        assertThat(phonebook.searchByName("Jukka")).isNull();
    }

    @Test
    public void phonebookAddsEntry() {
        phonebook.add("Pekka", "040-123456");
        assertThat(phonebook.searchByName("Pekka")).contains("040-123456");
    }
}
