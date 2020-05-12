package io.teamif.customcraftgui.invgui

import fr.minuskube.inv.ClickableItem
import fr.minuskube.inv.SmartInventory
import fr.minuskube.inv.SmartInventory.builder
import fr.minuskube.inv.content.InventoryContents
import fr.minuskube.inv.content.InventoryProvider
import fr.minuskube.inv.content.SlotPos
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack


class CraftingGui : InventoryProvider {
    companion object {
        val INVENTORY: SmartInventory = builder().id("craftGUI")
                .provider(CraftingGui()).size(5, 9)
                .title("${ChatColor.BLUE}Sample Crafting GUI!")
                .build()
    }

    override fun init(player: Player, contents: InventoryContents) {
        val slots = arrayOf(
                SlotPos(2, 2),
                SlotPos(2, 3),
                SlotPos(2, 4),
                SlotPos(3, 2),
                SlotPos(3, 3),
                SlotPos(3, 4),
                SlotPos(4, 2),
                SlotPos(4, 3),
                SlotPos(4, 4),
                SlotPos(3, 8)
        )
        contents.fillBorders(ClickableItem.empty(ItemStack(Material.STAINED_GLASS_PANE)))
        for (slot in slots) {
            contents.setEditable(slot, true)
        }
    }

    override fun update(player: Player, contents: InventoryContents) {}
}