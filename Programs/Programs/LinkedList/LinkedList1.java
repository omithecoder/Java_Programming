package Programs.LinkedList;

import java.util.ArrayList;
import java.util.Scanner;

class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
        next=null;
    }
}
public class LinkedList1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Node head = null;
        Node n[] = new Node[100];
        int counter = 0;
        boolean loop = true;
        while(loop) {
            System.out.println("\n1)Create List\n2)Insert Element\n3)Display List\n4)CheckHasCycle\n5)Exit\n");
            int input = in.nextInt();
            switch (input)
            {
                case 1:
                    if(head==null)
                    {
                        System.out.println("Enter the number : ");
                        int val = in.nextInt();
                        head = new Node(val);
                    }
                    else
                    {
                        System.out.println("List Already Created!Please Insert Element");
                    }
                    break;

                case 2:
                    if(head==null)
                    {
                        System.out.println("List Not Created! First Create the list!");
                    }
                    else
                    {
                        System.out.println("Enter the number : ");
                        int val = in.nextInt();
                        n[counter] = new Node(val);
                        Node q = head;
                        while(q.next!=null)
                        {
                            q=q.next;
                        }
                        q.next=n[counter];
                        System.out.println("Node Successfully Inserted!");
                        counter++;
                    }
                    break;

                case 3:
                    if(head==null)
                    {
                        System.out.println("List Not Created! First Create the list!");
                    }
                    else
                    {
                        Node q = head;
                        while(q!=null)
                        {
                            System.out.print(q.val+" ");
                            q=q.next;
                        }
                    }
                    break;

                case 4:
                    ArrayList<Node>nextptr =  new ArrayList<>();
                    boolean lo = true;
                    Node q = head;
                    while (lo && q!=null)
                    {
                        if(!nextptr.contains(q.next))
                        {
                            nextptr.add(q.next);
                        }
                        else
                        {
                            System.out.println("true");lo=false;
                            break;
                        }
                        q=q.next;

                    }
                    if(q==null)
                    {
                        System.out.println("false");
                    }
                    break;


                case 5:
                    loop=false;
                    System.out.println("Thank You Visit Again!");
                    break;

                default:
                    System.out.println("Invalide Input! Enter Again!");

            }
        }


    }
}
