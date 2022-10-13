

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int[] holder = new int[arr.length]; // needed a holder
    for(int i = 0; i < arr.length; i += 1) {
      holder[i] = arr[(arr.length - i) - 1]; // holder for the reversed
    }
    for(int x = 0; x < arr.length; x++){ // replace the arr[] with holder[]
      arr[x] = holder[x]; // updates arr[]
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1]; // bug: need to switch arr and newArray
    }
    return newArray; // bug: need to return newArray
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr == null || arr.length < 2) { 
      return 0; 
    }
    else{
      double lowest = arr[0];
      double sum = 0;      

      for(double num: arr) {
        if(num < lowest) { 
          lowest = num; 
        }
      }

      for(double num: arr) {
        if(num != lowest) { 
          sum += num; 
        }
      }
      return sum / (arr.length - 1);      
    }
    
  }

}

