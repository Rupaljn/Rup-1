public class StringIsPalindrome{
public static void main(String [] args){

String s = "Nitin";
String reverse = "";

for(int i = s.length()-1; i>=0; i--){
reverse = reverse+s.charAt(i);
}
System.out.println(reverse);
if(s.equals(reverse)){
System.out.println("Given String is palindrome");
}
else{
System.out.println("Given String is not palindrome");
}
}
}