package chap02_중복순열;

import java.util.Arrays;

public class 중복순열_배열 {

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
        sel = new int[R];

        perm(0);
        System.out.println("경우의 수 : " + cnt);
    }

    private static void perm(int sidx){
        if(sidx==R){
            System.out.println(Arrays.toString(sel));
            cnt++;
            return;
        }

        for(int i=0 ; i<N ; i++){
            sel[sidx] = arr[i];
            perm(sidx+1);
        }
    }

}
