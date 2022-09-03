import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestApp {

  public static void main(String[] args) throws IOException {

    byte[] jsonData =
        Files.readAllBytes(Paths.get("src/device1.json"));
        ObjectMapper objectMapper=new ObjectMapper();

        DceCensorArray[] dceCensorArrays=objectMapper.readValue(jsonData, DceCensorArray[].class);
        System.out.println(dceCensorArrays[0]);


  }
}
