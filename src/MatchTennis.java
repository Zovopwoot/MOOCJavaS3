public class MatchTennis {
    String joueur1;
    String joueur2;
    int scorePointJ1;
    int scorePointJ2;
    int scoreMancheJ1;
    int scoreMancheJ2;
    boolean egalité = false;
    boolean avantageJ1 = false;
    boolean avantageJ2 = false;
    int Manches = 1;

    public class gainPointJ1(){//gestion du score Joueur 1
        if (scorePointJ1 == 0 || scorePointJ1 < 3) {// augmentation d'un point
            scorePointJ1++;
        } else if (scorePointJ1 >= 3 && scorePointJ2 >= 3 && scorePointJ1 == scorePointJ2) { //conditions d'Egalité
            egalité = true;
            avantageJ1 = false;
            avantageJ2 = false;
        } else if (egalité && scorePointJ1 == scorePointJ2 + 1) {//condition d'Avantage
            egalité = false;
            avantageJ1 = true;
            avantageJ2 =false;
        } else if (avantageJ1) {
            scoreMancheJ1++;
            scorePointJ1 = 0;
            scorePointJ2 = 0;
            egalité = false;
            avantageJ1 = false;
        }
    }

    public class gainPointJ2(){
        if (scorePointJ2 == 0 || scorePointJ2 < 3) {// augmentation d'un point
            scorePointJ2++;
        } else if (scorePointJ2 >= 3 && scorePointJ1 >= 3 && scorePointJ1 == scorePointJ2) { //conditions d'Egalité
            egalité = true;
            avantageJ1 = false;
            avantageJ2 =false;
        } else if (egalité && scorePointJ2 == scorePointJ1 + 1) {//condition d'Avantage
            egalité = false;
            avantageJ1 = true;
            avantageJ2 = false;
        } else if (avantageJ2) {
            scoreMancheJ2++;
            scorePointJ1 = 0;
            scorePointJ2 = 0;
            egalité = false;
            avantageJ1 = false;
            avantageJ2 =false;
        }
    }

    public class abandonJ1()

    {
    }

    public class abandonJ2()

    {
    }

    public class toString()

    {
    }


}
