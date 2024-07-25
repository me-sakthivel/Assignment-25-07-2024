import java.util.Scanner;
public class M1{
    
    static boolean isPrime(int n){
        int sum =0;
        
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum++;
        }
        }
        if(sum < 2){
            return false;
        }
        return true;
    }
    
    static String input(String n){
        String str = new String(n);
        int len = str.length();
        int sum = 0;
        while(len > 1){
            
            for(int i =0;i<str.length();i++){
                sum += Character.getNumericValue(str.charAt(i));
            }
    
            str = String.valueOf(sum);
            sum = 0;
            len = str.length();
            
        }

        return str;
    }
    
    
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        String s1 = S.nextLine();
        int len = s1.length();
        String output = "";
        
        if(len%2 == 0){
            output += "C";
        }
        else{
            output += "W";
        }
        
        if(isPrime(len)){
            output += "N";
        }
        else{
            output += "P";
        }
        
        output += input(s1);

        output += s1;
        System.out.println(output);
        
    }
}