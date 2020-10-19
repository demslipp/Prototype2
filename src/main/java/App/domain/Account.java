package App.domain;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(of = "id")
@Builder
@Entity(name = "account")
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 11)
    private String phoneNumber;
    @Column(nullable = false, length = 25)
    private String firstName;
    @Column(nullable = false, length = 25)
    private String lastName;
    @Column(nullable = false, length = 11)
    private String groupId;

}
