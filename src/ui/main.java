package ui;

import domain.Contact;
import domain.Contactenlijst;

public class main {
    public static void main(String [] args)
    {
        Contact an = new Contact("an.verelst@gmail.com", true);
        Contact jan = new Contact("jan.janssens@telenet.be",true);
        Contact els = new Contact("els.anders@hotmail.com", false) ;

        Contactenlijst lijst = new Contactenlijst(an,"prive");
        System.out.println("Contactenlijst = " + lijst.getNaam());
        an.ophogenOntvangenMails(10);
        System.out.println(an.getEmail() + " "+ an.getFavoriet() + " " + "aantal mails verstuurd : "+ an.getOntvangenMails());
        els.ophogenOntvangenMails(2);
        System.out.println(jan.getEmail() + " "+ jan.getFavoriet() + " " + "aantal mails verstuurd : "+ jan.getOntvangenMails());
        System.out.println(els.getEmail() + " "+ els.getFavoriet() + " " + "aantal mails verstuurd : "+ els.getOntvangenMails());
        lijst.toevoegenContact(els); lijst.toevoegenContact(jan);
        System.out.println("Contact met het meest aantal verstuurde mails: " + lijst.meestVerstuurdeMails().getEmail());

        System.out.println("Aantal favorieten in de lijst: " + lijst.aantalFavorieten());

    }
}
