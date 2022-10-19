public class Recursion{
public static void main(String [] args){

printNumber(1);
}
public static void printNumber(int num1){
System.out.println(num1);
if(num1<10){
num1 = num1 + 1;
printNumber(num1);
}

}
}