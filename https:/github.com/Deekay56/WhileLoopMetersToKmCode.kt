fun main() {
    val meters = listOf(500, 5550, 350, 200, 660)
   
    var index = 0
    
    while(index!= meters.size){
        var kilometers = meters[index].toDouble()/1000
        
        println("${meters[index]} m is equal to $kilometers km.")
        index++
    }
}
