public class ReverseNumberArray{
public static void main(String [] args){

int num [] = {2, 5, 8, 9, 0, 3, 7, 6};
int c;

for(int i = 0; i<num.length; i++){
for(int j = 0; j<num.length; j++){
if(num[i]<num[j]){
c = num[i];
num[i] = num[j];
num[j] = c;
}
}
}
for(int i = num.length-1; i>=0; i--){
System.out.println(num[i]);
}
}
}