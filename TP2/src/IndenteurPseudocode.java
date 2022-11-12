import java.util.Scanner;
public class IndenteurPseudocode {
    public static void main(String[] args) {
        System.out.println("Ce programme sert à corriger l'indentation de n'importe quel algorithme écrit en pseudocode.\n");
        Scanner keyboard = new Scanner(System.in);
        //Options 1 et 2 du menu\\
        boolean recommencermenu;
        do {
            recommencermenu = false;
            System.out.println("----\nMENU\n----\n1. Indenter pseudocode\n2. Quitter\n\nEntrer votre choix:");
            //DEROULEMENT DE L'OPTION 1\\
            String menu = keyboard.nextLine();
            if (menu.equals("1")) {
                boolean recommencerun;
                do {
                    recommencerun=true;
                    System.out.println("Entrer le chemin du texte a indenter: ");
                    String cheminFic = keyboard.nextLine();
                    TP2Utils.lireFichierTexte(cheminFic);
                } while(recommencerun);




            //DEROULEMENT DE L'OPTION 2\\
            } else if (menu.equals("2")) {
                System.out.println("F I N  N O R M A L E  D U  P R O G R A M M E");
            } else {
                System.out.println("Erreur! Choix non permis. Veuillez recommencez!");
                recommencermenu = true;
            }
        } while(recommencermenu);
    }
    public static void recommence() {
        System.out.println("Erreur, veuillez recommencer!");
    }
}
