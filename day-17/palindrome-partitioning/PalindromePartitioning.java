import java.util.*;

public class PalindromePartitioning {

    static boolean isPalindrome(
            String s,
            int start,
            int end){

        while(start < end){

            if(s.charAt(start)
                != s.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    static void solve(
            int index,
            String s,
            List<String> path,
            List<List<String>> ans){

        if(index == s.length()){

            ans.add(
                new ArrayList<>(path)
            );

            return;
        }

        for(int i=index;
            i<s.length();
            i++){

            if(isPalindrome(
                    s,
                    index,
                    i)){

                path.add(
                    s.substring(
                        index,
                        i+1
                    )
                );

                solve(
                    i+1,
                    s,
                    path,
                    ans
                );

                path.remove(
                    path.size()-1
                );
            }
        }
    }

    public static void main(String[] args){

        String s = "aab";

        List<List<String>> ans =
                new ArrayList<>();

        solve(
            0,
            s,
            new ArrayList<>(),
            ans
        );

        System.out.println(ans);
    }
}