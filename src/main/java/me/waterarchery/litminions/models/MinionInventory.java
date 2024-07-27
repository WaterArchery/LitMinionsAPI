package me.waterarchery.litminions.models;

import me.waterarchery.litminions.models.minions.Minion;
import me.waterarchery.litminions.utils.InventoryFactory;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.*;

public class MinionInventory {

    public ArrayList<InventoryFactory> factories = new ArrayList<>();
    public Minion minion;
    public int maxInventory;

    public MinionInventory(Minion minion) {
        this.minion = minion;
    }

    public void createInventories() {
        for (int i = 1; i <= maxInventory; i++) {
            createInventory(i);
        }
    }

    public void unload() { }

    public Inventory getInventory(int page) { return null; }

    public boolean createIfBelowMax(int page) { return false; }

    public void createInventory(int page) { }

    public boolean dropInventory(@Nullable Player p) { return true; }

    public boolean isInventoryExist(int page) { return false; }

    int lastDrop = 0;

    public HashMap<Integer, ItemStack> addItem(ItemStack item, int page) { return new HashMap<>(); }

    public boolean hasSpace(Inventory inventory, ItemStack item) { return false; }


    /**
     * This method is used to add an item to the minion's inventory.
     * It iterates through the pages of the inventory until it finds a page with space.
     * If the item already exists in the inventory, it increases the amount of the item.
     * If the item does not exist, it adds the item to the inventory.
     * If the inventory is full, it returns -1.
     *
     * @param item The item to be added to the inventory.
     * @return The page number where the item was added, or -1 if the inventory is full.
     */
    public int addItem(ItemStack item) { return -1; }


    public boolean isSameItem(ItemStack itemStack1, ItemStack itemStack2) { return true; }

    public void takeItems(int page, Player p) { }

    public void addItems(Collection<ItemStack> drops) { }

    public void dropSync(Collection<ItemStack> drops) { }

    public Collection<ItemStack> getSmeltedItems(Collection<ItemStack> drops) { return new ArrayList<>(); }


    public void smeltInventory(int page, Player p) { }

    public ItemStack getSmeltedItem(ItemStack itemStack) { return itemStack; }

    public void makeBlockInventory(int page, Player p) { }

    public void setMaxInventory(int page) { }

    public int[] getCapacity() { return new int[1]; }

    public Minion getMinion() { return minion; }

    public int getMaxInventory() { return maxInventory; }

}
