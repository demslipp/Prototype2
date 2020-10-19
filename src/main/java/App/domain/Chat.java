package App.domain;


import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(of = "id")
@Builder
@Entity(name = "chat")
@NoArgsConstructor
@AllArgsConstructor
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;
    @Column(length = 500)
    private String chat;
    @Column
    private int likes;
}
