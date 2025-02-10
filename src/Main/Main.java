package Main;

import java.util.Scanner;



public class Main {
    // Attributs statiques pour gérer l'état global de l'application
    private static GestionnaireEtudiants gestionnaire;
    private static Scanner scanner;

    
    public static void main(String[] args) { //Teddy
        // Initialisation des composants essentiels
        gestionnaire = new GestionnaireEtudiants();
        scanner = new Scanner(System.in);
        
        // Chargement des données existantes au démarrage
        Chargement.chargerEtudiants(gestionnaire, "etudiants.txt");

        // Boucle principale de l'interface
        while (true) {
            afficherMenu();
            int choix = scanner.nextInt();
            
            //Options du menu
            switch (choix) {
                case 1:// Ajout d'un nouvel étudiant
                    System.out.print("ID Étudiant : ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consommation de la nouvelle ligne
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Prénom : ");
                    String prenom = scanner.nextLine();
                    System.out.print("Âge : ");
                    int age = scanner.nextInt();
                    gestionnaire.ajouterEtudiant(new Etudiant(id, nom, prenom, age));
                    System.out.println("✓ Étudiant ajouté avec succès !");
                    break;

                case 2: // Suppression d'un étudiant existant
                   
                    System.out.print("ID Étudiant à supprimer : ");
                    int idSupprimer = scanner.nextInt();
                    gestionnaire.supprimerEtudiant(idSupprimer);
                    System.out.println("✓ Étudiant supprimé avec succès !");
                    break;

                case 3:// Ajout d'une note pour un étudiant
                    
                    System.out.print("ID Étudiant : ");
                    int idNote = scanner.nextInt();
                    System.out.print("Note à ajouter : ");
                    double note = scanner.nextDouble();
                    for (Etudiant etudiant : gestionnaire.getListeEtudiants()) {
                        if (etudiant.getIdEtudiant() == idNote) {
                            etudiant.ajouterNote(note);
                            break;
                        }
                    }
                    System.out.println("✓ Note Étudiant ajouté avec succès !");
                    break;

                case 4: // Affichage de la liste complète des étudiants et leurs notes
                   
                    gestionnaire.afficherEtudiants();
                    System.out.println("✓ Liste affichée avec succès!");
                    break;

                case 5:
                    // Option de sortie du programme
                    // Sauvegarde des données avant la fermeture
                    //Sauvegarde.sauvegarderEtudiants(gestionnaire, "etudiants.txt");
                    //System.out.println("Données sauvegardées. Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }
        }
    }

    //Affiche Interface sur le terminal //ariele
    private static void afficherMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Ajouter un étudiant");
        System.out.println("2. Supprimer un étudiant");
        System.out.println("3. Ajouter une note");
        System.out.println("4. Afficher la liste des étudiants et notes");
        System.out.println("5. Quitter");
        System.out.print("Faites votre choix en utilisant les chiffres mentionnés : ");
    }
}