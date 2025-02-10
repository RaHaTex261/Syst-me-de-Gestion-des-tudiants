package Main;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Chargement {
    public static void chargerEtudiants(GestionnaireEtudiants gestionnaire, String fichier) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] parts = ligne.split(",");
                int id = Integer.parseInt(parts[0]);
                String nom = parts[1];
                String prenom = parts[2];
                int age = Integer.parseInt(parts[3]);
                gestionnaire.ajouterEtudiant(new Etudiant(id, nom, prenom, age));
            }
        } catch (IOException e) {
            System.out.println("Aucune donnée trouvée ou erreur de lecture du fichier.");
        }
    }

}
