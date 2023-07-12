package me.waterarchery.litminions.cache.minions.types;

import me.waterarchery.litminions.cache.minions.Minion;
import me.waterarchery.litminions.utils.MinionFace;

import java.util.UUID;

public class SlayerMinion extends Minion {

    public SlayerMinion(UUID ownerUUID, double x, double y, double z, String world, MinionFace minionFace, double chestX, double chestY, double chestZ, String chestWorld, int stat, int level, int hunger) {
        super(ownerUUID, x, y, z, world, minionFace, chestX, chestY, chestZ, chestWorld, stat, level, hunger);
    }
}
