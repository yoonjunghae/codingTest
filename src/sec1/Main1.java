package sec1;

import java.util.Scanner;
//대소문자변환
public class Main1 {
    public String solution(String str){
        String answer = "";
        for (char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main1 main1 = new Main1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(main1.solution(str));
    }
}
