package models;

import constants.Constraints;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.util.UUID;

/**
 * Membre : un employé sur le site de fouille, il appartient à une équipe.
 *
 * */
@Data
public class Membre {

    private UUID id;
    @Pattern(regexp = Constraints.PATTERN_ALPHABET_CHARACTERS)
    @Size(max = Constraints.NAME_MAX_SIZE, min=Constraints.NAME_MIN_SIZE)
    private String nom;
    private Boolean est_directeur;
}
