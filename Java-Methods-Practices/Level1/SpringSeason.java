public class SpringSeason {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        boolean isSpring = isSpringSeason(month, day);

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20) {
            return true;
        } else if (month > 3 && month < 6) {
            return true;
        } else if (month == 6 && day <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
