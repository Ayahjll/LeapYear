public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Its a leapYear!");
            return true;
        }
        else {
            System.out.println("Its not a leapYear!");
            return false;
        }
    }
}

