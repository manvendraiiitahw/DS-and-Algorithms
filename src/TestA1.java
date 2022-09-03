import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestA1 {

  public static void main(String[] args) {

//    String str ="{\n" +
//        "    \"id\":1,\n" +
//        "    \"name\":\"manu\"\n" +
//        "  }";
//        ObjectMapper objectMapper = new ObjectMapper();
//    try {
//      AbcDao abcDao = objectMapper.readValue(str, AbcDao.class);
//      System.out.println(abcDao.getId());
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

    String json = "{\r\n\"name\" : \"abc\" ,\r\n\"email id \" : [\"abc@gmail.com\",\"def@gmail.com\",\"ghi@gmail.com\"]\r\n}";
    ObjectMapper mapper = new ObjectMapper();
    Map<String, Object> map = new HashMap<>();
// convert JSON string to Map
    try {
      map = mapper.readValue(json, new TypeReference<Map<String, Object>>() {});
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(map);
  }

}
