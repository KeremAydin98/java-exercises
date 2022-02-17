package CompositePattern;

public class Program() {
	
	public static void main(String[] args) {
		
	
	Song synthPopSong1 = new Song("Girl Like You", "Toro Y Moi" );
	Song synthPopSong2 = new Song("Outside", "TOPS");
	
	Playlist synthPopPlaylist = new Playlist("FirstOne");
	Playlist experimentalPlaylist = new Playlist("Experimental");
	Playlist studyPlayList = new Playlist("Study");

	synthPopPlaylist.add(synthPopSong1);
	synthPopPlaylist.add(synthPopSong2);
	

	Song experimentalSong1 = new Song("About you", "XXYYXX");
	Song experimentalSong2 = new Song("Motivation", "Clams Casino");	
	Song experimentalSong3 = new Song("Computer Vision", "Oneohtrix Point Never");
	experimentalPlaylist.add(experimentalSong1);
	experimentalPlaylist.add(experimentalSong2);
	experimentalPlaylist.add(experimentalSong3);
	float slowSpeed = 0.5f;
	
	experimentalPlaylist.setPlaybackSpeed(slowSpeed);
	
	// Add the "Synth Pop" playlist to the "Experimental" playlist
	experimentalPlaylist.add(synthPopPlaylist);
	
	// Add the "Experimental" playlist to the "Study" playlist
	studyPlaylist.add(experimentalPlaylist);
	
	// Create a new song and set its playback speed to 1.25x, play this song, 
	// get the name of glitchSong → "Textuell", then get the artist of this song → "Oval"
	Song glitchSong = new Song("Textuell", "Oval");
	float fasterSpeed = 1.25f;
	glitchSong.setPlaybackSpeed(fasterSpeed);
	glitchSong.play(); 
	String name = glitchSong.getName(); 
	String artist = glitchSong.getArtist(); 
	System.out.println ("The song name is " + name );
	System.out.println ("The song artist is " + artist );
	
	// Add glitchSong to the "Study" playlist
	studyPlaylist.add(glitchSong);
	
	// Play "Study" playlist.
	studyPlaylist.play(); 
	
	// Get the playlist name of studyPlaylist → "Study"
	System.out.println ("The Playlist's name is " + studyPlaylist.getName() );
	
	}
}
