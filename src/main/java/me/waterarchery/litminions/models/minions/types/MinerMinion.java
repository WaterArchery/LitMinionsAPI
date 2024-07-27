package me.waterarchery.litminions.models.minions.types;

import me.waterarchery.litminions.models.minions.Minion;
import me.waterarchery.litminions.utils.MinionFace;

import java.util.UUID;

public class MinerMinion extends Minion {

    public MinerMinion(UUID ownerUUID, double x, double y, double z, String world, MinionFace minionFace, double chestX, double chestY, double chestZ, String chestWorld, int stat, int level, int hunger) {
        super(ownerUUID, x, y, z, world, minionFace, chestX, chestY, chestZ, chestWorld, stat, level, hunger);
    }
}
