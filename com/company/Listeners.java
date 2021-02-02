package com.company;

import org.bukkit.Material;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.inventory.ItemStack;

public class Listeners implements Listener{

    @EventHandler
    public void creatureSpawn(CreatureSpawnEvent event) {

            if (event.getEntityType() == EntityType.CREEPER) {
                Creeper creeper = (Creeper) event.getEntity();
                creeper.setPowered(true);
                System.out.println("creeper");
            }

            if (event.getEntityType() == EntityType.ZOMBIE) {

                Zombie zombie = (Zombie) event.getEntity();

                zombie.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
                zombie.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
                zombie.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
                zombie.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
                System.out.println("zombie");

            }

        }
    }