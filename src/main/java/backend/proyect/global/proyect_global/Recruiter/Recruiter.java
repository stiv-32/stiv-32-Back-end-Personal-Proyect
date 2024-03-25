package backend.proyect.global.proyect_global.Recruiter;

import backend.proyect.global.proyect_global.Player.Player;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recruiter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRecruiter;
    
    private String name;
    private String country;
    private String city;
    private String phoneNumber;
    private String email;

    @OneToOne
    private Player player;

}
