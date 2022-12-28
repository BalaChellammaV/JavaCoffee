public class About_Static {

    int number = 10;
    static int num2 = 20;
    static int num3;
    static {
        num3 = 30; // static datafield can be defined in a separate block
    }

    static int ip() {
        System.out.println("ip->num3 : " + num3);
        // inside static method , only static datafields are used
        return num3;
    }

    public static void main(String[] args) {
        About_Static obj = new About_Static();

        // num++ cause error becoz non static datafield can't do any function in static
        // method ;

        System.out.println("++num2 : " + (++num2));// static data field was incrementing here (pre-increment)

        System.out.println("num3 : " + num3);// static datafield was printed
        // System.out.println("number : " + number);->it can cause error becoz
        // without using object non-static datafield can't be print in the static main
        // method

        System.out.println("number : " + obj.number);// using object print non-static datafield
        System.out.println(" Call Static int ip() using classname -> " + About_Static.ip());// call static method using
                                                                                            // // class name and dot
                                                                                            // operator
        System.out.println("Call Static int ip() without using classname -> " + ip());
        // without using classname static
        // method called

        /*
         * with or without use of classname, we can call static method. There is no
         * difference with them.They both does samething
         */

        /*
         * one special thing about Static method ->there is no compultion using
         * classname only we have to call the static method . Becoz when the class was
         * loaded , static method was called automatically...
         */

    }
}
