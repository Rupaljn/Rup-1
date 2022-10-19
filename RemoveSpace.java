public class RemoveSpace{
public static void main(String [] args){
String s = "Java is a Programming language and it is easy to learn";
count(s);
}
public static void count(String x){
char ch [] = x.toCharArray();

int latter = 0;
int number = 0;
int space = 0;
int other = 0;

for(int i = 0; i<=x.length(); i++){
if(Character.isLetter(ch[i])){
latter ++;
}
else if(Character.isDigit(ch[i])){
number ++;
}
else if(Character.isSpace(ch[i])){
space++;
}
else{
other ++;
}
}
System.out.println("Java is a Programming language and it is easy to learn");
System.out.println("latter =" + latter);
System.out.println("number =" + number);
System.out.println("space =" + space);
System.out.println("other =" + other);
}
}