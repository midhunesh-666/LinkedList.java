

import java.util.*;
public class addlinklist{
    public static void main(String args[]){
        LinkedList <Integer> num=new LinkedList<>();
        num.add(10);
        num.add(20);
        int sum=0;
        for(int i=0;i<num.size();i++){
         sum += num.get(i);
            System.out.println(sum);
        }

    }
}
