package Demo

/**
  * Created by algoscale on 10/12/18.
  */
object Demo {

  val add = (x: Int )=> x+10;

  def add2(x: Int ) = (y: Int) => x+y;


  def main(args: Array[String]): Unit = {
    println(add(20));
    println(add2(3)(4));
    val sum40 = add2(40);
    println(sum40(100));
    }



}
