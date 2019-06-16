package sda;

import java.util.HashSet;

public class SetTest {

    public static void main(String[] args) {
        String text = "Ania has a cat and the cat is overweight";
        String[] split = text.split(" ");

        HashSet<String> uniqueStrings = new HashSet<>();
        for (String s : split) {
            uniqueStrings.add(s);
        }
        System.out.println(uniqueStrings.size());
        for (String uniqueString : uniqueStrings) {
            System.out.println(uniqueString);
        }

    }
}