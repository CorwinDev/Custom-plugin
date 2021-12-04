package nl;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Locale;

import static org.bukkit.Bukkit.getServer;

public class all implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String firstArg, String[] args) {
        if (args.length == 1) {
            if (!args[0].equalsIgnoreCase("test")) {


                sender.sendMessage(corwindev.plugin.getConfig().getString("join-message"));
// Writing to the config
                return true;

            } else {
                sender.sendMessage("This isn't a command!");
            }
            return true;
        } else {
            sender.sendMessage("You have to say at least one arg!");
            return false;
        }
    }
}
