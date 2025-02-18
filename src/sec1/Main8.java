package sec1;

import java.util.Scanner;

public class Main8 {
    public String solution(String str){
        String answer = "YES";
        str=str.toUpperCase();
        int len = str.length();
        for (int i = 0; i <len/2 ; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) return "NO";
        }
            


        return answer;
    }

    public static void main(String[] args) {
        Main8 t = new Main8();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(t.solution(str));
    }
}
