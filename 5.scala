object Solution {
    def decompressRLElist(nums: Array[Int]): Array[Int] = {
        var arr = Array.empty[Int]
        
        for( i <- 0 to nums.length/2-1){
            var a = Array.empty[Int]
            var freq = nums(2*i)
            var value = nums(2*i+1)
            for( i <- 1 to freq){
                a = a :+ value
            }
            arr = arr ++ a
        }
        arr
    }
}