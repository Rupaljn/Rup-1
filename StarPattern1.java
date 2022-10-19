public class StarPattern2{
public static void main(String [] args){

for(int i = 1; i<=10; i++){
for(int j = 10; j>=i; j--){
System.out.print(" ");
}
for(int k = 1; k<=i; k++){
System.out.print("*");
}
System.out.println();
}
for(int l = 1; l<=10; l++){
for(int m = 1; m<=l; m++){
System.out.print(" ");
}
for(int n = 10; n>=l; n--){
System.out.print("*");
}
System.out.println();
}
}
}