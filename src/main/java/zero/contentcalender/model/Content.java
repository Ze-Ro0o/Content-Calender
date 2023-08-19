package zero.contentcalender.model;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

public record Content(
        @Id
        Integer id,
        @NotBlank
        String title,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url) {
}
