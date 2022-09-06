package com.jonghyun.mysql;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if(sender.isOp())
        {
            Mysql.register();
            sender.sendMessage("reload complete");
        }
        return false;
    }
}
