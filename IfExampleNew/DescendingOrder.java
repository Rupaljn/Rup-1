public class DescendingOrder{
public static void main(String [] args){

int nums [] = {2, 7, 4, 0, 9, 3, 5};
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
for(int i =nums.length-1; i>=0; i--){
System.out.println(nums[i]);
}
}
}