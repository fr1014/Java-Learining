package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").matcher("I think i love you");

        while (m.find())
            System.out.print(m.group() + " ");
        System.out.println();
        int i = 0;
        while (m.find(i)){
            System.out.print(m.group() + " ");
            i++;
        }
    }
}
