public class OOPSBannerApp1 {

    public static void main(String[] args) {

        String[] banner = {

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

        for (String line : banner) {
            System.out.println(line);
        }
    }
}