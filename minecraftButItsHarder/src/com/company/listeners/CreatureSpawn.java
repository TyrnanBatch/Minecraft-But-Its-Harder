package com.company.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class CreatureSpawn implements Listener{

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("TestforCreatureSpawn")) {
            if (sender instanceof Player) {
                //player created
                Player player = (Player) sender;
                player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Test successful for CreatureSpawn");
            } else {
                sender.sendMessage("Test Error");
            }
            return true;
        }

        return false;
    }
	
    @EventHandler
    public void creatureSpawn(CreatureSpawnEvent event) {

            if (event.getEntityType() == EntityType.CREEPER) {
                Creeper creeper = (Creeper) event.getEntity();
                creeper.setPowered(true);
                System.out.println("creeper");
                Bukkit.broadcastMessage("CREEPER detected");
            }

            if (event.getEntityType() == EntityType.ZOMBIE) {

                Zombie zombie = (Zombie) event.getEntity();
                zombie.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
                zombie.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
                zombie.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
                zombie.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
                System.out.println("zombie");
                Bukkit.broadcastMessage("ZOMBIE detected");
            }

        }
    }