import java.util.regex.*;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        if (Pattern.matches("[0-9]-[0-9]{3}-[0-9]{5}-[0-9X]{1}", stringToVerify) || Pattern.matches("[0-9]{9}[0-9X]{1}", stringToVerify)) {
            String str = stringToVerify.replaceAll("-", "");
            int count = 0;
            for (int i = 0; i < 10; i++) {
                count += str.charAt(i) == 'X' ? 10 * (10 - i) : Integer.parseInt(str.charAt(i) + "") * (10 - i);
            }
            if (count % 11 == 0)
                return true;

        }
        return false;
    }

}
