package josh0766.template.service;

import josh0766.template.dto.ContentDTO;
import josh0766.template.dto.CreateContentRequestDTO;
import josh0766.template.dto.CreateContentResponseDTO;
import josh0766.template.entity.Content;
import josh0766.template.repository.ContentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class ContentService {
    @Autowired
    private ContentRepository contentRepository;

    @Transactional
    public CreateContentResponseDTO createContent (CreateContentRequestDTO request) {
        Content content = new Content();

        content.setSubject(request.getSubject());
        content.setDescription(request.getDescription());

        contentRepository.saveAndFlush(content);

        CreateContentResponseDTO response = new CreateContentResponseDTO();

        response.setResultCode(200);

        return response;
    }

    @Transactional(readOnly = true)
    public Page<ContentDTO> getContents (Pageable pageable) {
        return contentRepository.findAll(pageable).map(content -> {
            ContentDTO dto = new ContentDTO();
            dto.setId(content.getId());
            dto.setDescription(content.getDescription());
            dto.setSubject(content.getSubject());

            return dto;
        });
    }
}
