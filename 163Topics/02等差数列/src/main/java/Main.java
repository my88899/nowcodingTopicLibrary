import java.util.Scanner;

public class Main {
    public static String main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        String s = in.nextLine();
        int n = Integer.parseInt(args[0]);
        String s = args[1];
        String[] sa = s.split(" ");
        Node point = new Node(Integer.parseInt(sa[0]);
        Node left = point;
        Node right = point;
        int tmp;
        for(int i=1; i<sa.length; i++){
            tmp = Integer.parseInt(sa[i]);
            Node new = new Node(tmp);
            if(tmp > point) {
                if(point.right == null){

                }
            }else if(tmp < point) {
                if(point.right == null)
            }
        }
        return "Possible";
    }
}
private class Node {
    int val = 0;
    Node left = null;
    Node right = null;
    public void Node(int value) {
        this.val = value;
    }
}
