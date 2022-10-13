import java.math.BigDecimal

val fN : String="123";
 var lN = "321";
fun main() {
    lN="lkj"
    val temperature =26
//    var condition =  if (temperature < -5) "cold"
//        else if (temperature < 5 && temperature>0) "окoло 0"     else "heat"

    var condition = when {
        temperature < -5 -> "cold"
        temperature < 5 && temperature>0 -> "окoло 0"
        else -> "heat"
    }

var j:String?=";klj"
println(j?.length ?: 0)
    val obj :Any="15"
val words = 'a'..'z'
    for(w in words){
        println(w)
    }


}
fun japaneseSalary(base : BigDecimal, years : Int):BigDecimal{
    require(base.toInt()>0, { "Base can't be negative" })
    return base + (years*10000).toBigDecimal()+1
}

