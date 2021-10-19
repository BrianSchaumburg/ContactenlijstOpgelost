package domain;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class ContactTest {
    //todo testen controleren
    Contact contact;

    @Before
    public void setUp() throws Exception {
        contact = new Contact("ann.verelst@gmail.com", false);
    }


    @Test

    public void test_OphogingMails_Geldig_Getal() {
        contact.ophogenOntvangenMails(10);
        assertEquals(10, contact.getOntvangenMails());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_OphogingMails_Ongeldig_Getal() {
        contact.ophogenOntvangenMails(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_OphogingMails_Nul() {
        contact.ophogenOntvangenMails(0);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_lege_String_Objectaanmaking() {
        contact = new Contact("", false);
    }


    @Test
    public void reset() {
        contact.reset();
        assertEquals(0, contact.getOntvangenMails());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_email_geen_at() {
        contact = new Contact("brian.schaumburg.telenet.be", false);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_email_geen_punt() {
        contact = new Contact("brianschaumburg@telenetbe", false);
    }
}