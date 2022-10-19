public class PositiveAndNegativeNumber1{
public static void main(String [] args){

int nums [] = {4, -7, 8, -9, 0, -2, 5 , 7};
int c;

for(int i = 0; i<nums.length; i++){
for(int j = 0; j<nums.length; j++){
if(nums[i]>nums[j]){
c = nums[i];
nums[i] = nums[j];
nums[j] = c;
}
}
}
for(int i = 0; i<nums.length; i++){
System.out.println(nums[i]);
}
}
}