public class MinutesToYearsDaysCalculator {
    public static void main(String[]args){
    printYearsAndDays(525600);
    printYearsAndDays(1025600);


    }
    public static void printYearsAndDays(long minutes){
        double minutesinyears = 60*24*365;
        long years = (long)(minutes/minutesinyears);
        int days = (int) (minutes/60/24)%365;
        System.out.println(minutes+"minutes"+years+"years"+days+"days");
    }
    // write code here
}