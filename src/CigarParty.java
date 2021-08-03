public class CigarParty {  // https://codingbat.com/prob/p159531
    public static void main (String args[]){
        cigarParty(35,false);

    }
    static boolean cigarParty (int cigars, boolean isWeekend) {
        if ((cigars > 40 || cigars <= 60) && (isWeekend == true))
            return true;
        else if (cigars > 40 && isWeekend == false)
            return true;
        else
            return false;
    }
}
