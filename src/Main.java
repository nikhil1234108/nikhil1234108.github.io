public class Main {
    public static void main(String[] args) {
        int topscore = 20;
        int secondtopscore = 40;
        if (topscore > 15 || topscore == 20 && secondtopscore >= 30){
            System.out.println("good marks");
        }
        int ageofClient = 30;
        String agestring = ageofClient>=22?"over 22":"still minor";
        System.out.println("our client age is"+agestring);
    }
}