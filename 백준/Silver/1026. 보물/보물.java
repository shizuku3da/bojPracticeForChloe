import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //B는 그대로, A만 재배열임
        //0이 있으면 그건 꼭 B의 제일 큰 수 자리에 두기
        //근데 생각해보니까 b는 그대로 뒀다고 치고 걍 제일 적게 나오도록 막 조작해도 노상관이자나
        //그거에 맞춰서 b는 그대로고 a를 옮겼다고 하면 되니까
        //즉 a는 오름차순 b는 내림차순으로 정렬해서 곱의 합을 구하면 되는듯?

        //0 1 1 1 6
        //8 7 3 2 1
        //0 7 3 2 6
        //즉 18이 됨

        //1 1 3
        //30 20 10
        //30 20 30
        //즉 80이 됨

        //0 0 3 5 15 26 31 39 100
        //13 12 11 9 5 4 3 2 1
        //0 0 33 45 75 64 93 78 100
        //즉 528

        int n = sc.nextInt();
        int[] a = new int[n];
        Integer[] b = new Integer[n];

        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        int sum = 0;

        for(int i = 0 ; i < n ; i++){
            sum += a[i]*b[i];
        }


        System.out.println(sum);
    }
}
