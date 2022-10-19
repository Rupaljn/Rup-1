public class PositiveAndNegativeNumber{
public static void main(String [] args){

int nums [] = {7, -5, 2, 0, -6, -1, 3};

int c = 0;

for(int i =0; i<nums.length; i++){
for(int j = 0; j<i; j++){
if(nums[i]>nums[j]){
c = nums[i];
nums[i] = nums[j];
nums[j] = c;
}
}
}
for(int i = 0; i<nums.length; i++){
System.out.println(nums[i] + " ");
}
}
}