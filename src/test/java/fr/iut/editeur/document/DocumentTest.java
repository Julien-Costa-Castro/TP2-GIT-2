package fr.iut.editeur.document;

import junit.framework.TestCase;

public class DocumentTest extends TestCase {

    public void testAjouter() {
        Document document = new Document();
        document.ajouter("Bonjour");
        assertEquals("Bonjour", document.getTexte());

        document.ajouter(" le");
        assertEquals("Bonjour le", document.getTexte());

        document.ajouter(" monde !");
        assertEquals("Bonjour le monde !", document.getTexte());
    }


    public void testClear() {
        Document document = new Document();
        document.setTexte("Hello");
        document.clear();
        assertEquals("a", document.getTexte());
    }
}
