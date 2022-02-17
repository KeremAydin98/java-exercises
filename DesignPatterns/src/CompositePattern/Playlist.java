package CompositePattern;
import java.util.ArrayList; 

public class Playlist implements IComponent {

	public String playlistName;
	ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}
	
	public void add(Song song) {
		
		this.playlist.add(song);
		
	}
	public void remove(Song song) {
		
		this.playlist.remove(song);
	}
	
	
	public String getName() {
		
		for(IComponent song:this.playlist) {
			
			song.play();
			
		}
		
	}
	
	public void SetPlayBackSpeed(float newspeed) {
		
		for(IComponent song:this.playlist) {
			
				song.SetPlayBackSpeed(newspeed);
			
			}
	}
	
	public void play() {
		
		for(IComponent song:this.playlist) {
			
			System.out.println("Playing the song " + song);
			
		}
		
	}


}
