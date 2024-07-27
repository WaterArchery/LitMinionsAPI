package me.waterarchery.litminions.models;

import me.waterarchery.litminions.models.minions.Minion;
import org.bukkit.entity.ArmorStand;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.EulerAngle;

import javax.annotation.Nullable;

public class MinionStand {

    private final Minion minion;
    private ArmorStand armorStand;
    private short animStatus;
    private ItemStack helmet;
    private String base64Head;

    public MinionStand(Minion minion) {
        this.minion = minion;
    }

    public void placeOrUpdateArmorStand(boolean checkFirst) { }

    public void updateName(String oldName) { }

    public void updateHandItem() { }

    public void updateAttributes() { }

    public void assignArmorStand() { }

    public void loadArmorStand() { }

    public void clearNearbyArmorStands() { }

    public void setSkull(ItemStack itemStack) { }

    public void moveArm() { }

    private EulerAngle rightHandMove() { return null; }

    public void setArmor(ItemStack hat, ItemStack chestplate, ItemStack leggings, ItemStack boots) { }

    public void setSkinArmor(String skinPath) { }

    public ItemStack parseMinionItem(String rawMaterial) { return null; }

    private ItemStack assignColor(ItemStack itemStack, String colorStr) { return null; }

    public ArmorStand getArmorStand() {
        if (armorStand == null || !armorStand.isValid())
            loadArmorStand();
        return armorStand;
    }

    public @Nullable ArmorStand getRawArmorStand() {
        return armorStand;
    }

    public void setArmorStand(ArmorStand armorStand) {}

    public short getAnimStatus() {
        return animStatus;
    }

    public void setAnimStatus(short animStatus) {
        this.animStatus = animStatus;
    }

    public ItemStack getHelmet() {
        return helmet;
    }

    public void setHelmet(ItemStack helmet) {
        this.helmet = helmet;
    }

    public String getBase64Head() {
        return base64Head;
    }

    public void setBase64Head(String base64Head) {
        this.base64Head = base64Head;
    }

    public Minion getMinion() {
        return minion;
    }

}
