public class Radix {
  private int length;
  /*
  List of methods available from MyLinkedList
  add
  toString
  get
  set
  contains
  indexOf
  add
  removeFront
  remove
  remove
  extend
  */

//hahahah
 public static void radixsort(int[]data){
   //to sort this, try comparing from the first digit and then slowly move up towards the last digit.
    @SuppressWarnings("unchecked")
    MyLinkedList<Integer> newdata = new MyLinkedList<Integer>();
     MyLinkedList<Integer>[] buckets = new MyLinkedList[20];\

     int number = 0;
     boolean neg;

   for (int i = 0; i < data.length; i++) {
     if (Math.abs(data[i]) > number) {
       number = Math.abs(data[i]);
     }
   }

   int max = String.valueOf(number).length;

    for (int i = 0; i < 20; i++) {
      buckets[i] = new MyLinkedList<Integer>();
    }
    for (int i = 0; i < data.length; i++){
      int digit = data[i] % 10;
      if (data[i] < 0){
        buckets[9 - Math.abs(digit)].add(data[i]);
      }
      else {
        buckets[10 + digit].add(data[i]);
      }
    }

    for (int i = 0; i < 20; i++){
      if (buckets[i].size() > 0) {
        //conjoin the linkedlists together.
        newdata.extend(buckets[i]);
      }
    }
    for (int count = 2; count <= max; place++){
      while (newdata.size() > 0) {
        int item = newdata.remove(0);
        int digit = (item / (int)Math.pow(10, place - 1)) % 10;
        if (item < 0) {
          buckets[9 - Math.abs(digit)].add(item);
        }
        else {
          buckets[10 + digit].add(item);
        }
      }
      for (int i = 0; i <  20; i++){
        if (buckets.size() > 0) {
          newdata.extend(buckets[i]);
        }
      }
    }


//a helper that finds the max digit inside a number.
 public static int maxDigit(int[] data) {
   int max = data[0];
   for (int i = 0; i < data.length; i++){
     if (data[i] > max) {
       max = data[i];
     }
   }
   return max;
  }


public static void main(String[] args) {
  System.out.println();


}



}
