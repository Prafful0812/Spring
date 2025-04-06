package BeanScopeByAnnotation;


import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Component
public class Prototype {
    @Value("NandedCity")
    private String areas;
    @Value("Maharashtra")
    private String street;

}
