package com.company;
import java.util.*;
public class Tut26_Largest_word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str=sc.nextLine();
        int currentLength=0;
        int wordLength=0;
        int i=0;
        while (i<=str.length()-1){
            if (str.charAt(i)==' '){
                if(wordLength<currentLength){
                    wordLength=currentLength;
                }
                currentLength=0;
            }
            else if(str.length()-1==i){
                currentLength++;
                if(wordLength<currentLength){
                    wordLength=currentLength;
                }
            }
            else{
                currentLength++;
            }
            i++;
        }
        System.out.println("The maximum length word is:"+wordLength);
    }
}
