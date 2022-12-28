public class About_Static2 {

    static double number;
    static {
        number = 2.345;
    }

    static double printnumber() {
        System.out.println("static double number : " + number);// inside static method , only static datafields are used
        return number;
    }

    public static void main(String[] args) {

        System.out.println(" Call static method  without use of classname " + printnumber());
        /*
         * one special thing about Static method ->there is no compultion using
         * classname only we have to call the static method . Becoz when the class was
         * loaded , static method was called automatically...
         */

        /*
         * with or without use of classname, we can call static method. There is no
         * difference with them.Both of them does samething
         */
    }
}
