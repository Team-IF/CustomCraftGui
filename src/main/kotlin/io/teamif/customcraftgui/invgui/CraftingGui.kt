package io.teamif.customcraftgui.invgui

import fr.minuskube.inv.ClickableItem
import fr.minuskube.inv.SmartInventory
import fr.minuskube.inv.SmartInventory.builder
import fr.minuskube.inv.content.InventoryContents
import fr.minuskube.inv.content.InventoryProvider
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack


class CraftingGui : InventoryProvider {
    companion object {
        val INVENTORY: SmartInventory = builder().id("craftGUI").provider(CraftingGui()).size(5, 9)
                .title("${ChatColor.BLUE}Sample Crafting GUI!")
                .build()
    }

    override fun init(player: Player, contents: InventoryContents) {
        contents.fillBorders(ClickableItem.empty(ItemStack(Material.STAINED_GLASS_PANE)))
    }

    override fun update(player: Player, contents: InventoryContents) {}
}