package ExtraAssignment1;

public class ISAnyTrue {
    public static void main(String[] args){
    boolean res= isAnyTrue("false","false","false","false");
    boolean res_false = allAreFalse("false","false","false","false");
    System.out.println("It is "+ res);
    System.out.println("It is "+ res_false);
    }
    public static boolean isAnyTrue(String a,String b,String c,String d){
        if(a.equals("true") || b.equals("true") || c.equals("true") || d.equals("true")) {
            return true;
        }else{
            return false;
        }
    }
    public static boolean allAreFalse(String a,String b,String c,String d){
        if(a.equals("false") && b.equals("false") && c.equals("false") && d.equals("false")) {
            return true;
        }else{
            return false;
        }
    }
}
