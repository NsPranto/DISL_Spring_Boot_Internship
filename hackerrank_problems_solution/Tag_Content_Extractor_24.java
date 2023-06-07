import java.util.*;
import java.util.regex.*;

public class Tag_Content_Extractor_24 {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
        //https://www.youtube.com/watch?v=IMO3XBptPUo
        //https://www.hackerrank.com/challenges/tag-content-extractor/forum

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
