package BeanScopeByXML;


import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString


public class PrototypeByXML {
    @Value("Warje")
    private String areas;
    @Value("Near Warje Bridge")
    private String street;

}
