package sec1;

    import java.util.Scanner;
//주어진 문자열에서 가장 긴 단어를 찾아 반환하는 기능
    public class Main3 {
        public String solution(String str){
            String answer = "";
            int m = Integer.MIN_VALUE; //pos
            /*while ((pos=str.indexOf(' '))!=-1){
                String tmp = str.substring(0,pos);
                int len = tmp.length();
                if(len>m){
                    m=len;
                    answer=tmp;

                }
                str = str.substring(pos+1);
            }
            if(str.length()>m) answer=str;*/
            String[] s = str.split(" ");
            for (String x : s) {
                int len = x.length();
                if(len>m) {
                    m = len;
                    answer = x;
                }
            }

            return answer;
        }

        public static void main(String[] args) {
            Main3 T = new Main3();
            Scanner kb = new Scanner(System.in);
            String str = kb.nextLine();
            System.out.println(T.solution(str));
        }
    }
