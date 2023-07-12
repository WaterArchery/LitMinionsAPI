package me.waterarchery.litminions.utils;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class InventoryFactory implements InventoryHolder {

    private Inventory inventory;
    public String title;
    public int page;

    public String getTitle() { return title; }

    public InventoryFactory(int size, String title, int page) {
        this.inventory = Bukkit.createInventory(this, size, title);
        this.title = title;
        this.page = page;
    }

    @Override
    public Inventory getInventory() {
        return this.inventory;
    }

    public int getPage() { return page; }
}
