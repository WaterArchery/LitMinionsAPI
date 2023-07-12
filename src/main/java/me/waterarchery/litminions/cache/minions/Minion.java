package me.waterarchery.litminions.cache.minions;

import me.waterarchery.litminions.utils.MinionFace;
import me.waterarchery.litminions.utils.MinionInventory;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.EulerAngle;

import java.util.*;

public class Minion {

    public UUID ownerUUID;
    public short animStatus;
    double x;
    double y;
    double z;
    double chestX;
    double chestY;
    double chestZ;
    String world;
    String chestWorld;
    public ArmorStand armorStand;
    public MinionFace minionFace;
    public String base64Head;
    int stat;
    int level;
    public int actionPerTick;
    public int movePerTick;
    public int talkPerTick;
    public double multiplyChance;
    public double expChance;
    public MinionInventory minionInventory;
    public ArrayList<String> ignores = new ArrayList<>();
    public boolean canSmelt;
    public boolean canConvertIntoBlocks;
    boolean canSort;
    boolean canTakeItems;
    public BukkitTask actionTask;
    public BukkitTask moveTask;
    public BukkitTask talkTask;
    public ArmorStand hologram;
    int exp = 0;
    protected BoundingBox range = null;
    String name;
    ItemStack helmet;
    int hunger;
    boolean blacklist;
    private boolean canPickUp;
    private String ownerName;

    public Minion(UUID ownerUUID, double x, double y, double z, String world, MinionFace minionFace,
                  double chestX, double chestY, double chestZ, String chestWorld, int stat, int level, int hunger) {

    }

    public void createIgnores() {

    }

    public void assignTickAction(String id) {

    }

    private void startPickUpTask() {
    }

    public int getStartTick() {
        return 1;
    }

    public void pickUp(Player p) {
    }


    public String getOwnerName() {
        return "";
    }

    public void addItems(Collection<ItemStack> drops) {

    }

    public void dropItems(ItemStack drop) {
    }

    public HashMap<Integer, ItemStack> addItemToChest(Collection<ItemStack> drops) {
        return new HashMap<>();
    }

    public void addExp(String key) {

    }

    public String getMinionUUID() {
        return "";
    }

    public boolean isLoaded(){
        return false;
    }

    public Location getLocation() {
        return null;
    }

    public void setChest(Block block) {
    }

    public void removeChest(){
    }

    public void assignArmorStand() {
    }

    public void placeOrUpdateArmorStand(boolean checkFirst){
    }

    private void clearNearbyArmorStands() {

    }

    private void clearNearbyHolograms() {
    }

    public void setArmor(ItemStack hat, ItemStack chestplate, ItemStack leggings, ItemStack boots) {
    }

    public void setSkinArmor(String skinPath) {
    }

    private ItemStack assignColor(ItemStack itemStack, String colorStr) {
        return null;
    }

    public void rotateMinion() {
    }

    private float minionFaceToYaw(MinionFace minionFace) {
        return 0.0F;
    }

    public void moveArm(){

    }

    public int getAmount(){
        return 1;
    }

    public int getAmount1(){
        return 1;
    }

    public boolean isOnlineCheck() {
        return true;
    }

    public void upgrade() {

    }

    private EulerAngle rightHandMove() {
        return new EulerAngle(5.0,0,0);
    }

    public void setName(String name) {
    }

    public int getStat() { return stat; }
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
        return name;
    }

    public void setSkull(ItemStack itemStack){

    }

    public void onDisableTask() {}
    public void onRepeatTask() {}
    public void onStartTask() {
        setRange(calculateRange(this.getLevel()));
    }

    public BoundingBox calculateRange(int level) {
        return null;
    }

    public void talk() {
    }

    public void assignHologram() {

    }


    private void createHologram() {
    }

    public ArmorStand getHologram () { return hologram; }

    public UUID getOwnerUUID() {
        return ownerUUID;
    }

    public short getAnimStatus() {
        return animStatus;
    }

    public void setAnimStatus(short animStatus) {
        this.animStatus = animStatus;
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

    public ArmorStand getArmorStand() {
        return armorStand;
    }

    public void setArmorStand(ArmorStand armorStand) {
        if (armorStand != null) {
            this.name = armorStand.getName();
        }
        this.armorStand = armorStand;
    }

    public void setHologram(ArmorStand armorStand) {
        this.hologram = armorStand;
    }

    public String getIdentifier(){
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

    public int getActionPerTick() {
        return actionPerTick;
    }

    public void setActionPerTick(int actionPerTick) {
        this.actionPerTick = actionPerTick;
    }

    public int getMovePerTick() {
        return movePerTick;
    }

    public void setMovePerTick(int movePerTick) {
        this.movePerTick = movePerTick;
    }

    public MinionInventory getMinionInventory() { return minionInventory; }
    public int getTalkPerTick() {
        return talkPerTick;
    }

    public void setTalkPerTick(int talkPerTick) {
        this.talkPerTick = talkPerTick;
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

    public BukkitTask getActionTask() {
        return actionTask;
    }

    public void setActionTask(BukkitTask actionTask) {
        this.actionTask = actionTask;
    }

    public BukkitTask getMoveTask() {
        return moveTask;
    }

    public void setMoveTask(BukkitTask moveTask) {
        this.moveTask = moveTask;
    }

    public BukkitTask getTalkTask() {
        return talkTask;
    }

    public void setTalkTask(BukkitTask talkTask) {
        this.talkTask = talkTask;
    }

    public int getExp() { return exp; }
    public void setExp(int exp) { this.exp = exp; }

    public ArrayList<String> getIgnores() { return ignores; }

    public BoundingBox getRange() {
        return range;
    }

    public void setRange(BoundingBox range) {
        this.range = range;
    }

    public int getHunger() {
        return hunger;
    }

    int defaultHunger = -999;

    public void setHunger(int hunger) {

    }

    public void addHunger(int hunger) {
    }

    public boolean getCanPickUp() {
        return canPickUp;
    }

    public boolean isBlacklist() { return blacklist; }

    public boolean isTalkEnabled() {
        return true;
    }

    public void cancelTalkTask() {
    }

}
