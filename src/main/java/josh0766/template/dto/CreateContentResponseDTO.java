package josh0766.template.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreateContentResponseDTO {
    @JsonProperty("result_code")
    private int resultCode;
}
