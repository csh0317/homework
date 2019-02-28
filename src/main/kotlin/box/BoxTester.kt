package box

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var length:Float
    var width:Float
    var height:Int
    val box3 = Box3()
    val box5 = Box5()
    while(true){
        print("Please enter object's length: ")
        length = scanner.nextFloat()
        print("Please enter object's width: ")
        width = scanner.nextFloat()
        print("Please enter object's height: ")
        height = scanner.nextInt()
        if(length == -1f || width == -1f || height == -1)
            break
        if(length > box5.length)
            println("Please enter again.")
        else if(box3.validate(length, width, height))
            println("Box3")
        else if(box5.validate(length, width, height))
            println("Box5")
        else println("Please enter again.")


    }

}

class Box3(){
    val length = 23f
    val width = 14f
    val heigth = 13
    fun validate(length:Float, width:Float, heigth:Int) :Boolean{
        if(length < this.length && width < this.width && heigth < this.heigth)
            return true
        else return false
    }


}

class Box5(){
    val length = 39.5f
    val width = 27.5f
    val heigth = 23
    fun validate(length:Float, width:Float, heigth:Int) :Boolean{
        if( length< this.length && width< this.width && heigth< this.heigth)
            return true
        else return false
    }

}