package com.PlanovskyJus.ChickenEggs;


import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;

public class ChickenListener implements Listener {

    @EventHandler
    public void onPlayerEggThrowEvent(PlayerEggThrowEvent event){
        event.setNumHatches((byte)5);
        event.setHatchingType(EntityType.CREEPER);
        event.setHatching(true);
    }
}
