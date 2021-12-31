package com.gmail.jlmerrett.BlankPlugin;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class BlankPlugin extends JavaPlugin {

    static Plugin plugin;

    @Override
    public void onEnable() {
       initPlugin();
    }

    @Override
    public void onDisable() {

    }

    private void initPlugin(){
        plugin = this;
    }
}
