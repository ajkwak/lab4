package edu.mills.cs180a.classlist;

/**
 * Information about a person (student or teacher) in CS 180A: Mobile Application Development.
 *
 * @author ellen.spertus@gmail.com (Ellen Spertus)
 * @author ajkwak@users.noreply.github.com (AJ Parmidge)
 */
public class Person {
    final static Person[] everyone = {
        new Person("AJ", "Parmidge", "aparmidge@mills.edu", R.drawable.aj),
        new Person("Caroline", "Taymor", "ctaymor@gmail.com", R.drawable.caroline),
        new Person("Ching", "Yu", "cyu@mills.edu", R.drawable.ching),
        new Person("Christie", "Yeh", "cyeh@mills.edu", R.drawable.christie),
        new Person("Colin", "Lockard", "clockard@mills.edu", R.drawable.colin),
        new Person("Ellen", "Spertus", "ellen.spertus@gmail.com", R.drawable.ellen),
        new Person("Fiona", "Robinson", "frobinson@mills.edu", R.drawable.fiona),
        new Person("Michele", "Collender", "mcollender@mills.edu", R.drawable.michele),
        new Person("Renee", "Johnston", "renee.johnston1149@gmail.com", R.drawable.renee),
        new Person("Robert", "Andrews", "roandrews@mills.edu", R.drawable.robert),
        new Person("Taurin", "Barrera", "taurin.barrera@mills.edu", R.drawable.taurin),
        new Person("Trevor", "Adams", "trevorbadams@gmail.com", R.drawable.trevor)
    };
    private String mFirstName;
    private String mLastName;
    private String mEmail;
    private int mImgId;

    /**
     * Constructs a new {@code Person}.
     *
     * @param first the first name
     * @param last the last name
     * @param email the email address
     */
    public Person(String first, String last, String email, int imgId) {
        mFirstName = first;
        mLastName = last;
        mEmail = email;
        mImgId = imgId;
    }

    /**
     * Gets the first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return mFirstName;
    }

    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return mLastName;
    }

    /**
     * Gets the email address.
     *
     * @return the email address
     */
    public String getEmail() {
        return mEmail;
    }

    /**
     * Gets the ID of the associated image.
     *
     * @return the image id
     */
    public int getImageId() {
        return mImgId;
    }

    @Override
    public String toString() {
        return mFirstName + ' ' + mLastName;
    }
}
