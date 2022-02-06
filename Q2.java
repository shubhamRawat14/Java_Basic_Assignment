/*
Q2.Write a Java program to sort a given binary array in linear times.
Linear time: An algorithm is said to take linear time, or O(n) time, if its time complexity is O(n). 
Informally, this means that the running time increases at most linearly with the size of the input. 
More precisely, this means that there is a constant c such that the running time is at most cn for every input of size n. 
For example, a procedure that adds up all elements of a list requires time proportional to the length of the list, 
if the adding time is constant, or, at least, bounded by a constant.
Example:
Input :
b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 }
Output:
After sorting: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
*/
import java.util.Arrays;
public class Q2 {
    public static int[] sorting_1_and_0(int[] nums){
        //Using two indexes to traverse Method.
        int frontPointer=0,rearPointer=nums.length -1;
        while(frontPointer<rearPointer){
            if(nums[frontPointer]==1){
                while(frontPointer < rearPointer){
                    if(nums[rearPointer]==0){
                        int temp = nums[frontPointer];
                        nums[frontPointer]=nums[rearPointer];
                        nums[rearPointer]=temp;
                        break;
                    }
                    rearPointer--;
                
                }
            }
            frontPointer++;
        }
        return nums;

    }
    public static void main(String[] args) {
        System.out.print("Compile by Shubham Singh Rawat \nEmployee ID: 1747\n ");
        int b_nums[] ={0,1,1,0,1,1,0,1,0,0};
        int afterSort[]=sorting_1_and_0(b_nums);
        System.out.println(Arrays.toString(afterSort));
    }
}
