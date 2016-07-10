package com.koba.dropheads.listeners;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class PlayerDeathListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player dead = event.getEntity();
        Player killer = dead.getKiller();
        ItemStack weapon = killer.getInventory().getItemInMainHand();
        Enchantment looting = Enchantment.LOOT_BONUS_MOBS;
        Map<Enchantment, Integer> enchantments = weapon.getEnchantments();
        if (enchantments.containsKey(looting)) {
            //do stuff
        }
    }
}
