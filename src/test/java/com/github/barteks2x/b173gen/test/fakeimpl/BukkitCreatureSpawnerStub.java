package com.github.barteks2x.b173gen.test.fakeimpl;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.EntityType;
import org.bukkit.material.MaterialData;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

import java.util.List;

class BukkitCreatureSpawnerStub implements CreatureSpawner {
    private EntityType creatureType;

    @Override
    public void setCreatureTypeByName(String creatureTypeName) {
        this.creatureType = EntityType.fromName(creatureTypeName);
    }

    @Override
    public void setCreatureTypeId(String creatureTypeId) {
        this.creatureType = EntityType.fromName(creatureTypeId);
    }

    @Override
    public String getCreatureTypeName() {
        return creatureType == null ? null : creatureType.getName();
    }

    @Override
    public String getCreatureTypeId() {
        return creatureType == null ? null : creatureType.getName();
    }

    @Override
    public CreatureType getCreatureType() {
        if (creatureType == null) {
            return null;
        }
        try {
            return CreatureType.valueOf(creatureType.name());
        } catch (IllegalArgumentException ex) {
            return null;
        }
    }

    @Override
    public void setCreatureType(CreatureType creatureType) {
        this.creatureType = creatureType == null ? null : EntityType.fromName(creatureType.getName());
    }

    @Override
    public EntityType getSpawnedType() {
        return this.creatureType;
    }

    @Override
    public void setSpawnedType(EntityType entityType) {
        this.creatureType = entityType;
    }

    @Override
    public int getDelay() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setDelay(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Block getBlock() {
        throw new UnsupportedOperationException();
    }

    @Override
    public MaterialData getData() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Material getType() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getTypeId() {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte getLightLevel() {
        throw new UnsupportedOperationException();
    }

    @Override
    public World getWorld() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getX() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getY() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getZ() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Location getLocation() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Location getLocation(Location location) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Chunk getChunk() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setData(MaterialData materialData) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setType(Material material) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean setTypeId(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean update() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean update(boolean b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean update(boolean b, boolean b1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte getRawData() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRawData(byte b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isPlaced() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setMetadata(String s, MetadataValue metadataValue) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<MetadataValue> getMetadata(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasMetadata(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeMetadata(String s, Plugin plugin) {
        throw new UnsupportedOperationException();
    }
}
