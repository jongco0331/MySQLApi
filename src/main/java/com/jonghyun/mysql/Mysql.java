package com.jonghyun.mysql;

import org.bukkit.plugin.java.JavaPlugin;

public final class Mysql extends JavaPlugin {

    public static String[] info;

    private static Mysql instance;

    public static Mysql getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        register();
        getCommand("mysql").setExecutor(new Command());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static void register()
    {
        String[] a = new String[5];
        Mysql.getInstance().saveDefaultConfig();
        a[0] = Mysql.getInstance().getConfig().getString("address");
        a[1] = Mysql.getInstance().getConfig().getString("port");
        a[2] = Mysql.getInstance().getConfig().getString("database");
        a[3] = Mysql.getInstance().getConfig().getString("username");
        a[4] = Mysql.getInstance().getConfig().getString("password");
        new Connection();
        System.out.println("리로드 완료");
    }

}
