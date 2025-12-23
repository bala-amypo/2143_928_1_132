@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    @Column(unique = true)
    private String email;

    private String password;

    private String role = "MONITOR";

    private LocalDateTime createdAt = LocalDateTime.now();
    // getters & setters
}
