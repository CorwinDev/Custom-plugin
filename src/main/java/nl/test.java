package nl;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Locale;

import static org.bukkit.Bukkit.getServer;

public class test implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String firstArg, String[] args) {
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("join")) {
                Boolean messagecheck = corwindev.plugin.getConfig().getBoolean("join.enabled");
                if (messagecheck == false) {
                    sender.sendMessage("You have disabled the config for playerjoins, pls enable it and try again!");
                } else {
                    String message = corwindev.plugin.getConfig().getString("join.message");
                    String message1 = message.replace("{member}", sender.getName());
                    sender.sendMessage(message1);
                }

// Writing to the config

            } else if(args[0].equalsIgnoreCase("leave")) {
                Boolean messagecheck = corwindev.plugin.getConfig().getBoolean("leave.enabled");
                if (messagecheck == false) {
                    sender.sendMessage("You have disabled the config for player-leaves, pls enable it and try again!");
                } else {
                    String message = corwindev.plugin.getConfig().getString("leave.message");
                    String message1 = message.replace("{member}", sender.getName());
                    sender.sendMessage(message1);
                }
            } else if(args[0].equalsIgnoreCase("help")) {
                sender.sendMessage("Help Menu:\nThe Events for now are: §1join, leave");


            }else{
                sender.sendMessage("You have to say at least one event!\nRun /c-test help to get the events!");

            }
            return true;
        } else {
            sender.sendMessage("You have to say at least one event!\nRun /c-test help to get the events!");
            return false;
        }
    }
}
