public class BarkingDog {
    public static void main(String[] args){
        System.out.println(shouldWakeup(true,1));
        shouldWakeup(false,2);
        shouldWakeup(true,8);
        shouldWakeup(true,-1);

    }
    public static boolean shouldWakeup(boolean BarkingDog, int hourOfday){
        for(hourOfday=0;hourOfday<=23;hourOfday++){
            if(BarkingDog==true && hourOfday<8 || hourOfday>22){
                return true;
            }
            else {
                return false;

            }

        }
        if (hourOfday <0 || hourOfday>23){
            return false;
        }
        return false;

    }
    // write code here
}