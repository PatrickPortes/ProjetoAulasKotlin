package experience.controlflow

fun main() {

    //Better Way
    fun max(a: Int, b: Int) = if (a > b) a else b         // 1

    //Old Expression
    fun maxOld(a: Int, b: Int): Int {
        if(a > b) {
            return a
        }else{
            return b
        }
    }

    println(max(99, -42))
    println(maxOld(99, -42))

}