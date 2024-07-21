public class areaconv {
    public static void main(String[] args){
        System.out.println(area(5)); // Circle area
        System.out.println(area(-1)); // Invalid radius
        System.out.println(area(5, 4)); // Rectangle area
    }

    public static double area(double radius){
        if (radius < 0){
            return -1;
        } else {
            return 3.14 * (radius*radius);
        }
    }

    public static double area(int x, int y){
        if (x <= 0 || y <= 0){
            return -1;
        } else {
            return x * y;
        }
    }
}
