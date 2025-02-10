package Main;

import java.util.ArrayList;



//Interface définissant les méthodes pour la gestion des étudiants.(Teddy)


public class GestionnaireEtudiants implements GestionEtudiant {
    private ArrayList<Etudiant> listeEtudiants;
    // 
    public GestionnaireEtudiants() {
        this.listeEtudiants = new ArrayList<>();
    }
    //methode ajout des etudiants
    @Override
    public void ajouterEtudiant(Etudiant e) {
        listeEtudiants.add(e);
    }
    //methode Supprimer etudiant
    @Override
    public void supprimerEtudiant(int id) {
    	 listeEtudiants.removeIf(etudiant -> Integer.compare(etudiant.getIdEtudiant(), id) == 0);
    	
    }
    //permet afficher les etudiants
    @Override
    public void afficherEtudiants() {
        for (Etudiant etudiant : listeEtudiants) {
            etudiant.afficherInformations();
        }
    }
 // méthode pour accéder à la liste des étudiants
    public ArrayList<Etudiant> getListeEtudiants() {
        return listeEtudiants;
    }
}