

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String result = "";
        for(int i = 0; i < numberOfStars; i++) {
          result += "*";
        }
        return result;
    }

    public static String getTriangle(int numberOfRows) {
        String result = "";
        for(int i = 1; i <= numberOfRows; i++){
          for(int j = 0; j < i; j++){
              result += "*";
          }
          result += "\n";
        }
        return result;
    }


    public static String getSmallTriangle() {
        String result = getTriangle(4);
        return result;
    }

    public static String getLargeTriangle() {
        String result = getTriangle(9);
        return result;
    }
}
