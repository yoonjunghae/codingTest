package sec1;

import java.util.Scanner;
//투 포인터 알고리즘
//String은 불변(immutable)이라 직접 수정 불가 → char[]로 변환해서 처리
public class Main6 {
    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) { //lt가 rt를 넘어서지 않는 동안만 실행 lt == rt가 되면 문자열의 중앙에 도달한 것이므로 종료
            if (!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }


        }

        answer=String.valueOf(s); //char[]을 다시 String으로 변환하여 반환
        return answer;
    }

    public static void main(String[] args) {
        Main6 t = new Main6();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(t.solution(str));
    }
}
