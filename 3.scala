object Solution {
  def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {
    var arr = Array.empty[Int]
    for( i<- nums){
      var c = 0
      for( j <- nums ){
        if(j!=i){
          if(j<i){
            c=c+1
          }
        }
      }
      arr = arr:+ c
    }
    arr
  }
}