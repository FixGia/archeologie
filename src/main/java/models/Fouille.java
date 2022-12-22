package models;

import lombok.Data;
import lombok.NonNull;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Fouille : acte de répertorier les artefacts trouvés sur les sites de fouilles
 */
@Data
public class Fouille {

    private UUID id;
    private @NonNull Date date;
    private Equipe equipe;
    private @NonNull Parcelle parcelle;
    private List<Artefact> artefact;
}
