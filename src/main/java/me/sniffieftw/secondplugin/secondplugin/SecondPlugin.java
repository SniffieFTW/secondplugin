package me.sniffieftw.secondplugin.secondplugin;

import me.sniffieftw.secondplugin.secondplugin.Events.EventsClass;
import me.sniffieftw.secondplugin.secondplugin.Events.SecondAction;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SecondPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nPlugin Started\n\n");
        getServer().getPluginManager().registerEvents(new EventsClass(), this);
        getServer().getPluginManager().registerEvents(new SecondAction(), this);
    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
