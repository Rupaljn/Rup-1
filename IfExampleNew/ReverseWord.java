public class ReverseWord{
public static void main(String [] args){

String s = "java is programming language";
String words [] = s.split("\\s");
String reverse = "";
for(int i = 0; i<words.length; i++){
if(i==words.length-1){
reverse = words[i] + reverse;
}
else{
reverse = " " + words[i] + reverse;
}
}
System.out.println(reverse);
}
}
