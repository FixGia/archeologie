package models;

import constants.Constraints;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.UUID;


/**
 * Site : un site géographique partagé en parcelles disjointes et qui porte le nom de la ville la plus proche
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Site {

    private UUID Id;
    @Pattern(regexp = Constraints.PATTERN_NAME_PARCELLE)
    private String nom;
    private List<Parcelle> parcelles;

}
