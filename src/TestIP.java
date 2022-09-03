import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * A collection of utilities relating to InetAddresses.
 */
public class TestIP {

  public static void main(String[] args){
    String addr="192.168.1.2";
    String addr1="25.512.100.abc";
     Pattern VALID_PATTERN_IPV4 = null;
     Pattern VALID_PATTERN_IPV6 = null;
     final String ipv4Pattern = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
     final String ipv6Pattern = "([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}";
      VALID_PATTERN_IPV4 = Pattern.compile(ipv4Pattern, Pattern.CASE_INSENSITIVE);
      VALID_PATTERN_IPV6 = Pattern.compile(ipv6Pattern, Pattern.CASE_INSENSITIVE);
    Matcher m1 = VALID_PATTERN_IPV4.matcher(addr);
    Matcher m2 = VALID_PATTERN_IPV6.matcher(addr);
    if (m1.matches()) {
      //System.out.println("IPV4");
//      return "IPV4";
    }

    else if(m2.matches()){
//      System.out.println("IPV6");
//    return "IPV6";
  }else{
      System.out.println("NEITHER");
//      return "NEITHER";
    }

  }

//  static {
//
//  }

//  public static boolean isIpAddress(String ipAddress) {
//
//    Matcher m1 = TestIP.VALID_PATTERN_IPV4.matcher(ipAddress);
//    if (m1.matches()) {
//      return true;
//    }
//    Matcher m2 = TestIP.VALID_PATTERN_IPV6.matcher(ipAddress);
//    return m2.matches();
//  }


}