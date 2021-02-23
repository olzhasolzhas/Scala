object Solution {
    def maxProduct(nums: Array[Int]): Int = {
        var arr = Array.empty[Int]
        for( i <- nums){
            for( j <- nums){
                if(i!=j){
                    var mul = (i-1)*(j-1)
                    arr = arr:+ mul
                }
            }
        }
        arr.max
    }
}