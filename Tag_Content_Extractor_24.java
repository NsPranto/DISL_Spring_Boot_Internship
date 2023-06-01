import java.util.*;
import java.util.regex.*;

public class Tag_Content_Extractor_24 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            Pattern pattern = Pattern.compile("<([^<>/]+)>([^<>]+)</(\\1)>");
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                System.out.println(matcher.group(2));
                while (matcher.find()) {
                    System.out.println(matcher.group(2));
                }
            } else {
                System.out.println("None");
            }

            testCases--;
        }
        in.close();
    }
}
