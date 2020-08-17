package me.sniffieftw.secondplugin.secondplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class SecondAction implements Listener {

    @EventHandler
    public void onClick(PlayerInteractEvent e){
        Action action = e.getAction();
        Player player = e.getPlayer();
        Block block = e.getClickedBlock();

        if (action.equals(Action.LEFT_CLICK_BLOCK)){
            if (block.getType().equals(Material.EMERALD_BLOCK)) {
                if (player.getHealth() != 20){
                    player .setHealth(player.getHealth() + 1);
                    player.sendMessage(ChatColor.MAGIC + "k" + ChatColor.GREEN + "You gave been healed + 1" + ChatColor.MAGIC + "k");
                } else {
                    player.sendMessage(ChatColor.AQUA + "you are already completely healed");
                }
            }
        }
    }
}
