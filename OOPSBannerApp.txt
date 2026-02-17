/**
 * OOPSBannerApp - Use Case 3
 * Prints the OOPS banner using String.join()
 * to improve memory efficiency and readability.
 *
 * @author Pradhanya
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String line1 = String.join("   ",
                " OOO ",
                " OOO ",
                "PPPP ",
                "SSSS "
        );

        String line2 = String.join("   ",
                "O   O",
                "O   O",
                "P   P",
                "S    "
        );

        String line3 = String.join("   ",
                "O   O",
                "O   O",
                "PPPP ",
                " SSS "
        );

        String line4 = String.join("   ",
                "O   O",
                "O   O",
                "P    ",
                "    S"
        );

        String line5 = String.join("   ",
                " OOO ",
                " OOO ",
                "P    ",
                "SSSS "
        );

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}