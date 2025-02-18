package sec1;

import java.util.Scanner;

//숫자만 추출
public class Main11 {
    public int solution(String s){
        String answer = "";
        for (char x :s.toCharArray()) {
            if(Character.isDigit(x)) answer+=x;

        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main11 t = new Main11();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(t.solution(str));

    }
}