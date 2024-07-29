package me.waterarchery.litminions.handlers;

import me.waterarchery.litminions.models.minions.Minion;
import me.waterarchery.litminions.models.minions.types.*;
import me.waterarchery.litminions.utils.MinionFace;
import org.bukkit.*;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class MinionHandler {

    private final ArrayList<Minion> allMinions = new ArrayList<>();
    private final ArrayList<Minion> activeMinions = new ArrayList<>();
    private final ArrayList<CollectorMinion> collectorMinions = new ArrayList<>();
    private final HashMap<Player, Minion> playerMinionHashMap = new HashMap<>();
    private static MinionHandler minionHandler;
    private NamespacedKey minionKey;
    private UUID latestMinion = null;
    private int startTick = 0;

    public static synchronized MinionHandler getInstance() {
        if (minionHandler == null)
            minionHandler = new MinionHandler();

        return minionHandler;
    }

    private MinionHandler() {
    }

    public ItemStack getMinionPlaceItem(String minionType, int level, Player player) {
        return null;
    }

    public ArrayList<Minion> getPlayerMinions(OfflinePlayer player) {
        return new ArrayList<>();
    }

    public boolean isMinion(ArmorStand armorStand) {
        return false;
    }

    public boolean isMinionPlacedLoc(Location loc) {
        return false;
    }

    public Minion createMinionWithType(String type, UUID owner, double x, double y, double z, String world, MinionFace minionFace,
                                       double chestX, double chestY, double chestZ, String chestWorld, int stat, int level, int hunger) {
        return null;
    }

    public boolean checkMaxIsland(Player p, Location location, String type) {
        return true;
    }

    public int getMaxPerIsland(Player p) {
        return 1;
    }

    public double getFeedPrice(String type) {
       return 1;
    }

    public boolean checkMaxType(Player p, String type) {
        return true;
    }

    public int getMaxPerType(Player p, String type) {
        return 1;
    }

    public int getHungerFromFood(Inventory inventory) {
        return 1;
    }

    public int getHungerFromFood(ItemStack itemStack) {
        return 0;
    }

    public void removeMinion(Minion minion) {
    }

    public ItemStack getCustomHead(String helmetMat) {
        return null;
    }

    public double getNextUpgradePrice(Minion minion) {
        return -1;
    }

    public double getMinionPrice(String type) {
        return -1;
    }

    public Minion getMinionWithUUID(String uuidStr) {
        return null;
    }

    public void checkUpgradeRequirements(Minion minion, Player p) {
    }

    public boolean isInLastLevel(Minion minion) {
        return false;
    }

    public void loadDefaultSettings(Minion minion) {
    }

    public int getMaxPlaceableMinion(OfflinePlayer p) {
        return 1;
    }

    public int getMinionCountPlayer(OfflinePlayer p) {
        return 1;
    }

    public ArrayList<Minion> getMinionsOfPlayer(OfflinePlayer p) {
       return new ArrayList<>();
    }

    public UUID getLatestMinion() {
        return latestMinion;
    }

    public void setLatestMinion(UUID latestMinion) {
        this.latestMinion = latestMinion;
    }

    public int getStartTick() {
        return startTick;
    }

    public void setStartTick(int startTick) {
        this.startTick = startTick;
    }

    public ArrayList<Minion> getAllMinions() {
        return allMinions;
    }

    public HashMap<Player, Minion> getPlayerMinionHashMap() {
        return playerMinionHashMap;
    }

    public NamespacedKey getMinionKey() {
        return minionKey;
    }

    public ArrayList<Minion> getActiveMinions() {
        return activeMinions;
    }

}
