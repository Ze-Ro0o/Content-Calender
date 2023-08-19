package zero.contentcalender;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import zero.contentcalender.model.Content;
import zero.contentcalender.model.Status;
import zero.contentcalender.model.Type;
import zero.contentcalender.repository.ContentRepository;

import java.time.LocalDateTime;

@SpringBootApplication
public class ContentCalenderApplication {

    public static void main(String[] args) {


            SpringApplication.run(ContentCalenderApplication.class, args);

    }
        @Bean
    CommandLineRunner commandLineRunner(ContentRepository repository){
        return args-> {
            Content content = new Content(null,
                    "zero GPT",
                    "xdd",
                    Status.COMPLETED,
                    Type.VIDEO,
                    LocalDateTime.now(),
                    null,
                    "");
            repository.save(content);

        };

}
}
