public class СaughtSpeeding { // https://codingbat.com/prob/p157733
    public static void main (String args[]) {
        caughtSpeeding (60, false);
    }
    static int caughtSpeeding (int speed, boolean isBirthday) {
        if (speed <= 60 || isBirthday==false)
            return 0;
        else if (speed >= 61 && (!(speed <= 80)) || isBirthday == false)
            return 1;
        else if (speed > 81 || isBirthday == false)
            return 2;
        else if (isBirthday == true)


    }
}
