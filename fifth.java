import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class M1{
static boolean isPrime(int n){
        int sum =0;
        
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum++;
        }
        }
        if(sum > 2){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>();
        int sum =0;
        int t;
        for(int i=0;i<n;i++){
          t = S.nextInt();
          if(isPrime(t)){
              al.add(t);
              sum += t;
          }
          
        }
        Collections.sort(al);
        System.out.println(sum - al.get(0));
    }

}

 