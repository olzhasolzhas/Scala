object Solution {
    def average(salary: Array[Int]): Double = {
        val salary1 = collection.mutable.ArrayBuffer(salary: _*)
        var maxx = salary1.max
        var minn = salary1.min
        salary1 -= (maxx, minn)
        var sum = 0
        for( i<- salary1){sum+=i}
        sum/(salary1.length)
    }
}