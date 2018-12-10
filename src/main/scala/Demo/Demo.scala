package Demo

/**
  * Created by algoscale on 10/12/18.
  */
object Demo {

  def main(args: Array[String]): Unit = {
    val age = 100;

    age match {
      case 20 => println(age);
      case 18 => println(age);
      case 30 => println(age);
      case 40 => println(age);
      case 50 => println(age);
      case _ => println("default")
    }
    val i =7;
    i match {
      case 1|3|5|7|9 => println("odd")
      case 2|4|6|8 => println("even")
    }

  }

}
