 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String s = "";
        for(int i=1; i<=numberOfStars ;i++){
            s=s+"*";
        }
        return s;
    }
    
    public static String getTriangle(int numberOfRows) {
        String s = "";
        for(int i=1; i<=numberOfRows ;i++){
            for(int j=1;j<=i;j++){
            s=s+"*";
            }
            s=s+"\n";
        }
        return s;
    }


    public static String getSmallTriangle() {
        String s = "";
        for(int i=1; i<=4 ;i++){
            for(int j=1;j<=i;j++){
            s=s+"*";
            }
            s=s+"\n";
        }
        return s;
    }

    public static String getLargeTriangle() {
        String s = "";
        for(int i=1; i<=9 ;i++){
            for(int j=1;j<=i;j++){
            s=s+"*";
            }
            s=s+"\n";
        }
        return s;
    }
}
