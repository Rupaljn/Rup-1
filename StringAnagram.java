public class StringAnagram{
public static void main(String [] args){

String s1 = "Silent";
String s2 = "Listen";

char ch = s1.toCharArray();
char ch1 = s2.toCharArray();

char c;
char c1;

boolean flag = false;

for(int i = 0; i<s1.length(); i++){
for(int j = 0; j<s1.length(); j++){
if(ch[i]>ch[j]){
c = ch[i];
ch[i] = ch[j];
ch[j] = c;
}
}
}
for(int i = 0; i<s1.length(); i++){
if(ch[i]!=ch1[j]){
flag = true; 
break;
}
}
if(flag==true){
System.out.println("This is not anagram");
}
else{
System.out.println("This is anagram");

}
}
}