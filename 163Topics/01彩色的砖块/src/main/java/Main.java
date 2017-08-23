import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        HashSet<String > hashSet = new HashSet<>();
        for (int i=0; i<s.length(); i++) {
            hashSet.add(s.substring(i, i+1));
            if (hashSet.size() > 2) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(hashSet.size());;
    }
}