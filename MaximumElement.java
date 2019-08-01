import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> maxstack=new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int c=sc.nextInt();
            if(c==1)
            {
                int temp=sc.nextInt();
                stack.push(temp);
                if(maxstack.isEmpty() || temp>=maxstack.peek())
                {
                    maxstack.push(temp);
                }
            }
            else if(c==2)
            {
                int a=stack.pop();
                if(maxstack.peek()==a)
                    maxstack.pop();
            }
            else
            {
                System.out.println(maxstack.peek());
            }
        }
    }
}
