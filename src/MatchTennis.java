public class MatchTennis {
    String joueur1;
    String joueur2;
    boolean isMatchInProgress =true;
    boolean isP1playing = true;
    boolean isP2playing = true;
    int scorePointJ1;
    int scorePointJ2;
    int scoreMancheJ1;
    int scoreMancheJ2;
    boolean egalité = false;
    boolean avantageJ1 = false;
    boolean avantageJ2 = false;


    void gainPointJ1() {//gestion du score Joueur 1
        if (isP1playing && isP2playing) {
            if (scorePointJ1 == 0 || scorePointJ1 < 3) {// augmentation d'un point
                scorePointJ1++;
            } else if (scorePointJ1 >= 3 && scorePointJ2 >= 3 && scorePointJ1 == scorePointJ2) { //conditions d'Egalité
                egalité = true;
                avantageJ1 = false;
                avantageJ2 = false;
            } else if (egalité && scorePointJ1 == scorePointJ2 + 1) {//condition d'Avantage
                egalité = false;
                avantageJ1 = true;
                avantageJ2 = false;
            } else if (avantageJ1) { // gain de jeu
                scoreMancheJ1++;
                scorePointJ1 = 0;
                scorePointJ2 = 0;
                egalité = false;
                avantageJ1 = false;
                if (scoreMancheJ1 >= 6 && scoreMancheJ1 >= scoreMancheJ2 + 2) { //victoire J1
                    abandonJ2();
                    isMatchInProgress =false ;
                }
            }
        }
    }


    void gainPointJ2(){

        if (isP1playing && isP2playing) {
            if (scorePointJ2 == 0 || scorePointJ2 < 3) {// augmentation d'un point
                scorePointJ2++;
            } else if (scorePointJ2 >= 3 && scorePointJ1 >= 3 && scorePointJ1 == scorePointJ2) { //conditions d'Egalité
                egalité = true;
                avantageJ1 = false;
                avantageJ2 = false;
            } else if (egalité && scorePointJ2 == scorePointJ1 + 1) {//condition d'Avantage
                egalité = false;
                avantageJ1 = true;
                avantageJ2 = false;
            } else if (avantageJ2) {// gain de jeu
                scoreMancheJ2++;
                scorePointJ1 = 0;
                scorePointJ2 = 0;
                egalité = false;
                avantageJ1 = false;
                avantageJ2 = false;
            }
            if (scoreMancheJ2 >= 6 && scoreMancheJ1 >= scoreMancheJ1 + 2) { //victoire J2
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

    String toString() {
        String score
    }


}


