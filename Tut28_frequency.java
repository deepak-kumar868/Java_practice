package com.company;
import java.util.Scanner;
public class Tut28_frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine();
        int []freq=new int[26];
        for (int i = 0; i <26 ; i++) {
            freq[i]=0;
        }
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)!=' ') {
                freq[str.charAt(i) - 'a']++;
            }
        }
        int max=-1;
        for (int i = 0; i <26 ; i++) {
            if(max<freq[i]){
                max=freq[i];
            }
        }
        System.out.println("The letter which occur maximum time in given sentence is:"+max);
    }
}
