package HarryClasses;

public class Chapter_3_PS_Exercise {
    public static void main(String[] args) {
        // Problem 1 - convert to lower case
//        String name = "Sunita Negi";
//        name = name.toLowerCase(Locale.ROOT);
//        System.out.println(name);

        // Problem 2 - convert spaces with underscores
//        String username = "ansh raj kujur";
//        username = username.replace(' ', '_');
//        System.out.println(username);
        // Problem 3 - write a java program to fill in a letter template which looks like below
        /*
        letter = "Dear <|Name|, Thanks a lot>"
        Replace <|Name| with a string name
         */
//        String  letter = "Dear <|Name|>, Thanks a lot";
//        letter = letter.replace("<|Name|>","Ansh");
//        System.out.println(letter);

        // Problem 4 - find double and triple spaces in a string

//        String paragraph = "This is a paragraph. My name is Sunita  Negi.";
//        System.out.println(paragraph.indexOf("  "));
//        System.out.println(paragraph.indexOf("   "));

        // Problem 5
        /*
        Format following letter
        letter = "Dear Harry, This Java Course is nice. Thanks"
         */
        String  letter = "Dear Harry,\n\tThis Java Course is nice.\nThanks";
        System.out.println(letter);


    }
}
