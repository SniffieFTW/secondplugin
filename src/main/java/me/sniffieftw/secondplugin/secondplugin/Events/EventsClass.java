package me.sniffieftw.secondplugin.secondplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EventsClass implements Listener {

    //add item on block break and rename item to Tester Boy
    @EventHandler
    public void  onBlockBreak(BlockBreakEvent e){
        Player player = e.getPlayer();
        ItemStack item = new ItemStack(Material.CYAN_WOOL);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Tester Boy");
        item.setItemMeta(meta);
        player.getInventory().addItem(item);
        //send msg
        player.sendMessage(ChatColor.RED + "You can't break that");
        e.setCancelled(true);

    }

    //player cant craft anything
    @EventHandler
    public void craft(CraftItemEvent c){
        InventoryAction player = c.getAction();
        c.setCancelled(true);
    }
}
