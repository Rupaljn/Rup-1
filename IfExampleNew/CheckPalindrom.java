public class CheckPalindrom{
public static void main(String [] args){

String s = "Nitii";
String reverse = "";
for(int i = s.length()-1; i>=0; i--){
reverse = reverse + s.charAt(i);
}
if(s.equalsIgnoreCase(reverse)){
System.out.println("Given String is palindrom");
}
else{
System.out.println("Given string is not palindrom");
}
}
}