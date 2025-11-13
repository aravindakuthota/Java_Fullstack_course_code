/* 
A 3D array is like:

-> 3 buildings

-> Each building has 4 floors

-> Each floor has 5 rooms

-> So to fill all rooms:

-> First loop → which building

-> Second loop → which floor

-> Third loop → which room

-> Then we print it the same way.

*/


public class threedimentionlaarray {
  public static void main(String[] args) {
    int nums[] [] []  = new int [2] [2] [3];


 // fill with random values
for(int i=0; i<nums.length;i++){
    for(int j =0; j<nums[i].length;j++){
        for(int k =0; k<nums[i][j].length;k++){
        nums[i] [j] [k] = (int) (Math.random()*100);
    }
}
}

 // print values
for(int[] [] layer : nums){
  for(int [] row : layer) {
    for(int value : row) {
    System.out.print(value + " ");
  }
  System.out.println();
  }
}

System.out.println();
  }

}

