public class StringReverse{
public static void main(String [] args){

String s = "java is a programming language and it is easy to learn";
String reverse = "";

for(int i = s.length()-1; i>=0; i--){
reverse = reverse+s.charAt(i);
}
System.out.println(reverse);
}
} 