package create_an_in_memory_store_for_recently_played_songs;


	import java.util.*;

	public class RecentlyPlayedStore {
	    private int capacity;
	    private Map<String, LinkedList<String>> store;

	    public RecentlyPlayedStore(int capacity) {
	        this.capacity = capacity;
	        this.store = new HashMap<>();
	    }

	    public void playSong(String user, String song) {
	        if (!store.containsKey(user)) {
	            store.put(user, new LinkedList<>());
	        }
	        
	        LinkedList<String> songs = store.get(user);
	        songs.remove(song);
	        songs.addFirst(song);

	        if (songs.size() > capacity) {
	            songs.removeLast();
	        }
	    }

	    public List<String> getRecentlyPlayed(String user) {
	        return store.getOrDefault(user, new LinkedList<>());
	    }

	    public static void main(String[] args) {
	        RecentlyPlayedStore store = new RecentlyPlayedStore(3);
	        store.playSong("user1", "S1");
	        store.playSong("user1", "S2");
	        store.playSong("user1", "S3");
	        System.out.println(store.getRecentlyPlayed("user1")); // Output: [S3, S2, S1]

	        store.playSong("user1", "S4");
	        System.out.println(store.getRecentlyPlayed("user1")); // Output: [S4, S3, S2]

	        store.playSong("user1", "S2");
	        System.out.println(store.getRecentlyPlayed("user1")); // Output: [S2, S4, S3]

	        store.playSong("user1", "S1");
	        System.out.println(store.getRecentlyPlayed("user1")); // Output: [S1, S2, S4]
	    }
	}


