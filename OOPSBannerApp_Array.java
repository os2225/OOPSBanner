
public class OOPSBannerApp_Array {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Define and initialize String Array variable inline
        // Each line represents a row in the banner for the letters O, O, P, S
        String[] lines = {

            // Row 1
            String.join("   ",
                " ***** ",
                " ***** ",
                " ******",
                " ***** "
            ),

            // Row 2
            String.join("   ",
                "*     *",
                "*     *",
                "*     *",
                "*     *"
            ),

            // Row 3
            String.join("   ",
                "*     *",
                "*     *",
                "****** ",
                "*      "
            ),

            // Row 4
            String.join("   ",
                "*     *",
                "*     *",
                "*      ",
                " ***** "
            ),

            // Row 5
            String.join("   ",
                "*     *",
                "*     *",
                "*      ",
                "      *"
            ),

            // Row 6
            String.join("   ",
                "*     *",
                "*     *",
                "*      ",
                "*     *"
            ),

            // Row 7
            String.join("   ",
                " ***** ",
                " ***** ",
                "*      ",
                " ***** "
            )
        };


        // Use enhanced for-loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}