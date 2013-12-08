package frostHealth;

import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;


public class FrostHealth extends JavaPlugin {
	public ScoreboardManager scoreBoardManager;
	public Scoreboard scoreBoard;
	public Objective objective;
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new PlayerListener(this),this);
		 scoreBoardManager = Bukkit.getScoreboardManager();
		 scoreBoard = scoreBoardManager.getNewScoreboard();
		 objective = scoreBoard.registerNewObjective("showhealth", "health");
		 objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		 objective.setDisplayName(ChatColor.BLUE + "❤");
		 this.getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "[FrostHealth] Plugin enabled.");
		 return;
	}

	public void onDisable() {
		this.getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "[FrostHealth] Plugin disabled.");
	}
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		Player p;
		try {
			p = this.getServer().getPlayer(sender.getName());	
		}
		catch (Exception e) {
			return true;
		}
		
		
		if (cmd.getName().equalsIgnoreCase("FrostHealth") ) 
		{	
			p.sendMessage("FrostHealth - Health Indicator plugin V1.0 - www.frostcraft.com");
		}
		
		return true;
	}

}
