package hackerrank_problems_solution;

import java.util.Scanner;

class Java_Regex_21{

    public static void main(String[] args){
        //https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
        //https://www.youtube.com/watch?v=e8LvIbWOdRM
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}
/*(Java regular expressions for Ip address)
     [01]?\\d{1,2}   matches numbers 0-199.
     2[0-4]\\d       matches numbers 200-249
     25[0-5]         matches numbers 250-255
*/
class MyRegex {
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "." +  num + "." +  num + "." + num;
}
