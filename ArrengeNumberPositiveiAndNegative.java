public class ArrengeNumberPositiveiAndNegative{
public static void main(String [] args){

int nums [] = {2, -7, 4, 0, -9, 3, -5};
int c = 0;

for(int i = 0; i<nums.length; i++){
for(int j = 0; j<nums.length; j++){
if(nums[i]>nums[j]){

c= nums[i];
nums[i]= nums[j];
nums[j] = c;
}
}
}
for(int i = 0; i<nums.length; i++){
System.out.println(nums[i] + " ");
}
}
}