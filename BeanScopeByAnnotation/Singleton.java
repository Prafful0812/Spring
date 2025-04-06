package BeanScopeByAnnotation;


import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Component
public class Singleton {
    @Value("Pune")
    private String cities;
    @Value("MAharashtra")
    private String State;

}
