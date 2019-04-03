
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
    im gay   MyLinkedList<Integer> buckets = new MyLinkedList[20];
   int max = data[0];

   for (int i = 0; i < buckets.length; i++) {
     buckets[i] = new MyLinkedList<Integer>();
   }

   int max = maxDigit(data);

    for (int i = 0; i < buckets.length; i++) {
      int digits = 0;

      if (max < data[i]) {
      max = data[i];
    }

    if (data[i] < 0){
      buckets.add(digits, data[i]);
    }

    if (data[i] > 0 && data < 10){
      buckets.add(digits, data[i]);
    }

    if (data[i] >= 10 || data[i] < 100) {
      int temp = getDigit(i, data[i]);
      if (temp % 10 > data[i] % 10){

      }

      buckets.add(digit + 10);
    }

    if (digits < 10) {
      digits++;
    }
    /*
    for (int i = 0; i < times; i++) {
     for (int j = 0; j < data.length; j++) {
       int digit = Math.abs(data[j] % mod);
       if (data[j] < 0) {
         buckets[9-digit].addFront(digit);
       } else {
         buckets[digit+10].add(digit);
       }
     }
   }

    */

  }

  //make a data[] and then transfer that to buckets.
  //Then afer that is done, transfer THAT to another big LinkedList.
  //Next digit from Linkedlist goes to buckets and it also goes to data[] when it is done.

  MyLinkedList<Integer> result = new MyLinkedList[];

  for (int i = 0; i < data.length; i++){
    result[i] = new MyLinkedList();
  }
    result.extend(buckets);
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


}



 }
