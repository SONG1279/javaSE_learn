
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] start = new int[N];
        int[] stop = new int[N];
        for (int i = 0; i < N; i++){
            start[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++){
            stop[i] = sc.nextInt();
        }
        long result = 0;
        int i = N - 1;
        while(i != 0){
            if (start[i] !=0){
                if (stop[i] != 0){
                    if (start[i] > stop[i]){
                        start[i - 1] += start[i] - stop[i];
                        result += start[i] - stop[i];
                        stop[i] = 0;
                        start[i] = 0;
                        i -=1;
                    }else {
                        stop[i] -= start[i];
                        start[i] = 0;
                    }
                }else {
                    start[i - 1] += start[i];
                    result +=start[i];
                    start[i] =0;
                    i -= 1;
                }
            }else {
                i -= 1;
            }
        }
        for (int j = 1; j < N;j++){
            result += stop[j] * j;
        }
        System.out.println(result);


    }
}








/*import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class Main{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String S =sc.nextLine();
        int c = a % b;

        double B = (double) b;
       double C = (double)c;
        BigDecimal BB = new BigDecimal(B);
        BigDecimal CC = new BigDecimal(C);
        BigDecimal Result = CC.divide(BB, 1000,RoundingMode.DOWN);
        String str = Result.toString().substring(2);
        for (int i = 0; i < 100; i++){
            str+="000000000000000000000";
        }
        int song = str.indexOf(S);
        if (song == -1){
            System.out.println(-1);
        }else {
            System.out.println(song + 1);
        }


    }
}*/



/*
import java.util.Scanner;

public class Main {

    private static int[][] matrix =
            {{0, 1, 2, 1, 2, 3, 2, 3, 4},
                    {1, 0, 1, 2, 1, 2, 3, 2, 3},
                    {2, 1, 0, 3, 2, 1, 4, 3, 2},
                    {1, 2, 3, 0, 1, 2, 1, 2, 3},
                    {2, 1, 2, 1, 0, 1, 2, 1, 2},
                    {3, 2, 1, 2, 1, 0, 3, 2, 1},
                    {2, 3, 4, 1, 2, 3, 0, 1, 2},
                    {3, 2, 3, 2, 1, 2, 1, 0, 1},
                    {4, 3, 2, 3, 2, 1, 2, 1, 0}};

    public static void getTheNumber(int[] arr){
        int a = 0;
        a += matrix[0][arr[0]];
        for (int i = 0; i < arr.length - 1; i++){
            a += matrix[arr[i]][arr[i+1]];
        }
        System.out.println(a);


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int number = sc.nextInt();
        sc.nextLine();
        String[] str = new String[number];
        for (int i = 0; i < number; i++){
            String tmp = sc.nextLine();
            str[i] =  tmp.trim();
        }


        for (int i = 0; i < number; i++){

            char[] chars = str[i].toCharArray();
            int[] arr = new int[chars.length];
            for (int j = 0; j < chars.length; j++){
                int tmp = chars[j] - 'A';
                if (tmp < 3){
                    arr[j] = 1;
                }else if(tmp < 6){
                    arr[j] = 2;
                }else if(tmp < 9){
                    arr[j] = 3;
                }else if(tmp < 12){
                    arr[j] = 4;
                }else if(tmp < 15){
                    arr[j] = 5;
                }else if(tmp < 19){
                    arr[j] = 6;
                }else if(tmp < 22){
                    arr[j] = 7;
                }else if(tmp < 26){
                    arr[j] = 8;
                }
            }

            getTheNumber(arr);
        }
    }
}
*/