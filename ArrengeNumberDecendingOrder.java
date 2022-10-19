public class ArrengeNumberDecendingOrder{
public static void main(String [] args){

int nums [] = {3, 4, 9, 8, 0, 1, 7, 2};
int c = 0;
for(int i = 0; i<nums.length; i++){
for(int j = 0; j<nums.length; j++){

if(nums[i]<nums[j]){

c = nums[i];
nums[i]= nums[j];
nums[j]= c;
}  
}
}
for(int i = nums.length-1; i>=0; i--){
System.out.println(nums[i] + " ");
}
}
}