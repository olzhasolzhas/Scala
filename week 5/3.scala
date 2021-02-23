object Solution {
    def dayOfTheWeek(day: Int, month: Int, year: Int): String = {
        var YC = (year%100 + (year%100)/4)%7
        
        var monthes: Map[Int,Int] = Map(1 -> 0,2 -> 3,3 -> 3,4 -> 6,5 -> 1,6 -> 4,7 -> 6,8 -> 2,9 -> 5,10 -> 0,11 -> 3,12 -> 5)
        var MC = monthes(month)
        
        var CenC = 0
        if(year/100 == 19){
          CenC = 0
        }
        if(year/100 == 20){
          CenC = 6
        }
        if(year/100 == 21){
          CenC = 4
        }
        
        
        var LYC = 0
        if ( (year%4==0 && year%100!=0) || year%400==0){
          LYC = 1
        }else{
          LYC = 0
        }
        
        
        var ans = (YC+MC+CenC+day-LYC)%7
        
        var days: Map[Int,String]  = Map(1 -> "Monday",2 -> "Tuesday",3 -> "Wednesday",4 -> "Thursday",5 -> "Friday",6 -> "Saturday",0 -> "Sunday")
        days(ans)
    }
}