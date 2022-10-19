public class WordReverse{
public static void main(String [] args){
String s = "java is Best";
String reverse = "";

for(int i = 0; i<=s.length(); i++){
if(i==s.length()-1){

reverse = reverse + s.charAt[i]; 
}
else{
reverse = " " + s.charAt[i];
}
}
System.out.println(reverse[i]);
}
}