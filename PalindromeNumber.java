/*WAP to chech whether the given number is palindrome or not */
import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to palindrome number");
        System.out.print("please enter the number: ");//53
        int num=scanner.nextInt();
        boolean  isPalindrome= isPalindrome(num);
        //System.out.println(num)  ;
        if (isPalindrome) {
            System.out.println("your number is pqalindrome");
        }
        else{
            System.out.println("Your number is not palindrome");
        }
    }
    public static boolean isPalindrome(int num){

;        return  num==reverse(num);
        
    }
    public static int reverse(int num){
        int newNum=0;
        while (num>0) {
           int digit=num%10;
            newNum=newNum*10 + digit;
            num/=10;
        }
       // System.out.println("num is: "+ num);
       // System.out.println("new num after reversing is: " + newNum);
        return newNum;
    }
}