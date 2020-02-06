


public class NumberUtilities {

    public static String getRange(int stop) {
        return getRange(0, stop);
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for(;start < stop; start++){
          range += start;
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
      String range = "";
      for(;start < stop; start++){
        if(start % step == 0){
          range += start;
        }
      }
      return range;
    }

    public static String getEvenNumbers(int start, int stop) {
        return getRange(start, stop, 2);
    }


    public static String getOddNumbers(int start, int stop) {
      String range = "";
      for(;start < stop; start++){
        if(start % 2 != 0){
          range += start;
        }
      }
      return range;
    }

    public static String getExponentiations(int start, int stop, int exponent) {
        String range = "";
        for(;start <= stop; start++){
          long a = 1;
          for(int i = 0; i < exponent; i++){
            a *= start;
          }
          range += a;
        }

        return range;
    }
}
