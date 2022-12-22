package models;

import constants.Constraints;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import java.util.List;
import java.util.UUID;

/**
 * Equipe : Une équipe est composé de membres et obligatoirement d'un directeur
 */
@Data
public class Equipe {

    private UUID id;

    @Length(max = Constraints.NAME_MAX_SIZE)
    @Pattern(regexp = Constraints.PATTERN_ALPHABET_CHARACTERS)
    private String nom;

    @NotEmpty
    private List<Membre> membreList;

}
