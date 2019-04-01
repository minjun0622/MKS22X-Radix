public class Radix {
  private int index;

 public static void radixsort(int[]data){
   //to sort this, try comparing from the first digit and then slowly move up towards the last digit.
   index = data.length;
   Node<int> temp;

   for (int i = 0; i < index; i++){
     int number;
     //number = digit(data[i]);
     if (data[i] < 10 || data[i] >= 0){
       number = data[i];
       number.add(index - i);
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

 public int getValue() {

 }

 public int getDigit(int n){


 }







 }
