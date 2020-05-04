package io.teamif.customcraftgui

import io.teamif.customcraftgui.command.CommandCraftRoom
import io.teamif.customcraftgui.command.CommandCraftWorkspace
import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused")
class CustomCraftGuiPlugin : JavaPlugin() {
    override fun onEnable() {
        getCommand("작업실")?.executor = CommandCraftWorkspace()
        getCommand("작업장")?.executor = CommandCraftRoom()
    }
}