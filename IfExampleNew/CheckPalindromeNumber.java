public class CheckPalindromeNumber{
public static void main(String [] args){

int num = 121;
String s = String.valueOf(num);
int c;
for(int i = num.length-1; i>=0; i--){
c = c + s.charAt(i);
}
System.out.println(c);
}
}