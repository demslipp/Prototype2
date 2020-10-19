package App.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(of = "id")
@Builder
@Entity(name = "day")
@NoArgsConstructor
@AllArgsConstructor
public class Day {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 1000)
    private String subjectName;
    @Column(nullable = false)
    private Integer listeners;
    @Column(nullable = false)
    private LocalDateTime date;

}
