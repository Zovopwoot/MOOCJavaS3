public class MatchTennis {
    String joueur1;
    String joueur2;
    boolean isMatchInProgress = true;
    boolean isP1playing = true;
    boolean isP2playing = true;
    int pointJ1 = 0;
    int pointJ2 = 0;
    int nbreJeuJ1 = 0;
    int nbreJeuJ2 = 0;
    boolean egalité = false;
    boolean avantageJ1 = false;
    boolean avantageJ2 = false;

    void gainPointJ1() {//gestion du score Joueur 1
        if (isP1playing && isP2playing) {
            if (pointJ1 == 0 || pointJ1 < 3) {// augmentation d'un point
                pointJ1++;
            } else if (pointJ1 >= 3 && pointJ2 >= 3 && pointJ1 == pointJ2) { //conditions d'Egalité
                egalité = true;
                avantageJ1 = false;
                avantageJ2 = false;
            } else if (egalité && pointJ1 == pointJ2 + 1) {//condition d'Avantage
                egalité = false;
                avantageJ1 = true;
                avantageJ2 = false;
            } else if (avantageJ1) { // gain de jeu
                nbreJeuJ1++;
                pointJ1 = 0;
                pointJ2 = 0;
                egalité = false;
                avantageJ1 = false;
                if (nbreJeuJ1 >= 6 && nbreJeuJ1 >= nbreJeuJ2 + 2) { //victoire J1
                    abandonJ2();
                    isMatchInProgress = false;
                }
            }
        }
    }

    void gainPointJ2() {

        if (isP1playing && isP2playing) {
            if (pointJ2 == 0 || pointJ2 < 3) {// augmentation d'un point
                pointJ2++;
            } else if (pointJ2 >= 3 && pointJ1 >= 3 && pointJ1 == pointJ2) { //conditions d'Egalité
                egalité = true;
                avantageJ1 = false;
                avantageJ2 = false;
            } else if (egalité && pointJ2 == pointJ1 + 1) {//condition d'Avantage
                egalité = false;
                avantageJ2 = true;
                avantageJ1 = false;
            } else if (avantageJ2) {// gain de jeu
                nbreJeuJ2++;
                pointJ1 = 0;
                pointJ2 = 0;
                egalité = false;
                avantageJ1 = false;
                avantageJ2 = false;
            }
            if (nbreJeuJ2 >= 6 && nbreJeuJ1 >= nbreJeuJ1 + 2) { //victoire J2
                abandonJ1();
                isMatchInProgress = false;
            }
        }
    }

    void abandonJ1() {
        isP1playing = false;
    }

    void abandonJ2() {
        isP2playing = false;
    }

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
        if (isMatchInProgress) {

            if (avantageJ1) {
                return nbreJeuJ1 + " : " + nbreJeuJ2 + " / " + scoreJeuJ1 + " : " + scoreJeuJ2 + " / Avantage : " + joueur1;
            } else if (avantageJ2) {
                return nbreJeuJ1 + " : " + nbreJeuJ2 + " / " + scoreJeuJ1 + " : " + scoreJeuJ2 + " / Avantage : " + joueur2;
            } else {
                return nbreJeuJ1 + " : " + nbreJeuJ2 + " / " + scoreJeuJ1 + " : " + scoreJeuJ2;
            }

        } else {

            if (!isP2playing) {
                return nbreJeuJ1 + " : " + nbreJeuJ2 + "Abandon J2 - Victoire J1";
            } else if (!isP1playing) {
                return nbreJeuJ1 + " : " + nbreJeuJ2 + "Abandon J1 - Victoire J2";
            } else {
                return nbreJeuJ1 + " : " + nbreJeuJ2;
            }
        }
    }

}




