package com.github.redgate.logic;


import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DebugPlacer implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        //print debug info to server console spigot log
        Bukkit.getLogger().info("DebugPlacer.onCommand() called");

        if(args.length == 0) return false;
        if(sender instanceof Player){
            Player p = (Player)sender;
            p.sendMessage("Hello, " + p.getName() + "!");
            Location loc = p.getLocation();
            if(args[0].equals("torch")) 
                loc.getBlock().setType(Material.REDSTONE_TORCH, false);
            return true;
        }
        return false;
    }
    
}
