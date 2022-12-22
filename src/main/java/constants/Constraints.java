package constants;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Constraints {

    /**
     * Constraint PARCELLE_NAME_MAX_SIZE Max Size
     */
    public static final int PARCELLE_NAME_MAX_SIZE = 5;

    /**
     * Constant de taille de Description DESCRIPTION_SIZE
     */
    public static final int DESCRIPTION_SIZE= 500;

    /** The Constant PATTERN_ALPHANUMERIC.
     *
     */
    public static final String PATTERN_ALPHANUMERIC = "[-A-Za-z0-9\\s]";

    /** The Constant PATTERN_ALPHABET_CHARACTERS.
     *
     */
    public static final String PATTERN_ALPHABET_CHARACTERS = "[-A-Za-z+é+è+à+ç]";

    /** The Constant PATTERN_ONLY_NUMBER.
     *
     */
    public static final String PATTERN_NUMBER ="([0-9])";

    /**
     * Constraint LastNAme Max Size
     *
     * */
    public static final int NAME_MAX_SIZE = 50;

    /**
     * Constant Min Name Size
     */
    public static final int NAME_MIN_SIZE = 2;

    /**
     * Constant Lettre+Chiffre
     */
    public static final String PATTERN_NAME_PARCELLE = "$[A-Za-z]+[0-9]{0,2}";
}