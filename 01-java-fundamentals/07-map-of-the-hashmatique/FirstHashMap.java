import java.util.HashMap;

public class FirstHashMap {

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Harder To Breathe", "How dare you say that my...");
        trackList.put("Shiver", "You build me up You knock me down Provoke a smile And make me frown...");
        trackList.put("She Will Be Loved",
                "Beauty queen of only eighteen She had some trouble with herself He was always there to help her She always belonged to someone else");
        trackList.put("The Sun",
                "After school walking home Fresh dirt under my fingernails And I can smell hot asphalt Cars screech to a halt to let me pass...");
        String firstSong = trackList.get("Harder To Breathe");
        System.out.println(firstSong);
        for (HashMap.Entry<String, String> trackName : trackList.entrySet()) {
            System.out.println("Track Name: " + trackName.getKey() + " - Lyrics: " + trackName.getValue());

        }

    }
}
