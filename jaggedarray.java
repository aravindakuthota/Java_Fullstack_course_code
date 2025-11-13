
// jagged arrays are defined as which have same type of arrays but different length.


public class jaggedarray {
    public static void main(String[] args) {
        
    
    int nums[][]  = new int[3][];

    nums[0] = new int [3];
    nums[1] = new int[4];
    nums[2]  = new int[5]; 


    for(int n[] : nums) {
        for(int m : n)
        {
            System.out.print(m + " ");
        }
        System.out.println();
    }
}
}

