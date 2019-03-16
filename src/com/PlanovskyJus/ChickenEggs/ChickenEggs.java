package com.PlanovskyJus.ChickenEggs;

import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class ChickenEggs extends JavaPlugin {

//    private final ChickenListener entListener = new ChickenListener(this);
//    public Server srv = null;
    public static final Logger log = Logger.getLogger("Minecraft");


    @Override
    public void onEnable(){
//        srv = getServer();
//        PluginManager pm = srv.getPluginManager();
        log.info("Loaded ChickenEggs");
        getServer().getPluginManager().registerEvents(new ChickenListener(), this);
    }

    @Override
    public void onDisable(){

    }





}
