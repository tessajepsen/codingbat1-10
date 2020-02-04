
public class Runner {

    public static void main(String[] args) {
        System.out.println(icyHot(100, 0));
        System.out.println(seeColor("red"));
        System.out.println(squirrelPlay("60", "true"))
    }

    //icyHot
    public static boolean icyHot(int temp1, int temp2){
        if( (temp1 > 100 && temp2 < 0)||(temp2 > 100 && temp1 < 0) ){
            return true;
        }else{
            return false;
        }
    }

    //altParis
    public static String altParis(String str){
        String a = str.substring(0,1);
        String b = str.substring(4,5);
        String c = str.substring(8,9);
        String x = a + b + c;
        return x;
    }

    //seeColor
    public static String seeColor(String str){
       String red = str.substring(0,2);
       String blue = str.substring(0,3);
       if(str == blue){
           return "blue";
       }
       if(str == red){
           return "red";
       }
       return "";
    }

    //squirrelPlay
    public static boolean squirrelPlay(int temp, boolean isSummer){
        if(isSummer == true && (temp <=100 && temp >=60)){
            return true;
        }
        if(isSummer == false && (temp <=90 && temp >=60)){
            return true;
        }
        return false;
    }

    //loneTeen
    public static boolean loneTeen(int a, int b){
        boolean aTeam = (a >= 13 && a <= 19);
        boolean bTeam = (b >= 13 && b <=19);
        if(aTeam != bTeam){
            return true;
        }
        return false;
    }

    //makeBricks
    public static int makeBricks(int a, int b, int c){

    }

    //catDog
    public static boolean catDog(String str){

    }

    //mirrorEnds
    public static String mirrorEnds(String string){

    }

    //isEverywhere
    public static boolean isEverywehre(int[] nums, int val){

    }

    //linearIn
    public static boolean linearIn(int[] outer, int[] inner){

    }
}






