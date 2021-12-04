package nl;
import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.event.Listener;
import org.bukkit.advancement.Advancement;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.*;
public class Events implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent evt) {
        boolean messagecheck = corwindev.plugin.getConfig().getBoolean("leave.enabled");
        if (messagecheck == false) {
            evt.setQuitMessage("");

        } else {
            String message = corwindev.plugin.getConfig().getString("leave.message");
            String message1 = message.replace("{member}", evt.getPlayer().getName());
            evt.setQuitMessage(message1);
        }
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent evt) {

        boolean messagecheck = corwindev.plugin.getConfig().getBoolean("join.enabled");
        if (messagecheck == false) {
            evt.setJoinMessage("");
            return;
        } else {
            String message = corwindev.plugin.getConfig().getString("join.message");
            String message1 = message.replace("{member}", evt.getPlayer().getName());
            evt.setJoinMessage(message1);
        }

        boolean scoreboardcheck = corwindev.plugin.getConfig().getBoolean("join.enabled");
        if (scoreboardcheck == false) {
            return;
        } else {
            String message2 = corwindev.plugin.getConfig().getString("sidebar.title");


            Player player = evt.getPlayer();

            ScoreboardManager m = Bukkit.getScoreboardManager();
            Scoreboard b = m.getNewScoreboard();

            Objective o = b.registerNewObjective("ScoreBoard", "");
            o.setDisplaySlot(DisplaySlot.SIDEBAR);
            o.setDisplayName(message2);
            String score1 = corwindev.plugin.getConfig().getString("sidebar.sentence1");
            String score2 = corwindev.plugin.getConfig().getString("sidebar.sentence2");
            String score3 = corwindev.plugin.getConfig().getString("sidebar.sentence3");
            String score4 = corwindev.plugin.getConfig().getString("sidebar.sentence4");
            String score5 = corwindev.plugin.getConfig().getString("sidebar.sentence5");
            String score6 = corwindev.plugin.getConfig().getString("sidebar.sentence6");
            String score7 = corwindev.plugin.getConfig().getString("sidebar.sentence7");
            String score8 = corwindev.plugin.getConfig().getString("sidebar.sentence8");
            String score9 = corwindev.plugin.getConfig().getString("sidebar.sentence9");
            String score10 = corwindev.plugin.getConfig().getString("sidebar.sentence10");
            String score11 = corwindev.plugin.getConfig().getString("sidebar.sentence11");
            String score12 = corwindev.plugin.getConfig().getString("sidebar.sentence12");
            String score13 = corwindev.plugin.getConfig().getString("sidebar.sentence13");
            String score14 = corwindev.plugin.getConfig().getString("sidebar.sentence14");
            String score15 = corwindev.plugin.getConfig().getString("sidebar.sentence15");

            if(score1 == null){
                return;
            }else{
                String score111 = score1.replace("{member}", evt.getPlayer().getName());

                Score one = o.getScore(score111);
                one.setScore(1);
                player.setScoreboard(b);

            }
            if(score2 == null){
                return;
            }else{
                String score22 = score2.replace("{member}", evt.getPlayer().getName());

                Score two = o.getScore(score22);
                two.setScore(2);
                player.setScoreboard(b);

            }
            if(score3 == null){
                return;
            }else{
                String score33 = score3.replace("{member}", evt.getPlayer().getName());

                Score three = o.getScore(score33);
                three.setScore(3);
                player.setScoreboard(b);

            }
            if(score4 == null){
                return;
            }else{
                String score44 = score4.replace("{member}", evt.getPlayer().getName());

                Score four = o.getScore(score44);
                four.setScore(4);
                player.setScoreboard(b);

            }
            if(score5 == null){
                return;
            }else{
                String score55 = score5.replace("{member}", evt.getPlayer().getName());

                Score five = o.getScore(score55);
                five.setScore(5);
                player.setScoreboard(b);

            }
            if(score6 == null){
                return;
            }else{
                String score66 = score6.replace("{member}", evt.getPlayer().getName());

                Score one = o.getScore(score66);
                one.setScore(6);
                player.setScoreboard(b);

            }
            if(score7 == null){
                return;
            }else{
                String score77 = score7.replace("{member}", evt.getPlayer().getName());

                Score two = o.getScore(score77);
                two.setScore(7);

                player.setScoreboard(b);

            }
            if(score8 == null){
                return;
            }else{
                String score88 = score8.replace("{member}", evt.getPlayer().getName());

                Score three = o.getScore(score88);
                three.setScore(8);
                player.setScoreboard(b);

            }
            if(score9 == null){
                return;
            }else{
                String score99 = score9.replace("{member}", evt.getPlayer().getName());

                Score four = o.getScore(score99);
                four.setScore(9);
                player.setScoreboard(b);

            }
            if(score10 == null){
                return;
            }else{
                String score1010 = score10.replace("{member}", evt.getPlayer().getName());

                Score five = o.getScore(score1010);
                five.setScore(10);
                player.setScoreboard(b);

            }
            if(score11 == null){
                return;
            }else{
                String score1111 = score11.replace("{member}", evt.getPlayer().getName());

                Score one = o.getScore(score1111);
                one.setScore(11);
                player.setScoreboard(b);

            }
            if(score12 == null){
                return;
            }else{
                String score1122 = score12.replace("{member}", evt.getPlayer().getName());

                Score two = o.getScore(score1122);
                two.setScore(12);
                player.setScoreboard(b);

            }
            if(score13 == null){
                return;
            }else{
                String score1133 = score13.replace("{member}", evt.getPlayer().getName());

                Score three = o.getScore(score1133);
                three.setScore(13);
                player.setScoreboard(b);

            }
            if(score14 == null){
                return;
            }else{
                String score1144 = score14.replace("{member}", evt.getPlayer().getName());

                Score four = o.getScore(score1144);
                four.setScore(14);
                player.setScoreboard(b);

            }
            if(score15 == null){
                return;
            }else{
                String score1155 = score15.replace("{member}", evt.getPlayer().getName());

                Score five = o.getScore(score1155);
                five.setScore(15);
                player.setScoreboard(b);

            }


            player.setScoreboard(b);
        }

    }



    @EventHandler
    public void onPlayerAdvancementDoneEvent(PlayerAdvancementDoneEvent event) {
        Player player = event.getPlayer();
        String advencement = event.getAdvancement().toString();
        player.sendMessage(advencement);
        player.sendMessage(event.getEventName().toString());

    };
}