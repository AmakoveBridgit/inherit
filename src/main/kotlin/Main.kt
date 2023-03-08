import java.awt.image.ColorModel

fun main() {
var vehicle=Car("Prado","legacy","white",35)
   var trans=Bus("modern","leaf","blue",55)
    trans.maxTripFare(60.0)
    vehicle.carry(40)
    vehicle.identity()
vehicle.calculateParkingFees(3)
    println(trans.calculateParkingFee(4))


}
//question1
open class Car( var make:String, var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("carrying $people passengers")
        } else {
            println("Overcapacity by $x people ")
        }
    }

    fun identity() {
        println("I am $color $make $model")
    }

    fun calculateParkingFees(hours: Int): Int {
        var parkingFees = hours * 20
        return parkingFees
    }
}
//question2
 class Bus( make: String, model: String, colour: String, capacity: Int):Car(make,model,colour,capacity) {
    fun maxTripFare(fare: Double): Double {
        var maxfare = fare * capacity
        return maxfare

    }
   fun calculateParkingFee(hours: Int):Int{
      val parkingFee=hours * capacity
      return parkingFee
   }
 }





