package sec1;

import java.util.ArrayList;
import java.util.Scanner;

//단어뒤집기
public class Main5 {
    public ArrayList<String> solution(int n, String[]str){
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            //문자열을 여러 번 수정할 때는 StringBuilder가 더 성능이 좋다!
            answer.add(tmp);
            
        }

        return answer;
    }

    public static void main(String[] args) {
        Main5 t = new Main5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str= new String[n];
        for (int i = 0; i <n ; i++) {
            str[i]=kb.next();
            
        }
        for (String x : t.solution(n,str)) {
            System.out.println(x);
            
        }
    }
}
