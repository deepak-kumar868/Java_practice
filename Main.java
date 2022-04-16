package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	int []arr={34,56,78,23,12};
        for (int i = 0; i <5 ; i++) {
         System.out.println(arr[i]);
        }

        System.out.println("Enter the Element of array");
        int []marks=new int[5];
        for (int i = 0; i <5 ; i++) {
            marks[i]=sc.nextInt();
        }

        for (int i = 0; i <5 ; i++) {
            System.out.println(marks[i]);
        }
        int max=-99999;
        int min= 95678;

        for (int i = 0; i <5 ; i++) {
            if (marks[i]>=max){
                max=marks[i];
            }
            if (marks[i]<=min){
                min=marks[i];
            }
        }
        System.out.println("The maximum marks is:"+max);
        System.out.println("The minimum marks is:"+min);
    }
}
