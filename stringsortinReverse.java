package practice;
import java.util.*;

public class stringsortinReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String[] strings = new String[5];
        System.out.println("Enter 5 strings:");
        for (int i = 0; i < 5; i++) {
            System.out.print("String " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                int len1 = strings[i].length();
                int len2 = strings[j].length();
                int minLen = Math.min(len1, len2);
                boolean swapped = false;

                for (int k = 0; k < minLen; k++) {
                    char c1 = Character.toLowerCase(strings[i].charAt(k));
                    char c2 = Character.toLowerCase(strings[j].charAt(k));

                    if (c1 < c2) {
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                        swapped = true;
                        break;
                    } else if (c1 > c2) {
                        swapped = true;
                        break;
                    }
                }

                if (!swapped && len1 < len2) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        System.out.println("\nStrings sorted in reverse (Z-A) order:");
        for (String str : strings) {
            System.out.println(str);
        }
	}

}
