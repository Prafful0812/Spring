package SpringLifeCycleMethodsByUsingAnnotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Nature {
    private String name;

    @PostConstruct
    public void Start(){
        System.out.println("This is Starting Method");

    }
    @PreDestroy
    public void End(){
        System.out.println("This is Ending Method");
    }

}
