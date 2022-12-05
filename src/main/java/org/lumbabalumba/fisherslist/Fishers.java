package org.lumbabalumba.fisherslist;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Fishers implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command Command, @NotNull String label, String[] args) {
        List<Player> list = new ArrayList<>(Bukkit.getOnlinePlayers());
        StringBuilder str = new StringBuilder();
        sender.sendMessage("List of fishing players:\n");
        int n = 0;
        for (Player player : list) {
            if (player.getInventory().getItemInMainHand().getType() == Material.FISHING_ROD | player.getInventory().getItemInOffHand().getType() == Material.FISHING_ROD) {
                str.append(player.getName()).append("  \n");
                ++n;
            }
        }
        if(n == 0) str = new StringBuilder("There are no fishing players on this server");
        sender.sendMessage(String.valueOf(str));
        return true;
    }
}
