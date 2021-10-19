package domain;

import domain.Contact;

import java.util.ArrayList;

public class Contactenlijst {
    private final ArrayList<Contact> contactenLijst = new ArrayList<>();
    private String naam;

    public Contactenlijst(Contact contact, String naam) {
        setNaam(naam);
        if (contact != null)
            contactenLijst.add(contact);
    }

    public void setNaam(String naam) {
        if (naam.isBlank())
            throw new NullPointerException("Check de parameter");
        this.naam = naam;
    }

    public void toevoegenContact(Contact contact) {
        if (contactenLijst.size() == 3)
            throw new IllegalArgumentException("De lijst kan niet meer gevuld worden en is dus al vol");

        for (int i = 0; i < contactenLijst.size(); i++) {
            if (contactenLijst.get(i).getEmail().equals(contact.getEmail()))
                throw new IllegalArgumentException("De email zit al in de lijst");
        }
        contactenLijst.add(contact);
    }

    public Contact meestVerstuurdeMails() {
        int max = 0;
        int index = 0;
        for (int i = 0; i < contactenLijst.size(); i++) {
            if (max < contactenLijst.get(i).getOntvangenMails()) {
                max = contactenLijst.get(i).getOntvangenMails();
                index = i;
            }

        }
        return contactenLijst.get(index);
    }

    public int aantalFavorieten() {
        int aantal = 0;
        for (int i = 0; i < contactenLijst.size(); i++) {
            if (contactenLijst.get(i).isFavoriet() == true)
                aantal++;

        }
        return aantal;
    }

    public String getNaam() {
        return naam;
    }
}
