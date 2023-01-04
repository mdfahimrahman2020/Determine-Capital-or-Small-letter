import java.util.Scanner;
public class letter4{
public static void main(String[] args){
System.out.println("\t\n\"Determine Vowel or Consonent letter\"");
Scanner input = new Scanner(System.in);
char let;
System.out.println("Enter a letter : ");
let = input.next().charAt(0);

if (let>='a' && let<='z'){
System.out.println("This is Small letter");
}

else if (let>='A' && let<='Z'){
System.out.println("This is Capital letter");
}


else {System.out.println("This is not a letter");}


}
}