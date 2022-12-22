package models;

import constants.Constraints;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.validator.constraints.Length;
import java.util.UUID;

/**
 * Parcelle : Elle divise un site de fouille en plusieurs parties et est caractérisée par un numéro, une longueur et une largeur
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parcelle {

    private UUID id;
    @Size(max = Constraints.PARCELLE_NAME_MAX_SIZE)
    @Pattern(regexp = Constraints.PATTERN_NAME_PARCELLE)
    private String nom;

    @NonNull
    @Pattern(regexp = Constraints.PATTERN_NUMBER)
    private Integer longueur;

    @NonNull
    @Pattern(regexp = Constraints.PATTERN_NUMBER)
    private Integer largeur;

    @NonNull
    private Site site;

}
