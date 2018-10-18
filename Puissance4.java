import java.util.Scanner;

public class Puissance4 {
  static Scanner saisie;


  public static void main(String[] args) {
    Scanner saisie = new Scanner(System.in);

    int largeur = 7; // largeur
    int hauteur = 6; // hauteur

    int[][] grille = new int[largeur][hauteur];

    grille[0][0]=0;
    grille[0][1]=0;
    grille[0][2]=0;
    grille[0][3]=0;
    grille[0][4]=0;
    grille[0][5]=0;

    grille[1][0]=0;
    grille[1][1]=0;
    grille[1][2]=0;
    grille[1][3]=0;
    grille[1][4]=0;
    grille[1][5]=0;

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

    // int[][] = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
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


    //Choix joueur 1
    int J1 =0;
    do {
      System.out.println("Joueur 1, faites votre choix de colonne : ");
      J1 = saisie.nextInt();
      //largeur=J1-1;
      //colonne inexistante
      if(J1 > 7 || J1 < 1){
        System.out.println("Vous avez louper la grille, recommencez.");
      }
      //verifie si la colonne n'est pas pleine

      else if(grille[J1-1][0]==0){
        for(int j = hauteur-1; j >= 0; j--){
          if (grille[J1-1][j] == 0){
            grille [J1-1][j] = 1;
            System.out.println("Tous les elements du tableau : ");
          }
          break;
        }
      }
      else {
        System.out.println("La colonne choisi est pleine, recommencez.");
      }
    } while (J1>7 || J1<1 || grille[J1-1][0]!=0);


    //vérification si le joueur gagne
        //vérification pour ligne


    System.out.println("Grille du puissance 4 : ");
    for (int j = 0; j < hauteur; j++) {
      for (int i = 0; i < largeur; i++) {
        System.out.print(" | " + grille[i][j] + " | ");
      }
    System.out.println();
    }
  }
}
