import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.io.Serializable;

@JsonIgnoreProperties(
    ignoreUnknown = true
)
@JsonRootName("dataArray")
public class dataArray implements Serializable{
  private String deviceSubType;
  private String sensorId;
  private String sensorName;


  public String getDeviceSubType() {
    return deviceSubType;
  }

  public void setDeviceSubType(String deviceSubType) {
    this.deviceSubType = deviceSubType;
  }

  public String getSensorId() {
    return sensorId;
  }

  public void setSensorId(String sensorId) {
    this.sensorId = sensorId;
  }

  public String getSensorName() {
    return sensorName;
  }

  public void setSensorName(String sensorName) {
    this.sensorName = sensorName;
  }
}
