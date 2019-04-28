public class MatchTennis {
    String joueur1 = "Joueur 1";
    String joueur2 = "Joueur 2";
    private boolean isMatchInProgress = true;
    private boolean isP1playing = true;
    private boolean isP2playing = true;
    private int pointJ1 = 0;
    private int pointJ2 = 0;
    private int nbreJeuJ1 = 0;
    private int nbreJeuJ2 = 0;
    private boolean egalité = false;
    private boolean avantageJ1 = false;
    private boolean avantageJ2 = false;

    public void gainPointJ1() {//gestion du score Joueur 1

        if (isMatchInProgress) {
            if (pointJ1 <3) {// augmentation d'un point
                pointJ1++;
            } else if (pointJ2 <= 2) { // gain de jeu
                nbreJeuJ1++;
                pointJ1 = 0;
                pointJ2 = 0;
            } else if (avantageJ1) { // gain de jeu
                nbreJeuJ1++;
                pointJ1 = 0;
                pointJ2 = 0;
                egalité = false;
                avantageJ1 = false;
            } else if (avantageJ2) { //conditions d'Egalité
                egalité = true;
                avantageJ1 = false;
                avantageJ2 = false;
            } else if (pointJ1 == 3 || egalité) {//condition d'Avantage
                egalité = false;
                avantageJ1 = true;
                avantageJ2 = false;
            }
            if (nbreJeuJ1 >= 6 && nbreJeuJ1 >= nbreJeuJ2 + 2) { //victoire J1
                abandonJ2();
                isMatchInProgress = false; // match terminé
            }
        }
    }

    public void gainPointJ2() {

        if (isMatchInProgress) {
            if (pointJ2 < 3) {// augmentation d'un point
                pointJ2++;
            } else if (pointJ1 <= 2) { // gain de jeu
                nbreJeuJ2++;
                pointJ1 = 0;
                pointJ2 = 0;
            } else if (avantageJ2) {// gain de jeu
                nbreJeuJ2++;
                pointJ1 = 0;
                pointJ2 = 0;
                egalité = false;
                avantageJ1 = false;
                avantageJ2 = false;
            } else if (avantageJ1) { //conditions d'Egalité
                egalité = true;
                avantageJ1 = false;
                avantageJ2 = false;
            } else if (pointJ2 == 3 || egalité) {//condition d'Avantage
                egalité = false;
                avantageJ2 = true;
                avantageJ1 = false;
            }
            if (nbreJeuJ2 >= 6 && nbreJeuJ2 >= nbreJeuJ1 + 2) { //victoire J2
                abandonJ1();
                isMatchInProgress = false;
            }
        }else{
            System.out.println("Modification du score impossible");
        }
    }

    public void abandonJ1() {
        isP1playing = false;
        isMatchInProgress = false;
    }

    public void abandonJ2() {
        isP2playing = false;
        isMatchInProgress = false;
    }

    @Override
    public String toString() {

        int scoreJeuJ1 = 0;
        switch (pointJ1) {
            case 0:
                scoreJeuJ1 = 0;
                break;
            case 1:
                scoreJeuJ1 = 15;
                break;
            case 2:
                scoreJeuJ1 = 30;
                break;
            case 3:
                scoreJeuJ1 = 40;
                break;
        }
        int scoreJeuJ2 = 0;
        switch (pointJ2) {
            case 0:
                scoreJeuJ2 = 0;
                break;
            case 1:
                scoreJeuJ2 = 15;
                break;
            case 2:
                scoreJeuJ2 = 30;
                break;
            case 3:
                scoreJeuJ2 = 40;
                break;
        }
        if (isMatchInProgress) {
            if (avantageJ1) {
                return nbreJeuJ1 + "-" + nbreJeuJ2 +" Avantage : " + joueur1;
            } else if (avantageJ2) {
                return nbreJeuJ1 + "-" + nbreJeuJ2 +" Avantage : " + joueur2;
            } else {
                return nbreJeuJ1 + "-" + nbreJeuJ2 + " " + scoreJeuJ1 + "-" + scoreJeuJ2;
            }

        } else {

            if (!isP2playing) {
                return nbreJeuJ1 + "-" + nbreJeuJ2 + "Abandon J2 - Victoire J1";
            } else if (!isP1playing) {
                return nbreJeuJ1 + "-" + nbreJeuJ2 + "Abandon J1 - Victoire J2";
            } else {
                return nbreJeuJ1 + "-" + nbreJeuJ2;
            }
        }
    }

}




