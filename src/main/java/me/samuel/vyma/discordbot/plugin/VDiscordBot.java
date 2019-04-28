package me.samuel.vyma.discordbot.plugin;

import me.samuel.vyma.pluginInterface.VPluginInterface;

public class VDiscordBot extends VPluginInterface {

    public VDiscordBot() {
        super("VDiscordBot", 0.1);
    }

    @Override
    public void onLoad() {
        System.out.println("loading "+getName()+"...");
    }

    @Override
    public void onPostLoad() {
        System.out.println("finishing "+getName()+"...");
    }

    @Override
    public void onUnload() {
        System.out.println("unloading "+getName()+"...");
    }

    @Override
    public void onPostUnload() {
        System.out.println("finishing "+getName()+"...");
    }
}
