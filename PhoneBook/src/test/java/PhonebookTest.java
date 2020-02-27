/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
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
}
