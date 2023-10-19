import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringMatcher {
    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuv18340";
        String regex = "^abcdefghijklmnopqrstuv18340$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Правильное выражение");
        } else {
            System.out.println("Неправильное выражение");
        }
    }
}
