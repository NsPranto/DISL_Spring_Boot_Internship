package hackerrank_problems_solution;

import java.util.*;

public class Java_Map_34 {

    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,String> map = new HashMap<>();
        scanner.close();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String phone = scanner.nextLine();
            map.put(name, phone);
        }
        while (scanner.hasNextLine()) {
            String query = scanner.nextLine();
            if (map.containsKey(query)) {
                System.out.println(query + "=" + map.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }
}