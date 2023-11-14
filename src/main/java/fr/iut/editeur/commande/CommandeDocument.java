package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Cette classe est une classe abstraite qui représente une commande sur un document.
 * Elle implémente l'interface Commande.
 */
public abstract class CommandeDocument implements Commande {

    /**
     * Le document sur lequel la commande doit être exécutée.
     */
    protected Document document;

    /**
     * Les paramètres de la commande.
     */
    protected String[] parameters;

    /**
     * Constructeur de la classe CommandeDocument.
     * @param document Le document sur lequel la commande doit être exécutée.
     * @param parameters Les paramètres de la commande.
     */
    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    /**
     * Méthode pour exécuter la commande.
     * Par défaut, elle affiche le contenu du document.
     */
    @Override
    public void executer() {
        System.out.println(this.document);
    }
}

