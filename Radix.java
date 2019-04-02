
public class Radix {
  private int index;

 public static void radixsort(int[]data){
   //to sort this, try comparing from the first digit and then slowly move up towards the last digit.
    @SuppressWarnings("unchecked")
   MyLinkedList<Integer> buckets = new MyLinkedList[20];
   int max = data[0];
   for (int i = 0; i < buckets.length; i++) {
     buckets[i] = new MyLinkedList();
   }

    for (int i = 0; i < data.length; i++) {
      if (max < data[i]) {
      max = data[i];
    }
  }

  for (int i = 0; i < index; i++){
    int number;
    if (data[i] < 10 || data[i] >= 0){
      number = data[i];

    }
  }

     if (data[i] >= 10 || data[i] < 100) {
       number = data[i] % 10;
       number.add(index - 1);
     }

     if (data[i] < 0) {
       number.add(i);

     }


   }



 }

 public static int getDigit(int i, int num) {
    while (num > Math.pow(10, i)) {
      num = num / 10;
    }
    return num % 10;
  }


public static void main(String[] args) {

}



 }
