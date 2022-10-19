public class ArmstrongNumber{
public static void main(String [] args){

int num = 155;
int temp = num;
int r, sum = 0;

while(num!=0){
r= num%10;
sum = sum + r*r*r;
num = num/10;
}
if(temp==sum){
System.out.println("given number is armstrong number");
}
else{
System.out.println("given number is not armstrong number");
}
}
}