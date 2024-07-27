package me.waterarchery.litminions.models.minions;

import me.waterarchery.litminions.models.*;
import me.waterarchery.litminions.utils.MinionFace;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.BoundingBox;

import java.util.*;

public class Minion {

    private boolean isLoaded;
    private boolean isLoading;
    private UUID ownerUUID;
    private double x;
    private double y;
    private double z;
    private double chestX;
    private double chestY;
    private double chestZ;
    private String world;
    private String chestWorld;
    private MinionFace minionFace;
    private int stat;
    private int level;
    private double multiplyChance;
    private double expChance;
    private ArrayList<String> ignores = new ArrayList<>();
    private boolean canSmelt;
    private boolean canConvertIntoBlocks;
    private boolean canSort;
    private boolean canTakeItems;
    private int exp = 0;
    private BoundingBox range = null;
    private String name;
    private int hunger;
    private int maxHunger;
    private int particlePercent;
    private boolean blacklist;
    private boolean canPickUp;
    private boolean isTalking;
    private String ownerName;
    private MinionInventory minionInventory;
    private final MinionStand minionStand = new MinionStand(this);
    private final MinionTaskManager taskManager = new MinionTaskManager(this);
    private final MinionHologram minionHologram = new MinionHologram(this);
    private final MinionSettings minionSettings = new MinionSettings(this);

    public Minion(UUID ownerUUID, double x, double y, double z, String world, MinionFace minionFace,
                  double chestX, double chestY, double chestZ, String chestWorld, int stat, int level, int hunger) {
    }

    public void createIgnores() {
    }

    public void pickUp(Player p) {
    }

    public String getOwnerName() {
        return null;
    }

    public void dropItems(Collection<ItemStack> drops) {
    }

    public HashMap<Integer, ItemStack> addItemToChest(Collection<ItemStack> drops) {
        return null;
    }

    public void addExp(String key) {

    }

    public String getMinionUUID() {
        return world + "/" + x + "/" + ((int) y) + "/" + z;
    }

    public boolean isChunkLoaded() {
        return false;
    }

    public int getChunkX() {
        return (int) (x / 16);
    }

    public int getChunkZ() {
        return (int) (z / 16);
    }

    protected BlockState latestState = null;

    public boolean isChestLoaded() {
        return false;
    }

    public Location getLocation() {
        return new Location(Bukkit.getWorld(world), x, y, z);
    }

    public void setChest(Block block) {
    }

    public void removeChest() {
    }

    public void rotateMinion() {
    }

    public float minionFaceToYaw(MinionFace minionFace) {
        return 1;
    }

    public boolean isOnlineCheck() {
        return false;
    }

    public void upgrade() {
    }

    public void setName(String name) {
    }

    public void calculateParticles(Location location) {
    }

    public void setHunger(int hunger) {
    }

    public long getMaxHunger() {
        return maxHunger;
    }

    public void addHunger(int hunger) {
    }

    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return null;
    }

    public void onDisableTask() {

    }

    public void onRepeatTask() {
    }

    public void onStartTask() {

    }

    public void doAction() {
    }

    public BoundingBox calculateRange(int level) {
        return null;
    }

    public void talk() {
    }

    public void load() {
    }

    public void unload() {
    }

    public boolean calculateMultiplySuccess() {
        return false;
    }

    private boolean calculateEXPDropSuccess() {
        return false;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public boolean isLoading() {
        return isLoading;
    }

    public void setLoading(boolean isLoading) {
        this.isLoading = isLoading;
    }

    public UUID getOwnerUUID() {
        return ownerUUID;
    }

    public boolean hasChestLinked() {
        return (getChestWorld() != null && !getChestWorld().equalsIgnoreCase("null"));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public String getIdentifier() {
        return "none";
    }

    public double getChestX() {
        return chestX;
    }

    public void setChestX(double chestX) {
        this.chestX = chestX;
    }

    public double getChestY() {
        return chestY;
    }

    public void setChestY(double chestY) {
        this.chestY = chestY;
    }

    public double getChestZ() {
        return chestZ;
    }

    public void setChestZ(double chestZ) {
        this.chestZ = chestZ;
    }

    public String getChestWorld() {
        return chestWorld;
    }

    public void setChestWorld(String chestWorld) {
        this.chestWorld = chestWorld;
    }

    public double getMultiplyChance() {
        return multiplyChance;
    }

    public void setMultiplyChance(double multiplyChance) {
        this.multiplyChance = multiplyChance;
    }

    public double getExpChance() {
        return expChance;
    }

    public void setExpChance(double expChance) {
        this.expChance = expChance;
    }

    public boolean isCanSmelt() {
        return canSmelt;
    }

    public boolean isCanConvertIntoBlocks() {
        return canConvertIntoBlocks;
    }

    public boolean isCanSort() {
        return canSort;
    }

    public boolean isCanTakeItems() {
        return canTakeItems;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public ArrayList<String> getIgnores() {
        return ignores;
    }

    public BoundingBox getRange() {
        return range;
    }

    public void setRange(BoundingBox range) {
        this.range = range;
    }

    public int getHunger() {
        return hunger;
    }

    public MinionInventory getMinionInventory() {
        return minionInventory;
    }

    public boolean getCanPickUp() {
        return canPickUp;
    }

    public boolean isBlacklist() {
        return blacklist;
    }

    public boolean isTalkEnabled() {
        return false;
    }

    public void setOwnerUUID(UUID ownerUUID) {
        this.ownerUUID = ownerUUID;
    }

    public MinionFace getMinionFace() {
        return minionFace;
    }

    public void setMinionFace(MinionFace minionFace) {
        this.minionFace = minionFace;
    }

    public void setMinionInventory(MinionInventory minionInventory) {
        this.minionInventory = minionInventory;
    }

    public void setIgnores(ArrayList<String> ignores) {
        this.ignores = ignores;
    }

    public void setCanSmelt(boolean canSmelt) {
        this.canSmelt = canSmelt;
    }

    public void setCanConvertIntoBlocks(boolean canConvertIntoBlocks) {
        this.canConvertIntoBlocks = canConvertIntoBlocks;
    }

    public void setCanSort(boolean canSort) {
        this.canSort = canSort;
    }

    public void setCanTakeItems(boolean canTakeItems) {
        this.canTakeItems = canTakeItems;
    }

    public void setBlacklist(boolean blacklist) {
        this.blacklist = blacklist;
    }

    public boolean isCanPickUp() {
        return canPickUp;
    }

    public void setCanPickUp(boolean canPickUp) {
        this.canPickUp = canPickUp;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public MinionStand getMinionStand() {
        return minionStand;
    }

    public MinionTaskManager getTaskManager() {
        return taskManager;
    }

    public MinionHologram getMinionHologram() {
        return minionHologram;
    }

    public MinionSettings getMinionSettings() {
        return minionSettings;
    }

    public boolean isTalking() {
        return isTalking;
    }

}