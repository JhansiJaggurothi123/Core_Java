// Assignment: Count Total Number of Vowels and Consonants in a String
//Scenario: You are building a word analysis tool. The user enters a sentence, and you need to count the total number of vowels and consonants present in the sentence to provide insights into its composition.
import java.util.*;
public  class CountVowelConsonentSentence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String sentence=sc.nextLine().toLowerCase();
        int vowel=0,consonent=0;
        for(char ch:sentence.toCharArray()){
            if(ch>='a' && ch<='z' ){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                    vowel++;
                else
                    consonent++;
            }
        }
        System.out.println("num of vowels :"+vowel);
        System.out.println("num of consonents :"+consonent);
    }
}
