package josh0766.template.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uid")
    private int id;

    @Column(name = "subject")
    private String subject;

    @Column(name = "description")
    private String description;
}
