

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String results = getMultiplicationTable(5);
        return results;
    }

    public static String getLargeMultiplicationTable() {
        String results = getMultiplicationTable(10);
        return results;
    }

    public static String getMultiplicationTable(int tableSize) {
        String results = "";
        for(int i = 1; i <= tableSize; i++){
          for(int j = 1; j <= tableSize; j++){
            int pro = i*j;
            if(pro<10){
              results += String.format("%1$3d |", pro);
            }else if(pro<100){
              results += String.format("%1$3d |", pro);
            }else{
              results += String.format("%1$3d |", pro);
            }
          }
          results += "\n";
        }
        return results;
    }
}
