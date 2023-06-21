import java.util.*;
class Main {

    static int n,m;
    static int[] dy;
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        dy=new int[m+1];
        for (int i =0; i<n; i++){
            int ps=kb.nextInt();
            int pt=kb.nextInt();
            for (int j=m; j>=pt; j--){
                dy[j]=Math.max(dy[j],dy[j-pt]+ps);
            }
        }

        System.out.println(dy[m]);
    }
}
