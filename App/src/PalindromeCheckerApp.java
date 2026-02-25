import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to Palindrome Checker App Management System");
        System.out.println("Version 1.0");

        //Palindrome Logic
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str= sc.next();
        char[] normalString=str.toCharArray();
        int n=normalString.length;
        char[] reversedString=new char[n];
        for(int i=0; i<n; i++){
            reversedString[n-i-1]=normalString[i];
        }
        for(int i=0; i<n;i++){
            if(normalString[i]!=reversedString[i]){
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("Given string is a palindrome");
    }
}