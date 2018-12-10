package Demo

/**
  * Created by algoscale on 10/12/18.
  */
object Demo {

  def main(args: Array[String]): Unit = {
    object Math{
      def sub(x: Int, y: Int): Int = {
        return x-y;
      }
    }
    def add(x: Int, y: Int): Int = {
      return x+y;
    }

    println(add(2,4))
    println(Math.sub(3,2))

  }

}
