import java.util.Arrays;

public class mutidimentionalarray {
    
public static void main(String[] args) {
    int nums [] [] =  new int [3] [4];

for(int i =0; i<nums.length;i++){
    for(int j =0; j<nums[i].length;j++){
        nums[i][j] = (int) (Math.random()*100);
    }
}

 for(int[] row : nums) {

  System.out.println(); // move to next row 
    }
}
}
