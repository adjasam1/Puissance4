public class Test {

  private static int[][] grille;

  public static void main (String[] args) {


    System.out.println(testChoix(1));
    System.out.println(testChoix(2));
    System.out.println(testChoix(3));




  }

  public static void init() {
    int largeur = 7; // largeur
    int hauteur = 6; // hauteur

    grille = new int[largeur][hauteur];

    grille[0][0]=1;
    grille[0][1]=1;
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
    grille[2][5]=3;

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

  public static int testChoix(int choix) {
    init();
    int i = 5;

    while (i>= 0) {
      if (grille[choix-1][i] == 0){
        //grille [choix-1][i] = 1;
        return i;
      }
      i--;
    }
    return 0;

  }
}
