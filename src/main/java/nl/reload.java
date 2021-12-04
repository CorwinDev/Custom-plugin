package nl;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class reload implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String firstArg, String[] args) {



        corwindev.plugin.reloadConfig();
        sender.sendMessage("Reloaded the config!");


        return true;

    };
}