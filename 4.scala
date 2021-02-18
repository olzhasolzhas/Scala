object Solution {
    def repeatedNTimes(A: Array[Int]): Int = {
        var ans = 0
        val freq: Map[Int, Int] = Map()
        var arr = Array.empty[Int]
        var N = A.length/2
        var B = A.distinct
        for( i<- B){
            freq += (i -> 0)
            var count = 0
            for (j <- A){
                if (i == j){
                    count=count+1
                }
            }
            freq += (i -> count)
        }
        
        for ((k,v) <- freq){
            if (v==N){
                ans = k
            }
        }
        ans
    }
    repeatedNTimes(Array(1,2,3,3))
}