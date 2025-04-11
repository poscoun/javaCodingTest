import java.util.Scanner;

// 백준 2744
// 대소문자 바꾸기
// 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
// 예제 입력: WrongAnswer
// 예제 출력: wRONGaNSWER
public class Boj2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ans = str.toCharArray();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if('A' <= ch && ch <= 'Z') {
                ans[i] = (char)('a' + (ch - 'A'));
            } else {
                ans[i] = (char)('A' + (ch - 'a'));
            }
            System.out.print(ans[i]);
        }
    }
}

