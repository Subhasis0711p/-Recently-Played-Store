package create_an_in_memory_store_for_recently_played_songs;


	import org.junit.jupiter.api.Test;
	import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

	class RecentlyPlayedStoreTest {
	    @Test
	    void testPlayAndGetSongs() {
	        RecentlyPlayedStore store = new RecentlyPlayedStore(3);
	        store.playSong("user1", "S1");
	        store.playSong("user1", "S2");
	        store.playSong("user1", "S3");
	        assertEquals(List.of("S3", "S2", "S1"), store.getRecentlyPlayed("user1"));

	        store.playSong("user1", "S4");
	        assertEquals(List.of("S4", "S3", "S2"), store.getRecentlyPlayed("user1"));

	        store.playSong("user1", "S2");
	        assertEquals(List.of("S2", "S4", "S3"), store.getRecentlyPlayed("user1"));

	        store.playSong("user1", "S1");
	        assertEquals(List.of("S1", "S2", "S4"), store.getRecentlyPlayed("user1"));
	    }

	    @Test
	    void testDifferentUsers() {
	        RecentlyPlayedStore store = new RecentlyPlayedStore(3);
	        store.playSong("user1", "S1");
	        store.playSong("user2", "S1");
	        store.playSong("user1", "S2");
	        store.playSong("user2", "S2");
	        assertEquals(List.of("S2", "S1"), store.getRecentlyPlayed("user1"));
	        assertEquals(List.of("S2", "S1"), store.getRecentlyPlayed("user2"));
	    }
	}


