public class codinngex2 {
    public static void convert(System[] args){
        printMegaBytes(2500);
        printMegaBytes(-1024);
        printMegaBytes(5000);

    }
    public static void printMegaBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("ivalid");
        }
        else {
            int megabytes = kiloBytes/1000;
            int remainingkiloBytes = kiloBytes%1000;
            System.out.println(kiloBytes + "in mb and rkb" + megabytes + "and" + remainingkiloBytes);

        }
    }
    // write code here
}