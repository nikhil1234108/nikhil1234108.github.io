public class class2 {
    public static void main(String[] args){
        System.out.println("5ft,8in="+convertToCentimeters(5,8)+"cm");
        System.out.println("12in="+convertToCentimeters(12)+"cm");

    }
    public static double convertToCentimeters(int inch){
        return inch*2.54;
    }
    public static double convertToCentimeters(double feet, int inch){
        return ((feet*12)+inch)*2.54;
    }
}
