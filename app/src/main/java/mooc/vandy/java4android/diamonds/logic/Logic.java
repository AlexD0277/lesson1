package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {
        boolean odd;
        int numOfChars = 0;
        int numOfSpaces = 0;
        char sign;
        horizonLine(size);
        for (int i = 1; i <= size * 2 - 1; i++) {
            numOfSpaces = Math.max(size - i, -size + i);
            mOut.print("|");
            odd = i % 2 == 0;
            if (odd) sign = '-';
            else sign = '=';
            if (i == size) {   // center
                printLine(numOfSpaces, numOfChars, sign, '<', '>');
                numOfChars -= 2;
            } else if (i < size)   // top
            {
                printLine(numOfSpaces, numOfChars, sign, '/', '\\');
                numOfChars += 2;
            } else   // bottom
            {
                printLine(numOfSpaces, numOfChars, sign, '\\', '/');
                numOfChars -= 2;
            }
            mOut.println("|");
        }
        horizonLine(size);
    }

   public void horizonLine(int size){
       mOut.print("+");
       for (int i = 1; i <= size * 2; i++) {
           mOut.print("-");
       }
       mOut.println("+");
   }

    public void printSymbol(int size, char s){
        for (int i = 1; i <= size; i++) {
            mOut.print(s);
        }
    }

    public void printLine(int numOfSpaces, int numOfChars, char sign, char sign1, char sign2){
        printSymbol(numOfSpaces, ' ');
        mOut.print(sign1);
        printSymbol(numOfChars, sign);
        mOut.print(sign2);
        printSymbol(numOfSpaces, ' ');
    }

}
