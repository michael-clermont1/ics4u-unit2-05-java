/**
 * This is the standard Main() class starting point.
 *
 * @author  Michael Clermont
 * @version 1.0
 * @since   2020-10-04
 */

final class Main {
    /**
     * Constant Variable Status.
     *
     */
    private static final String STATUS = "Status:";

    /**
     * Constant Variable MagicNumber10.
     *
     */
    private static final int MAGIC10 = 10;

    /**
     * Constant Variable MagicNumber5.
     *
     */
    private static final int MAGIC5 = 5;

    /**
     * Constant Variable MagicNumber4.
     *
     */
    private static final int MAGIC4 = 4;

    /**
     * Constant Variable MagicNumber100.
     *
     */
    private static final int MAGIC100 = 100;

    /**
     * Constant Variable MagicNumber2.
     *
     */
    private static final int MAGIC2 = 2;

    /**
     * Constant Variable NewColor.
     *
     */
    private static final String NEWCOLOR = "New Color: ";

    /**
     * Constant Variable ChangingColor.
     *
     */
    private static final String CHANGINGCOLOR = "Changing Color:";

    /**
     * Constant Variable Speed.
     *
     */
    private static final String NEWSPEED = "New Speed: ";

    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // use Stack class
        System.out.println("Created Ford focus");
        final Vehicle fordFocus = new Vehicle("white", "B40-C4RR0", 4, 284);
        System.out.println(STATUS);
        fordFocus.status();

        System.out.println("Accelerating, 10 of power for 10 sec.");
        fordFocus.accelerate(MAGIC10, MAGIC10);
        System.out.println(NEWSPEED + fordFocus.getSpeed());

        System.out.println("Changing colour to black:");
        fordFocus.setColor("black");
        System.out.println(NEWCOLOR + fordFocus.getColor());

        System.out.println("");

        // new Ferrari
        System.out.println("Created a Ferrari");
        final Vehicle ferrari = new Vehicle("red", "VHD-35HU", 2, 320);

        System.out.println(STATUS);
        ferrari.status();

        System.out.println("Accelerating, 100 of power for 4 sec.");
        ferrari.accelerate(MAGIC100, MAGIC4);
        System.out.println(NEWSPEED + ferrari.getSpeed());

        System.out.println("Breaking, 10 of power for 10 sec.");
        ferrari.breakF(MAGIC10, MAGIC10);
        System.out.println(NEWSPEED + ferrari.getSpeed());

        System.out.println(CHANGINGCOLOR);
        System.out.println(NEWCOLOR + ferrari.getColor());

        System.out.println("");

        // new Citroen Ami
        System.out.println("Created a Citroen Ami");
        final Vehicle citroenAmi = new Vehicle("blue", "FS-695-DQ", 2, 45);

        System.out.println(STATUS);
        citroenAmi.status();

        System.out.println("Accelerating, 5 of power for 10 sec.");
        citroenAmi.accelerate(MAGIC5, MAGIC10);
        System.out.println(NEWSPEED + citroenAmi.getSpeed());

        System.out.println("Breaking, 2 of power for 10 sec.");
        citroenAmi.breakF(MAGIC2, MAGIC10);
        System.out.println(NEWSPEED + citroenAmi.getSpeed());

        System.out.println(CHANGINGCOLOR);
        citroenAmi.setColor("purple");
        System.out.println(NEWCOLOR + citroenAmi.getColor());

        System.out.println("\nDone.");
    }
}

