package frostHealth;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class PlayerListener implements Listener {
	private FrostHealth frostHealth;
	
			
	PlayerListener(FrostHealth inFrostHealth) {
		frostHealth = inFrostHealth;
	}
	
	@EventHandler
	public void onPlayerJoin (PlayerJoinEvent event) {
		event.getPlayer().setScoreboard(frostHealth.scoreBoard);
	}
	
}