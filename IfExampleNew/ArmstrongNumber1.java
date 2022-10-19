public class ArmstrongNumber1{
public static void main(String [] args){

int num = 153; 
int sum = 0;
int r = 0;
int temp = num;
while(num!=0){
r =num%10;
num = num/10;
sum = sum + r*r*r; 
}
if(temp==sum){
System.out.println("Number is armstrongNumber");
}
else{
System.out.println("Number is not armstrongNumber");
}
}
}