package chap01_순열;

import java.util.Arrays;

public class 순열_인덱스 {

    static int N;
    static int[] sel;
    static int R;
    static boolean[] visited;
    static int cnt = 0;

    public static void main(String[] args) {

        N = 10;

        R = 3;
        sel = new int[R];

        visited = new boolean[N];

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
            if(!visited[i]){
                sel[sidx] = i;
                visited[i] = true;
                perm(sidx+1);
                visited[i] = false;
            }
        }
    }

}
