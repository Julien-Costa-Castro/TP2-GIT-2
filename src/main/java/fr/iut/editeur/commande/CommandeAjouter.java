package fr.iut.editeur.commande;

import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.document.Document;

/**
 * Cette classe représente une commande pour ajouter du texte à un document.
 * Elle hérite de la classe abstraite CommandeDocument.
 */
public class CommandeAjouter extends CommandeDocument {

    /**
     * Constructeur de la classe CommandeAjouter.
     * @param document Le document sur lequel la commande doit être exécutée.
     * @param parameters Les paramètres de la commande.
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Méthode pour exécuter la commande d'ajout de texte.
     * Si le format des paramètres n'est pas respecté, un message d'erreur est affiché.
     */
    @Override
    public void executer() {
        if (parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

}
