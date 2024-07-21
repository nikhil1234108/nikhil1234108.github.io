public class challenge3 {
    public static void main(String[] args) {
        int position = calculateHigherScorePosition(1000);
        HigherScorePosition("nikhil",position);
    }

    public static void HigherScorePosition(String name, int position){
        System.out.println(name + "tim managed to get position "+ position +"on the list");
    }
    public static int calculateHigherScorePosition(int playersscore){
        if(playersscore>=1000){
            return 1;
        }
        else if (playersscore>=500 && playersscore<=1000){
            return 2;
        }
        else if (playersscore>=100 && playersscore<500){
            return 3;
        }
        else{
            return 4;
        }

    }
}
