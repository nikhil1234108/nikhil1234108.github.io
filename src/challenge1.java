public class challenge1 {
    public static void main(String[] args){
        double num1 =20.00;
        double num2 = 80.00;
        double num3 = (num1 +num2)*100;
        System.out.println("sum of two numbers multiply with 100"+num3);
        double reminderoperator = num3%40;
        boolean booleanvariable = (reminderoperator == 0)?true:false;
        System.out.println("the operator is "+booleanvariable);
        if(!booleanvariable){
            System.out.println("got some reminder");
        }



    }
}
