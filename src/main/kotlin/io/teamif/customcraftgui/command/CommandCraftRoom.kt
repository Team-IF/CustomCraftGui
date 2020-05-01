package io.teamif.customcraftgui.command

import io.teamif.customcraftgui.invgui.CraftingGui
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class CommandCraftRoom : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) {
            sender.sendMessage("플레이어만 사용 가능한 명령어 입니다.")
            return true
        }
        CraftingGui.INVENTORY.open(sender)
        return true
    }
}