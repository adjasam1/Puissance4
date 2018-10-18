import java.util.Scanner;

public class Puissance4 {
  static Scanner saisie;


  public static void main(String[] args) {
    Scanner saisie = new Scanner(System.in);

    init();


    // int largeur = 7; // largeur
    //int hauteur = 6; // hauteur

    //int[][] grille = new int[largeur][hauteur];
    //
    // System.out.print("Colonne n°2 : ");
    // for (int j = 0; j < hauteur; j++) {
    //   System.out.println(grille[1][j]);
    // }
    //
    // System.out.print("Ligne n°3 : ");
    // for (int i = 0; i < largeur; i++) {
    //   System.out.println(grille[i][2]);
    // }
    // System.out.println();

    System.out.println("Grille du puissance 4 : ");
    for (int j = 0; j < hauteur; j++) {
      for (int i = 0; i < largeur; i++) {
        System.out.print(" | " + grille[i][j] + " | ");
      }
      System.out.println();
    }


    // tour de jeu
    int tour = 0;
    int choix = 0;
    int jeton = 0;

    do {
      // Joueur 1
      //    choixColonne();
      do {
        jeton = 1;
        System.out.print("Faites votre choix de colonne : ");
        choix = saisie.nextInt();
        if(choix > 7 || choix < 1){
          System.out.println("Vous avez louper la grille, recommencez.");
        }
        //verifie si la colonne n'est pas pleine

        else if(grille[choix-1][0]==0){
          selectionHauteur(choix, jeton);
        }
        else {
          System.out.println("La colonne choisi est pleine, recommencez.");
        }
      } while (choix>7 || choix<1 || grille[choix-1][0]!=0);

      System.out.println("Grille du puissance 4 : ");
      for (int j = 0; j < hauteur; j++) {
        for (int i = 0; i < largeur; i++) {
          System.out.print(" | " + grille[i][j] + " | ");
        }
        System.out.println();
      }
      // methode validation partie gagné par J1 arret jeu

      // Joueur 2
      // choixColonne();
      do {
        jeton = 2;
        System.out.print("Faites votre choix de colonne : ");
        choix = saisie.nextInt();
        if(choix > 7 || choix < 1){
          System.out.println("Vous avez louper la grille, recommencez.");
        }
        //verifie si la colonne n'est pas pleine

        else if(grille[choix-1][0]==0){
          selectionHauteur(choix, jeton);
        }
        else {
          System.out.println("La colonne choisi est pleine, recommencez.");
        }
      } while (choix>7 || choix<1 || grille[choix-1][0]!=0);

      System.out.println("Grille du puissance 4 : ");
      for (int j = 0; j < hauteur; j++) {
        for (int i = 0; i < largeur; i++) {
          System.out.print(" | " + grille[i][j] + " | ");
        }
        System.out.println();
      }
      //  methode validation partie gagné par J2 arret joueur
      tour++;
    } while (tour <= 21);
  }



  public static int selectionHauteur(int choix, int jeton) {
    init();
    int i = 5;

    while (i>= 0) {
      if (grille[choix-1][i] == 0){
        grille [choix-1][i] = jeton;
        return i;
      }
      i--;
    }
    return 0;

  }

  public static void init() {
    int largeur = 7; // largeur
    int hauteur = 6; // hauteur

    grille = new int[largeur][hauteur];

    grille[0][0]=0;
    grille[0][1]=0;
    grille[0][2]=1;
    grille[0][3]=2;
    grille[0][4]=2;
    grille[0][5]=1;

    grille[1][0]=0;
    grille[1][1]=2;
    grille[1][2]=2;
    grille[1][3]=2;
    grille[1][4]=1;
    grille[1][5]=2;

    grille[2][0]=0;
    grille[2][1]=0;
    grille[2][2]=0;
    grille[2][3]=0;
    grille[2][4]=0;
    grille[2][5]=0;

    grille[3][0]=0;
    grille[3][1]=0;
    grille[3][2]=0;
    grille[3][3]=0;
    grille[3][4]=0;
    grille[3][5]=0;

    grille[4][0]=0;
    grille[4][1]=0;
    grille[4][2]=0;
    grille[4][3]=0;
    grille[4][4]=0;
    grille[4][5]=0;

    grille[5][0]=0;
    grille[5][1]=0;
    grille[5][2]=0;
    grille[5][3]=0;
    grille[5][4]=0;
    grille[5][5]=0;

    grille[6][0]=0;
    grille[6][1]=0;
    grille[6][2]=0;
    grille[6][3]=0;
    grille[6][4]=0;
    grille[6][5]=0;


  }

}




// méthode choix Colonne
//  public boolean choixColonne () {





// //Choix joueur 1
// int J1 =0;
// do {
//   System.out.println("Joueur 1, faites votre choix de colonne : ");
//   J1 = saisie.nextInt();
//   //largeur=J1-1;
//   //colonne inexistante
//
//
// //vérification si le joueur gagne
//     //vérification pour ligne


    //vérification si le joueur gagne
        //vérification pour ligne

    // int compteurA =0;
    // int compteurB =0;
    //
    // for (int i = J1; i<J1+3 ; i++){
    //   if (grille[i][hauteur]==grille[J1-1][hauteur]){
    //     compteurA ++;
    //   }
    // }
    // for (int i = J1; i>J1-3; i--){
    //   if (grille[i][hauteur]==grille[J1-1][hauteur]){
    //     compteurB ++;
    //   }
    // }
    // if(compteurA+compteurB>=4){
    //   System.out.println("Joueur1 a gagné");
    // }
  //  System.out.println("compteurA: "+compteurA + " compteurB "+compteurB);
//     System.out.println("Grille du puissance 4 : ");
//     for (int j = 0; j < hauteur; j++) {
//       for (int i = 0; i < largeur; i++) {
//         System.out.print(" | " + grille[i][j] + " | ");
//       }
//     System.out.println();
//     }
//
//   }
// }
