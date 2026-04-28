@Entity
@Table(name = "calculation_history")
public class Calculation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int valA;
    private int valB;
    private int result;
    // Getters and Setters...
}


