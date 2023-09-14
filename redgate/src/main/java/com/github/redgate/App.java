package com.github.redgate;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.redgate.logic.DebugPlacer;
public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getLogger().info("Hello, PaperMC!");
        this.getCommand("redplace").setExecutor(new DebugPlacer());
    }
    @Override
    public void onDisable() {
        this.getLogger().info("See you again, SpigotMC!");
    }
}
