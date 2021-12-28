public class TeenNumberChecker {
    public static boolean hasTeen(int d1, int d2, int d3) {
        if((d1 >= 13 &&  d1 <= 19) ||(d2 >= 13 &&  d2 <= 19) || (d3 >= 13 &&  d3 <= 19) ) {
            System.out.println("Passed");
            return true;
        } else {
            System.out.println("Failed");
            return false;
        }
    }
}
