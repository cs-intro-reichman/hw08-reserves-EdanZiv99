/** Represents a music track. A track has a title (String), an artist (String), 
 *  and a duration (int), in seconds. */
class Track {
   
    public static void main (String args[]) {
        System.out.println(formattedDuration(135));
        Track imagine = new Track("imagine", "John Lenon", 187);
        System.out.println(imagine.toString());
    }
   
    private String title;
    private String artist;
    private int duration;
    public String getTitle;

    /** Constructs a track from the given values. */
    public Track(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    /** Returns this track's data as "artist, title, minutes:seconds".
     *  For example, "John Lennon, Imagine, 3:07" */
    public String toString() {
        return artist + ", " + title + ", " + formattedDuration(duration);
    }

    /** Returns this track's title. */
    public String getTitle() {
        return title;
    }
    /** Returns this track's artist. */
    public String getArtist() {
        return artist;
    }
    /** Returns this track's duration. */
    public int getDuration() {
        return duration;
    }

    /** If this track's duration is shorter than the other track's duration
     *  returns true; otherwise returns false. */
    public boolean isShorterThan(Track other) {
        return duration < other.duration;
    }

    // Returns a string that represents the totalSeconds as "minutes:seconds",
    // Where seconds is always two digits. For example, "3:17" or "12:05".
    private static String formattedDuration(int totalSeconds) {
        int minutes = totalSeconds / 60; 
        int seconds = totalSeconds % 60;

        if (seconds < 10) {
            String strSeconds = "0" + seconds;
            return minutes + ":" + strSeconds;
        }

        return minutes + ":" + seconds;
    }

}