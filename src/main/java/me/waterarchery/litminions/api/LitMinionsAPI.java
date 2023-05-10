package me.waterarchery.litminions.api;

import me.waterarchery.litminions.cache.minions.Minion;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.UUID;

public class LitMinionsAPI {

    public LitMinionsAPI() {

    }

    @Nullable
    public static ItemStack getMinionItem(String minionType, int level) {
        return null;
    }

    public static ArrayList<Minion> getPlayerMinions(OfflinePlayer player) {
        return new ArrayList<>();
    }

    public static int getMaxPerIsland(Player player) {
        return 0;
    }

    public static int getMaxPerType(Player player, String minionType) {
        return 0;
    }

    public static int getMaxPlaceableMinion(OfflinePlayer player) {
        return 0;
    }

    public static int getPlacedMinionsCount(OfflinePlayer player) {
        return 0;
    }

    public static double getNextUpgradePrice(Minion minion) {
        return -1;
    }

    public static double getMinionPrice(String minionType) {
        return -1;
    }

    public static void removeMinion(Minion minion) {
        
    }

    public static ArrayList<Minion> getAllMinions() {
        return new ArrayList<Minion>();
    }

    public static boolean isSafeLocation(Location loc) {
        return false;
    }

    public static Minion createMinion(String type, UUID owner, Location location, int level, int hunger) {
        return null;
    }
    
}
