package com.company;

import java.util.ArrayList;

public class Palindrome {

    public static <E> void palindrome(E[] array,int n)
    {
        int flag=0;

        for(int i=0;i<=n/2 && n!=0;i++)
        {
            if(array[i] != array[n-i-1])
            {
                flag=1;
                break;
            }
        }

        if(flag==1)
        {
            System.out.println("The input is not a palindrome.");
        }
        else
        {
            System.out.println("The input is a palindrome.");
        }

    }


    public static void main(String[] args) {
	// write your code here

        Integer arr1[]={1,2,1};
        int n=arr1.length;
        palindrome(arr1,n);

        String arr2[]={"ANA","BANANA","ANA"};
        int m=arr2.length;
        palindrome(arr2,m);

        Character arr3[]={'K','A','L','A','B','A','L','A','K'};
        int k=arr3.length;
        palindrome(arr3,k);

        Character arr4[]={'3','3','3','3'};
        int h=arr4.length;
        palindrome(arr4,h);

        Integer arr5[]={1,2,3,4,5,6};
        int d=arr5.length;
        palindrome(arr5,d);

    }
}
