 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String sb = "";
        int product =0;
        
        for(int i =1 ; i<=5 ;i++){
            
           for(int j=1;j<=5;j++){
               product= i*j;
               sb= sb + String.format("%3d |",product);
            }
            sb =  sb + "\n";
        }
        return sb.toString();
    }

    public static String getLargeMultiplicationTable() {
        String sb = "";
        int product =0;
        
        for(int i =1 ; i<=10 ;i++){
            
           for(int j=1;j<=10;j++){
               product= i*j;
               sb= sb + String.format("%3d |",product);
            }
            sb =  sb + "\n";
        }
        return sb.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
         String sb = "";
        int product =0;
        
        for(int i =1 ; i<=tableSize ;i++){
            
           for(int j=1;j<=tableSize;j++){
               product= i*j;
               sb= sb + String.format("%3d |",product);
            }
            sb =  sb + "\n";
        }
        return sb.toString();
    }
    
    public static void main(String[] args){
        String str=null;
        TableUtilities tbu= new TableUtilities();
        str=tbu.getSmallMultiplicationTable();
        
    }

}
