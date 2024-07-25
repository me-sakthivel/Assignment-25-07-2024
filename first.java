import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        String str = S.nextLine();
        
        str = str.replaceAll("[a-zA-Z]", "");
        
        ArrayList<Character> s = new ArrayList<Character>();
        ArrayList<Integer> n = new ArrayList<Integer>();
        
        for(int i =0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                n.add(Character.getNumericValue(str.charAt(i)));
            }
            else{
                s.add(str.charAt(i));
            }
        }
        
        int num = n.get(0);
        n.remove(0);
        char ch;
        for(int i=0;i<s.size();i++){
            ch = s.get(i);
            switch(ch){
                case '+':{
                    num += n.get(0);
                    n.remove(0);
                    break;
                }
                
                case '-':{
                    num -= n.get(0);
                    n.remove(0);
                    break;
                }
                
                case '*':{
                    num *= n.get(0);
                    n.remove(0);
                    break;
                }
                case '/':{
                    num /= n.get(0);
                    n.remove(0);
                    break;
                }
            }
        }
        System.out.println(num);
    }
}
