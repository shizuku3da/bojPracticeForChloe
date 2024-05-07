import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        //알파벳 길이만큼의 배열을 만들고 문자열의 0번부터 뜯어서 읽으면서 위치 저장하자
        //b니까 b의 배열에 i 저장(순서 저장)
        //a니까 a의 배열에 i 저장(순서 저장)
        //그리고 i가 s의 길이-1까지 갔다면... 아 아니지 걍 초기값을 다 -1로 하면 되자누
        //해당 자리의 숫자가 -1이 아니라면 바꾸지 않는다

        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for(int i = 0 ; i < s.length() ; i++){
            char a = s.charAt(i);
            if(alphabet[a-'a'] == -1){
                alphabet[a-'a'] = i;
            }
        }
        for(int val : alphabet){
            System.out.print(val+" ");
        }

        }

}
