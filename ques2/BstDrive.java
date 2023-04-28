package lab3_DSA.ques2;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import lab3_DSA.ques2.Node;

public class BstDrive {
    ArrayList<Integer> list=new ArrayList<>();
    static int search;

    public static void main(String[] args) {
        BstDrive bst = new BstDrive();
        Node root = null;
        //int search=0;
        Node nn = null;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(" enter number of nodes");
            int size = sc.nextInt();
            int i;
            for (i = 1; i <= size; i++) {
                System.out.println("Enter Data for the node");
                int item = sc.nextInt();
                nn = new Node(item);
                if (root == null)
                    root = nn;
                else
                    bst.insert(root, nn);
            }

            bst.inOrder(root);
            System.out.println(bst.list);

            System.out.println("Enter Sum to search");
             search = sc.nextInt();


        } catch (NoSuchElementException e) {
            System.err.println("Caught error: numeric value required : " + e.getMessage());

        }


        int flag = 0;

        for (int j = 0; j < bst.list.size(); j++) {

            int n1 = bst.list.get(j);
            int n2 = search - n1;
            if (bst.list.contains(n2)) {
                System.out.println("FOUND");
                System.out.println(n1 + "," + n2);
                flag = 1;
                break;
            }

        }
        if (flag == 0)
            System.out.println("NO MATCHING ELEMENTS FOUND");
    }



    private void insert(Node root, Node nn) {
        if(nn.data < root.data) //nn=50 , root=100
        {
            if(root.left==null)
            {
                root.left=nn;
            }
            else
            {
                insert(root.left,nn);

            }
        }
        else
        {
            if(root.right==null)
            {
                root.right=nn;
            }
            else
            {
                insert(root.right,nn);

            }
        }

    }
    private void inOrder(Node root) {
        if(root!=null)
        {
            inOrder(root.left);
            list.add(root.data);
            inOrder(root.right);
        }
    }



}


