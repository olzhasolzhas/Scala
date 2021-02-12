object Solution {
    def kidsWithCandies(candies: Array[Int], extraCandies: Int): Array[Boolean] = {
        
        def find_max(arr: Array[Int]): Int = {
          var max = 0;
          for( i <- arr){
            if(i > max){
              max = i;
            }
          }
          max
        }
        
        
        val max = find_max(candies);
        var some = Array(4,5,6);

        var ans = Array.empty[Boolean]
        for( i <- candies){
          if( i + extraCandies < max){
            ans = ans :+ false;
          }else{
            ans = ans :+ true;
          }
        }
        ans
    }
}