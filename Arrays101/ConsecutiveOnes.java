package Arrays101;

//Programa que regresa la máxima cantidad de 1's que se repiten
class ConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCons = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                count++;
                if(maxCons < count)
                    maxCons = count;
            }
            else
                count = 0;
        }
        return maxCons;
    }
}