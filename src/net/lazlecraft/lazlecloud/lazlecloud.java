package net.lazlecraft.lazlecloud;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class lazlecloud extends JavaPlugin {
	
	
    @Override
    public void onEnable() {
    	Bukkit.getMessenger().registerOutgoingPluginChannel(this, "RubberBand");
        PluginDescriptionFile plugin = getDescription();
        System.out.println(plugin.getName() + " version " + plugin.getVersion() + " by LaxWasHere enabled.");
    }
        

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You can't teleport to other servers, console!");
            return false;
        }
        Player p = (Player)sender;
        if (commandLabel.equalsIgnoreCase("lazlegames")) {
                p.sendPluginMessage(this, "RubberBand", ("sg").getBytes());
        }
        else if (commandLabel.equalsIgnoreCase("debug")){
        	 p.sendPluginMessage(this, "RubberBand", ("test").getBytes());
        }
        else if (commandLabel.equalsIgnoreCase("survival")){
        	 p.sendPluginMessage(this, "RubberBand", ("smp").getBytes());
        }
        else if (commandLabel.equalsIgnoreCase("hub")){
        	 p.sendPluginMessage(this, "RubberBand", ("hub").getBytes());
        }
        else if (commandLabel.equalsIgnoreCase("pvp")){
        	p.sendPluginMessage(this, "RubberBand", ("pvp").getBytes());
        }
        else if (commandLabel.equalsIgnoreCase("skyblock")){
        	 p.sendPluginMessage(this, "RubberBand", ("sb").getBytes());
        }
        else if (commandLabel.equalsIgnoreCase("freebuild")){
       	 p.sendPluginMessage(this, "RubberBand", ("freebuild").getBytes());
        }
        else if (commandLabel.equalsIgnoreCase("event")){
        	p.sendPluginMessage(this, "RubberBand", ("event").getBytes());
        }
        else if (commandLabel.equalsIgnoreCase("buildserver")){
        	p.sendPluginMessage(this, "RubberBand", ("build").getBytes());
        }
        else if (commandLabel.equalsIgnoreCase("walls1")){
        	 p.sendPluginMessage(this, "RubberBand", ("walls1").getBytes());
        }
        else if (commandLabel.equalsIgnoreCase("walls2")){
       	 p.sendPluginMessage(this, "RubberBand", ("walls2").getBytes());
        }
        else if (commandLabel.equalsIgnoreCase("walls3")){
        	p.sendPluginMessage(this, "RubberBand", ("walls3").getBytes());
        }
        else if (commandLabel.equalsIgnoreCase("walls4")){
        	p.sendPluginMessage(this, "RubberBand", ("walls4").getBytes());
        	
       }
        else if (commandLabel.equalsIgnoreCase("lazlecloud")){
        	p.sendMessage(ChatColor.ITALIC + "--------LazleCraft Website--------");
        	p.sendMessage(ChatColor.GREEN + "Please click the link below");
        	p.sendMessage(ChatColor.GREEN + "Click --->" + ChatColor.AQUA + " http://LazleCraft.net");
        	p.sendMessage(ChatColor.ITALIC + "----------------------------------");
        }
    
        return false;
    }

}
