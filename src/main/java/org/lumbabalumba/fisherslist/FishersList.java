package org.lumbabalumba.fisherslist;

import org.bukkit.plugin.java.JavaPlugin;

public final class FishersList extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("FishersList is enabled");
        this.getCommand("fishers").setExecutor(new Fishers());
    }

    @Override
    public void onDisable() {
        getLogger().info("FishersList is disabled");
    }
}
