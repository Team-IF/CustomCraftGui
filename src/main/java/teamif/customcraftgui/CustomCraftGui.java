package teamif.customcraftgui;

import org.bukkit.plugin.java.JavaPlugin;
import teamif.customcraftgui.commands.CommandCraftingRoom;
import teamif.customcraftgui.commands.CommandWorkspace;

public final class CustomCraftGui extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("작업실").setExecutor(new CommandCraftingRoom());
        this.getCommand("작업장").setExecutor(new CommandWorkspace());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
