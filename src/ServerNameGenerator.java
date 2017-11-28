public class ServerNameGenerator {
    private static String[] adjectives = {
            "stretchy",
            "fluffy",
            "sharp",
            "burning",
            "heavy",
            "slow",
            "wet",
            "annoying",
            "empty",
            "dark"
    };
    private static String[] nouns = {
            "muscle",
            "ship",
            "tank",
            "mitten",
            "pot",
            "bowl",
            "country",
            "hat",
            "spike",
            "brick"
    };
    private static int rndAdj = (int) Math.floor(Math.random() * adjectives.length);
    private static int rndNoun = (int) Math.floor(Math.random() * nouns.length);

    private static String getRandomElement(String[] array1, String[] array2) {
        return String.format("%s-%s", array1[rndAdj], array2[rndNoun]);
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.println(getRandomElement(adjectives, nouns));
    }
}