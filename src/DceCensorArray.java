import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(
    ignoreUnknown = true
)
public class DceCensorArray implements Serializable {

  private String deviceType;
  private List<dataArray> dataArrays;

  @JsonCreator
  public DceCensorArray(@JsonProperty("dataArray") final List<dataArray> dataArrays) {
    this.dataArrays = dataArrays;
  }

  @JsonProperty("dataArray")
  public List<dataArray> getDataArray() {
    return dataArrays;
  }

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public List<dataArray> getDataArrays() {
    return dataArrays;
  }

  public void setDataArrays(List<dataArray> dataArrays) {
    this.dataArrays = dataArrays;
  }
}
