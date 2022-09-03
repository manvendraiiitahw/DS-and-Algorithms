package geeksforgeeks.mustdo;

public class ValidateAnIPAddress {
    public static void main(String[] args) {
        System.out.println(ValidateAnIPAddress.isValid("172.16.254.1."));
    }
    public static boolean isValid(String s) {
        if(s.length() < 4){
            return false;
        }
        if(s.charAt(0)=='.' || s.charAt(s.length()-1)=='.'){
            return false;
        }
        String[] str=s.split("\\.");
        if(str.length != 4){
            return false;
        }
        for(String st: str){
            if(st.length()>1 && Integer.parseInt(st) < 10){
                return false;
            }
            try{
                if((Integer.parseInt(st) > 255) || (Integer.parseInt(st) < 0)){
                    return false;
                }
            }catch(NumberFormatException ex){
                return false;
            }
        }
        return true;
    }
}
