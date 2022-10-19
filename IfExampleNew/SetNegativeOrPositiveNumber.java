public class SetNegativeOrPositiveNumber{
public static void main(String [] args){

int nums [] = {3, -7,  8, 0, -8, -1, 6, 2, 9};
int c;
for(int i = 0; i<nums.length; i++){
for(int j = 0; j<nums.length; j++){
if(nums[i]<nums[j]){
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