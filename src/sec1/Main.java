package sec1;

import java.util.Scanner;
//문자찾기 1-1
//사용자가 입력한 문자열에서 특정 문자가 몇 번 등장하는지 세는 프로그램
public class Main {
   public int solution(String str, char t){
       int answer = 0;
       str= str.toUpperCase();
       t=Character.toUpperCase(t);
       for (int i = 0; i <str.length() ; i++) {
           if(str.charAt(i)==t) answer++;
       }
       return answer;
   }

    public static void main(String[] args) {
        Main t = new Main(); //Main클래스의 인스턴스 t 생성
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); //kb.next()는 공백(스페이스, 탭, 엔터) 이전까지의 문자열을 입력
        char c = kb.next().charAt(0);
        System.out.print(t.solution(str, c));
    }
}
