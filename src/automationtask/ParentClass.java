/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automationtask;

/**
 *
 * @author neerajsah
 */
public class ParentClass 
{
    public void reverseString(String string)
    {
       System.out.println("This method should reverse entered string of ParentClass\n");
    }
    
    public void addArray(int[] a,int[] b)
    {   
        System.out.println("This method should add second array into first of ParentClass\n");
    }
    
    public void reverseString(String string,int[] a)
    {
       System.out.println("This is the example of overloading from reverseString() of ParentClass\n");
    }
    
    public void addArray(int[] a,int[] b,String string)
    {   
        System.out.println("This is the example of overloading from addArray() of ParentClass\n");
    }
}
