public class HelloWorld{
public static void main(String[] args){

printNumbers();

}

public static printNumbers(){
int num = 1;
System.out.println(num);
num = num+1;

printNumbers();
}


}