package chap01_조합;

import java.util.Arrays;

public class 부분집합_배열 {

    static int[] arr;
    static int N;
    static int[] sel;
    static int R;
    static int cnt = 0;

    public static void main(String[] args) {

        N = 10;
        arr = new int[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = i*3;
        }

        R = 3;

        for(int i=1 ; i<=R ; i++){
            sel = new int[i];
            powerSet(0, 0, i);
        }

        System.out.println("경우의 수 : " + cnt);
    }

    private static void powerSet(int idx, int sidx, int len){
        if(sidx==len){
            System.out.println(Arrays.toString(sel));
            cnt++;
            return;
        }

        for(int i=idx ; i<N ; i++){
            sel[sidx] = arr[i];
            powerSet(i+1, sidx+1, len);
        }
    }

}
