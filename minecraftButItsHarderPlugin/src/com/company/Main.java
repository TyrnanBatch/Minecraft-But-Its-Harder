package com.company;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // startup
        // reloads
        // plugin reloads
    }
    @Override
    public void onDisable() {
        // shutdown
        // reloads
        // plugin reloads
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("Test")) {
            if (sender instanceof Player) {
                //player created
                Player player = (Player) sender;
                player.sendMessage("Test successful");
            } else {
                sender.sendMessage("Test Error");
            }
            return true;
        }

        return false;
    }
}
