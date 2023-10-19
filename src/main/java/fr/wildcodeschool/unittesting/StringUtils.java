package fr.wildcodeschool.unittesting;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouAEIOU";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) throws Exception {
        if(candidate != "") {
            String vowels = "";
            char[] letters = candidate.toCharArray();
            for (int i = 0; i < candidate.length(); i++) {
                if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                    vowels += letters[i];
                }
            }
            return vowels;
        } else {
            throw new Exception("Your input shouldn't be empty !");
        }
    }

    public static String uniqueVowels(String candidate) throws Exception {
        if(candidate != "") {
            String vowels = "";
            char[] letters = candidate.toCharArray();
            for (int i = 0; i < candidate.length(); i++) {
                if (ALL_VOWELS.indexOf(letters[i]) >= 0 && vowels.indexOf(letters[i]) == -1) {
                    vowels += letters[i];
                }
            }
            return vowels;
        } else {
            throw new Exception("Your input shouldn't be empty !");
        }
    }

}