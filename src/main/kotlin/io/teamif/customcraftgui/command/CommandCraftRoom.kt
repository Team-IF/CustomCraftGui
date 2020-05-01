package io.teamif.customcraftgui.command

import io.teamif.customcraftgui.invgui.CraftingGui
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class CommandCraftRoom : CommandExecutor {
    override fun onCommand(sender: CommandSender?, command: Command?, label: String?, args: Array<out String>?): Boolean {
        CraftingGui.INVENTORY.open(sender as Player?)
        return false
    }
}