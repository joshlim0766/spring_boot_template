package josh0766.template.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ContentDTO {
    @JsonProperty("id")
    private int id;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("description")
    private String description;
}
