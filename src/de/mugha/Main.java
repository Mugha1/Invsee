package de.mugha;

import de.mugha.commands.InvseeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    @Override
    public void onEnable() {
        getCommand("invsee").setExecutor(new InvseeCommand());
    }
}
