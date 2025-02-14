package sec1;

import java.util.Scanner;

//중복문자제거
public class Main7 {
    public String solution(String str){
        String answer = "";
        for (int i = 0; i <str.length() ; i++) {
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            //특정문자에 접근하려면 charAt
            if(str.indexOf(str.charAt(i))==i) //특정 문자가 처음 등장한 위치를 찾음
                answer+=str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main7 t = new Main7();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(t.solution(str));
    }

}
