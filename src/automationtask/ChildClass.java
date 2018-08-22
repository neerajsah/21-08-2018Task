/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automationtask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author neerajsah
 */
public class ChildClass extends ParentClass
{
    int count=0;
    int[] fin;
    List<String> list=new ArrayList<>();
    List<String> list1=new ArrayList<>();
    
    public void countSpaces(String string)
    {
       for(int i=0;i<string.length();i++)
        {
          if(string.charAt(i)==' ')
          {
             count++;  
          }  
        }
    }
    
    public void addToList(String string)
    {
       Scanner scn1=new Scanner(string);
         
       for(int i=0;i<count+1;i++)
        {
           list.add(scn1.next());
        }
        System.out.println(list);
    }
    
    public void reverse()
    {
       for(int i=list.size()-1;i>=0;i--)
        {
           list1.add(list.get(i));
        }
        System.out.println(list1);
    }
    
    @Override
    public void reverseString(String string)
    {
        
        System.out.println("Example of overriding\n");
       
        countSpaces(string);

        addToList(string);
        
        reverse();
        
    }
    
    @Override
    public void addArray(int[] a,int[] b)
    {   
        System.out.println("Example of overriding\n");
         
        int len=a.length+b.length;
        fin=new int[len];
        for(int i=0;i<a.length;i++)
        {
            fin[i]=a[i];
        }
            int f=0;
            for(int j=a.length;j<fin.length;j++)
             {
                 fin[j]=b[f];
                 f++;
             }
            
            
             
        for(int i=0;i<len;i++)
        {
            System.out.println(fin[i]);
        }
    }
    
    public static void main(String[] args)
    {
        int[] a={1,2,3},b={4,5,6};
        String string="my name is neeraj";
        
       ChildClass cc=new ChildClass();
       ParentClass pc=new ParentClass();
       
       cc.addArray(a, b);
       cc.reverseString(string);
       
       pc.addArray(a, b);
       pc.addArray(a, b, string);
       pc.reverseString(string);
       pc.reverseString(string, a);
       
    }
}
