package josh0766.template.controller;

import josh0766.template.dto.ContentDTO;
import josh0766.template.dto.CreateContentRequestDTO;
import josh0766.template.dto.CreateContentResponseDTO;
import josh0766.template.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/content")
public class ContentController {
    @Autowired
    private ContentService contentService;

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE},
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}
    )
    public CreateContentResponseDTO createContent (@RequestBody CreateContentRequestDTO request) {
        return null;
    }

    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}
    )
    public Page<ContentDTO> getContents (Pageable pageable) {
        return contentService.getContents(pageable);
    }
}
