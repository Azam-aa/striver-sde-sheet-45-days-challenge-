import java.util.*;

public class FindFirstOccurrence {

    static int[] buildLPS(String pat) {

        int[] lps = new int[pat.length()];

        int len = 0;
        int i = 1;

        while (i < pat.length()) {

            if (pat.charAt(i) == pat.charAt(len)) {

                len++;
                lps[i] = len;
                i++;

            } else {

                if (len != 0)
                    len = lps[len - 1];
                else
                    i++;
            }
        }

        return lps;
    }

    static int strStr(String text, String pattern) {

        int[] lps = buildLPS(pattern);

        int i = 0;
        int j = 0;

        while (i < text.length()) {

            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == pattern.length())
                return i - j;

            else if (i < text.length() &&
                    text.charAt(i) != pattern.charAt(j)) {

                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(
                strStr(haystack, needle)
        );
    }
}