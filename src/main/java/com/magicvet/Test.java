package main.java.com.magicvet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    static String mobileNumberPattern = "^\\+380\\d{9}$" ;//^початок рядку, 9 цифр у номера,$ end for line

    public static void main(String[] args) {
        String[] mobileNumbers = {"+380937052757", "+380931183195", "+380457329", "380932784248"};

        for (String number : mobileNumbers) {
            boolean valid = validateMobileNumber(number);
            System.out.println(number + " is " + (valid ? "valid" : "invalid" ));
        }

    }

    private static boolean validateMobileNumber(String number) {

        Pattern compiledPattern = Pattern.compile(mobileNumberPattern);
        Matcher matcher = compiledPattern.matcher(number);

        return matcher.matches();
    }
}

