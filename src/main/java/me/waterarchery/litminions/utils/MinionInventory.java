package me.waterarchery.litminions.utils;

import me.waterarchery.litminions.cache.minions.Minion;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class MinionInventory {

    public ArrayList<InventoryFactory> factories;
    public Minion minion;
    public int maxInventory;

    public MinionInventory(Minion minion) {
        factories = new ArrayList<>();
        this.minion = minion;
    }

    public Inventory getInventory(int page) {
        return null;
    }

    public boolean createIfBelowMax(int page) {
        return false;
    }

    public void createInventory(int page) {

    }

    public boolean isInventoryExist(int page) {
        return false;
    }

    int lastDrop = 0;

    public HashMap<Integer, ItemStack> addItem(ItemStack item, int page) {
        return new HashMap<>();
    }

    public boolean hasSpace(Inventory inventory, ItemStack item) {
        return false;
    }

    public int addItem(ItemStack item) {
        return -1;
    }

    public boolean isSameItem(ItemStack itemStack1, ItemStack itemStack2) {
        return true;
    }

    public void sortInventory(int page, Player p) {

    }

    public void takeItems(int page, Player p) {

    }

    public void smeltInventory(int page, Player p) {

    }

    public void makeBlockInventory(int page, Player p) {

    }

    public void setMaxInventory(int page) {
    }

    public Minion getMinion() { return null; }

    public int getMaxInventory() { return 1; }

}
