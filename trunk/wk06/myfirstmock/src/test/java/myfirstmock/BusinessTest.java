package myfirstmock;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import static org.mockito.ArgumentMatchers.anyString;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Mock the docs.
 *
 * @author Pieter van den Hombergh {@code p.vandenhombergh@fontys.nl}
 */
@ExtendWith( MockitoExtension.class )
public class BusinessTest {

    /**
     * Let us see the business use the printer
     */
    //@Disabled
    @Test
    public void doesItPrint() {
        //TODO use mocks to test the business
        fail("does It Print completed, You know what that means.");
    }

    @Mock
    Printer printer; // <1>

    Business business;

    @BeforeEach
    void setup() {
        //TODO setup business with mock
    }

    /**
     * Ensure that the business prints the proper text to the (mocked) printer.
     */
    @Test
    void doesItPrintBusiness() {
        //TODO setup ArgumentCaptor  to collect what printer receives and verify proper printing
        fail("test doesItPrintBusiness completed, you know what that means.");
    }
}
