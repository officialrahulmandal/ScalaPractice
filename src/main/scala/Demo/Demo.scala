package Demo

/**
  * Created by algoscale on 10/12/18.
  */
object Demo {
  var myarray: Array[Int] = new Array[Int](4)
  val myArray2 = new Array[Boolean](5);
  val myarray3 = Array(1,2,3,4,5,6,8);

  def main(args: Array[String]): Unit = {
    myarray(0) = 20;
    myarray(1) = 50;
    myarray(2) = 10;
    myarray(3) = 30;
    println(myarray3.length);
    val result = myarray ++ myarray3;
    for (x<- result){
      println(x);
    }
    for(i<-0 to (myarray.length - 1)) {
      println(myarray(i));
    }

    }



}
