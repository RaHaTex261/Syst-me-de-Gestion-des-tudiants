package Main;
import java.util.ArrayList;


public class Etudiant extends Personne {//FIandry
    private int idEtudiant;
    private ArrayList<Double> listeNotes;

   //Constructeur du nouvelle étudiant
    public Etudiant(int idEtudiant, String nom, String prenom, int age) {//Teddy
        super(nom, prenom, age);
        this.idEtudiant = idEtudiant;
        this.listeNotes = new ArrayList<>();
    }

    //Ajout une note à la liste des notes de l'étudiant.
    public void ajouterNote(double note) {//FIandry
        listeNotes.add(note);
    }

    //Calcule la moyenne des notes de l'étudiant et aussi La moyenne des notes (0.0 si aucune note)
    public double calculerMoyenne() {//Ariele
        if (listeNotes.isEmpty()) {
            return 0.0;
        }
        double somme = 0;
        for (double note : listeNotes) {
            somme += note;
        }
        return somme / listeNotes.size();
    }

    @Override
    public String getRole() {//Ariele
        return "Étudiant";
    }

    //Retourne l'identifiant unique de l'étudiant.et aussi L'identifiant de l'étudiant
    public int getIdEtudiant() {//Ariele
        return idEtudiant;
    }

    @Override
    public void afficherInformations() {//FIandry
        super.afficherInformations();
        System.out.println("ID Étudiant: " + idEtudiant + ", Moyenne: " + calculerMoyenne());
    }

    //Retourne le nom de l'étudiant hérité de la classe Personne et aussi Le nom de l'étudiant
    public String getNom() {
        return nom;
    }

    //Retourne le prénom de l'étudiant hérité de la classe Personne et aussi Le prénom de l'étudiant
    public String getPrenom() {
        return prenom;
    }

    //Retourne l'âge de l'étudiant hérité de la classe Personne et aussi L'âge de l'étudiant
    public int getAge() {
        return age;
    }
}