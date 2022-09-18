

public class array {

    public int twosum(int nums [],int target){

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                if(nums[i] + nums[j] == target){

                    return j;
                }
            }
            return i;
        }
        return 0;
       
    }

 public static void main(String[] args) {
        int nums [] = {2,7,11,15};
      int target = 9;
        
      twosum(nums,target);
    }
}
