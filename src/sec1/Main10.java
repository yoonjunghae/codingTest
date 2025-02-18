package sec1;

import java.util.Scanner;

//숫자만 추출
public class Main10 {
    public int solution(String s){
        int answer = 0;
        for (char x :s.toCharArray() ) {
            if(x>=48 && x<=57) answer = answer*10 + (x-48);

        }

        return answer;
    }

    public static void main(String[] args) {
        Main10 t = new Main10();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(t.solution(str));

    }
}
