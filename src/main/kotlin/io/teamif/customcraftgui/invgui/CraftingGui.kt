package io.teamif.customcraftgui.invgui

import fr.minuskube.inv.ClickableItem.empty
import fr.minuskube.inv.SmartInventory.builder
import fr.minuskube.inv.content.InventoryContents
import fr.minuskube.inv.content.InventoryProvider
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class CraftingGui : InventoryProvider {
    companion object {
        val INVENTORY = builder().id("craftingGui").provider(CraftingGui()).size(5, 7)
            .title("${ChatColor.RED}Crafting GUI").build()
    }

    override fun init(player: Player?, contents: InventoryContents?) {
        contents?.fillBorders(empty(ItemStack(Material.STAINED_GLASS_PANE)))
        contents?.set(1, 4, empty(ItemStack(Material.STAINED_GLASS_PANE)))
        contents?.set(1, 5, empty(ItemStack(Material.STAINED_GLASS_PANE)))
        contents?.set(3, 4, empty(ItemStack(Material.STAINED_GLASS_PANE)))
        contents?.set(3, 5, empty(ItemStack(Material.STAINED_GLASS_PANE)))
    }

    override fun update(player: Player?, contents: InventoryContents?) {}
}