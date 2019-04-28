public class MatchTennis {
    private boolean isMatchInProgress = true;
    private boolean isP1playing = true;
    private boolean isP2playing = true;
    private int p1Score = 0;
    private int p2Score = 0;
    private int j1SetCounter = 0;
    private int j2SetCounter = 0;
    private boolean equality = false;
    private boolean p1Advantage = false;
    private boolean p2advantage = false;

    public void incrementScoreP1() {//gestion du score Joueur 1

        if (isMatchInProgress) {
            if (p1Score < 3) {// augmentation d'un point
                p1Score++;
            } else if (p2Score <= 2) { // gain de jeu
                j1SetCounter++;
                p1Score = 0;
                p2Score = 0;
            } else if (p1Advantage) { // gain de jeu
                j1SetCounter++;
                p1Score = 0;
                p2Score = 0;
                equality = false;
                p1Advantage = false;
            } else if (p2advantage) { //conditions d'Egalité
                equality = true;
                p2advantage = false;
            } else if (p1Score == 3 || equality) {//condition d'Avantage
                equality = false;
                p1Advantage = true;
            }
            if (j1SetCounter >= 6 && j1SetCounter >= j2SetCounter + 2) { //victoire J1
                p2GiveUp();
                isMatchInProgress = false; // match terminé
            }
        }
    }

    public void incrementScorep2() {

        if (isMatchInProgress) {
            if (p2Score < 3) {// augmentation d'un point
                p2Score++;
            } else if (p1Score <= 2) { // gain de jeu
                j2SetCounter++;
                p1Score = 0;
                p2Score = 0;
            } else if (p2advantage) {// gain de jeu
                j2SetCounter++;
                p1Score = 0;
                p2Score = 0;
                equality = false;
                p1Advantage = false;
                p2advantage = false;
            } else if (p1Advantage) { //conditions d'Egalité
                equality = true;
                p1Advantage = false;
            } else if (p2Score == 3 || equality) {//condition d'Avantage
                equality = false;
                p2advantage = true;
            }
            if (j2SetCounter >= 6 && j2SetCounter >= j1SetCounter + 2) { //victoire J2
                p1GiveUp();
                isMatchInProgress = false;
            }
        } else {
            System.out.println("Modification du score impossible");
        }
    }

    public void p1GiveUp() {
        isP1playing = false;
        isMatchInProgress = false;
    }

    public void p2GiveUp() {
        isP2playing = false;
        isMatchInProgress = false;
    }

    @Override
    public String toString() {
        String playerOne = "Joueur 1";
        String playerTwo = "Joueur 2";

        int scoreJeuJ1 = 0;
        switch (p1Score) {
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
        switch (p2Score) {
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
            if (p1Advantage) {
                return j1SetCounter + "-" + j2SetCounter + " Avantage : " + playerOne;
            } else if (p2advantage) {
                return j1SetCounter + "-" + j2SetCounter + " Avantage : " + playerTwo;
            } else {
                return j1SetCounter + "-" + j2SetCounter + " " + scoreJeuJ1 + "-" + scoreJeuJ2;
            }
        } else {
            if (isP2playing) {
                if (isP1playing) {
                    return j1SetCounter + "-" + j2SetCounter;
                } else {
                    return j1SetCounter + "-" + j2SetCounter + "Abandon" + playerOne + " - Victoire" + playerTwo;
                }
            } else {
                return j1SetCounter + "-" + j2SetCounter + "Abandon" + playerTwo + " - Victoire " + playerOne;
            }
        }
    }

}
