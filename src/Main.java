import java.util.*;


class Main {
    static int[] fibo;

    public int Solution(int n){
        if (fibo[n]>0) return fibo[n];
       else return fibo[n]=Solution(n-2)+Solution(n-1);
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        fibo=new int[n+1];
        fibo[1]=1;
        fibo[2]=2;
        System.out.println(T.Solution(n));
    }
}
