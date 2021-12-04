package nl;

import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.plugin.java.JavaPlugin;


public final class corwindev extends JavaPlugin {

    public static corwindev plugin;

    @Override
    public void onEnable() {
        new UpdateChecker(this, 98007).getVersion(version -> {
            if (this.getDescription().getVersion().equals(version)) {
                getLogger().info("You are up-to-date!");
            } else {
                getLogger().warning("There is a new update available.");
            }
        });


        this.reloadConfig();
        getLogger().info("Corwin starting up!");

        this.saveDefaultConfig();
        this.getCommand("c-test").setExecutor(new test());

        this.getCommand("corwin").setExecutor(new all());
        this.getCommand("c-reload").setExecutor(new reload());
        getServer().getPluginManager().registerEvents(new Events(), this);

        plugin = this;

    }

    @Override
    public void onDisable() {


    };
}