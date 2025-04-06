package StandaloneCollections;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Getter
@Setter
@ToString
public class Sports {
    private List<String> sports;
    private Map<Integer,String> location;
    private Properties props;

}
