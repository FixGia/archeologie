package models;

import models.enums.CompletudeType;
import models.enums.ConservationType;
import lombok.Data;
import lombok.NonNull;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Artefact : un artefact est un objet ancien trouvé sur un site de fouille
 */
@Data
public class Artefact {


    private UUID id;

    @NonNull
    private Fouille fouille;

    @NonNull
    private Date date;

    @NonNull
    private List<CategorieArtefact> categories;

    @NonNull
    private CompletudeType completudeType;

    @NonNull
    private ConservationType conservationType;


}
