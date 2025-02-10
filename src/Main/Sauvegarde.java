package Main;

import java.io.FileWriter;
import java.io.IOException;

public class Sauvegarde {
    /*public static void sauvegarderEtudiants(GestionnaireEtudiants gestionnaire, String fichier) {
        try (FileWriter writer = new FileWriter(fichier)) {
            for (Etudiant etudiant : gestionnaire.getListeEtudiants()) {
                writer.write(etudiant.getIdEtudiant() + "," + etudiant.getNom() + "," +
                        etudiant.getPrenom() + "," + etudiant.getAge() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
	// permer le sauvegarde des données 
    public static void sauvegarderEtudiants(GestionnaireEtudiants gestionnaire, String fichier) {
        try (FileWriter writer = new FileWriter(fichier)) {
            for (Etudiant etudiant : gestionnaire.getListeEtudiants()) {
                writer.write(etudiant.getIdEtudiant() + "," + etudiant.getNom() + "," +
                        etudiant.getPrenom() + "," + etudiant.getAge() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde des données.");
        }
    }
}
