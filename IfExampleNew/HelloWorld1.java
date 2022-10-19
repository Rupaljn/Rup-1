public class HelloWorld1{
public static void main(String[] args){

printNumbers(1);

}

public static void printNumbers(int num1){


System.out.println(num1);
if(num1<10){
num1 = num1+1;

printNumbers(num1);
}
}


}