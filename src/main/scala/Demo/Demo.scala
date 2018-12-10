package Demo

/**
  * Created by algoscale on 10/12/18.
  */
object Demo {

  def main(args: Array[String]): Unit = {

    for (i<- 1 to 5){
      println("i using to" + i)
    }
    for (i<- 1 until 5){
      println("i using to" + i)
    }
    for (i<- 1 to 5; j<- 1 to 3){
      println("i using to" + i + "value of j is " + j)
    }
    val lst = List(1,2,3,4,5,6,7);
    for (i <- lst; if i<6){
      println("elements of list is :- "+i)
    }
    val result = for {i <- lst; if i<6} yield {
      i*i
    }

    println("result = "+ result)
  }

}
