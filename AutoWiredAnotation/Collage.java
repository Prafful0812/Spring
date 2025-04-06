package AutoWiredAnotation;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Collage {
    @Autowired
    @Qualifier("students1")
    private Students students;

}
