package Main;

public abstract class Personne {//Ariele
    protected String nom;
    protected String prenom;
    protected int age;

    //Constructeur de la classe Personne.
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }


    public abstract String getRole();

    //Affiche les informations de base de la personnes sur l'interface
    public void afficherInformations() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age);
    }
}
