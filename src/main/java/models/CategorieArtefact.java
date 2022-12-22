package models;

import constants.Constraints;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import java.util.UUID;

/**
 * ArtefactCategory : Cette classe gère la catégorisation des artefacts trouvés sur site
 */
@Data
public class CategorieArtefact {

    private UUID id;

    @Pattern(regexp = Constraints.PATTERN_ALPHANUMERIC)
    private String nom;
    @Pattern(regexp = Constraints.PATTERN_ALPHABET_CHARACTERS)
    @Length(max = Constraints.DESCRIPTION_SIZE)
    private String description;

}
