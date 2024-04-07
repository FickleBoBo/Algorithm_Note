package chap02_중복조합;

import java.util.Arrays;

public class 중복조합_인덱스 {

    static int N;
    static int[] sel;
    static int R;
    static int cnt = 0;

    public static void main(String[] args) {

        N = 10;

        R = 3;
        sel = new int[R];

        comb(0, 0);
        System.out.println("경우의 수 : " + cnt);
    }

    private static void comb(int idx, int sidx){
        if(sidx==R){
            System.out.println(Arrays.toString(sel));
            cnt++;
            return;
        }

        for(int i=idx ; i<N ; i++){
            sel[sidx] = i;
            comb(i, sidx+1);
        }
    }

}
