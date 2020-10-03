package com.emeraldodin.GhosterOrebarkMod.classes;

import com.emeraldodin.GhosterOrebarkMod.GhosterOrebarkMod;
import com.emeraldodin.GhosterOrebarkMod.lists.ItemList;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = GhosterOrebarkMod.NAME, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemClass {
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                ItemList.ghosters_flesh = (new SwordItem(GhostersFleshTier.MOD_TIER, 9, -1.2f, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("ghosters_flesh"))
        );
    }

    public enum GhostersFleshTier implements IItemTier {
        MOD_TIER(4, 666666,20, 66, 69, () -> {
            return Ingredient.fromItems(Items.OAK_LOG);
        });

        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int harvestLevel;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

        GhostersFleshTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.attackDamage = attackDamage;
            this.efficiency = efficiency;
            this.enchantability = enchantability;
            this.repairMaterial = new LazyValue<>(repairMaterial);
        }

        @Override
        public int getMaxUses() {
            return this.maxUses;
        }

        @Override
        public float getEfficiency() {
            return this.efficiency;
        }

        @Override
        public float getAttackDamage() {
            return this.attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return this.harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }
    }
}
