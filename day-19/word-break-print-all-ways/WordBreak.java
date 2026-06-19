import java.util.*;

public class WordBreak {

    static void solve(
            String s,
            Set<String> dict,
            String ans){

        if(s.length()==0){

            System.out.println(
                ans.trim()
            );

            return;
        }

        for(int i=1;
            i<=s.length();
            i++){

            String left =
                s.substring(0,i);

            if(dict.contains(left)){

                solve(
                    s.substring(i),
                    dict,
                    ans+left+" "
                );
            }
        }
    }

    public static void main(String[] args){

        Set<String> dict =
                new HashSet<>();

        dict.add("cat");
        dict.add("cats");
        dict.add("and");
        dict.add("sand");
        dict.add("dog");

        solve(
            "catsanddog",
            dict,
            ""
        );
    }
}