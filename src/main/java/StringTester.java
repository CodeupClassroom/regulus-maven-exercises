import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me something:");
        String userIn = sc.nextLine();
        if (StringUtils.isNumeric(userIn)) {
            System.out.printf("%s is numeric!%n", userIn);
        } else {
            System.out.printf("%s is not numeric!%n", userIn);
        }
        String flippedCase = StringUtils.swapCase(userIn);
        System.out.printf("Did you know if you swap the case of %s you get %s?%n", userIn, flippedCase);
        String reversedIn = StringUtils.reverse(userIn);
        System.out.printf("Did you know if you reverse %s you get %s?%n", userIn, reversedIn);
    }
}
