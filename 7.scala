object Solution {
    def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] = {
        var rows: Map[Int, Int] = Map()
        for( i <- 0 to (mat.length - 1) ){
            var s = 0
            for( j <- 0 to (mat(i).length - 1) ){
                if ( mat(i)(j) == 1){
                    s = s + 1
                }
            }
            rows += (i -> s)
        }
        
        
        var d = Array.empty[Int]
        var n = 0
        while( n < k){
            d = d :+ rows(n)
            n = n + 1
        }
        d
    }
}