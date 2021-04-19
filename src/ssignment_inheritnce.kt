import kotlin.math.max

fun main() {
    var car=Car("Subaru","Legacy","white",30)
    car.carry(40)
    car.identity()
     println(car.calculateParkingFees(3))
    var bus=Bus("Suburu","Legacy","White",30)
      println(bus.maxTripeFare(20.34352524))
    println(bus.calculateParkingFees(5))
}

open class Car(var make:String, var model:String,var color: String,var capacity:Int){
    fun carry(people:Int){
        var x=people-capacity
        if(people<=capacity) {
            println("carry $people passengers")
        }
        else{
            println("over capacity by $x people")
        }
    }
 fun identity(){
     println("I am a $color $make $model")
 }
    open fun calculateParkingFees(hours:Int):Int{
        return hours*20
    }
}
class Bus(make: String,  model:String,color: String,capacity:Int):Car(model,make,color,capacity){
    override fun calculateParkingFees(hours: Int): Int {
        return hours*capacity

    }
    fun  maxTripeFare(Fare:Double):Double{
        var max=40
        return max(23.454357754,45.45345556654)
    }
}
