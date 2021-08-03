public class DateFashion { // https://codingbat.com/prob/p103360
    public static void main (String args[]) {
        dateFashion(5,10);
    }
    static  int dateFashion (int you, int date) {
        if ((you >= 8) && (!(you<=10)) || (date >=8) && (!(date<=10)))
        return 2;
        else if ((you<=2) && (!(you>=0)) || (date<=2) && (!(you>=0)))
            return 0;
        else return 1;
    }
}
