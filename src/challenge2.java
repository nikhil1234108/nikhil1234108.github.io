public class challenge2 {
    public static void main(String[] args){
        boolean gameover = true;
        int score =10000;
        int bonus =200;
        int levelcompleted=8;
        int finalscore = score;
        if (gameover==true){
            finalscore = finalscore+(bonus*levelcompleted);
            System.out.println("finalscore is"+finalscore);
        }
    }
}
