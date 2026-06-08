import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(
            String s){

        HashMap<Character,Integer> map =
                new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for(int right = 0;
            right < s.length();
            right++){

            char ch = s.charAt(right);

            if(map.containsKey(ch)
                && map.get(ch) >= left){

                left = map.get(ch) + 1;
            }

            map.put(ch,right);

            maxLen = Math.max(
                    maxLen,
                    right-left+1
            );
        }

        return maxLen;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");

        String s = sc.nextLine();

        System.out.println(
            "Longest Length: "
            + lengthOfLongestSubstring(s)
        );

        sc.close();
    }
}