package BeanScopeByXML;


import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString


public class SingletonByXML {
    @Value("Pune")
    private String cities;
    @Value("Maharashtra")
    private String State;

}
