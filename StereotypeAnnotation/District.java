package StereotypeAnnotation;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Component
public class District {
    @Value("Shegaon")
    private String city;
    @Value("Buldhana")
    private String district;

    @Value("#{temp}")
    private List<String> address;


}
