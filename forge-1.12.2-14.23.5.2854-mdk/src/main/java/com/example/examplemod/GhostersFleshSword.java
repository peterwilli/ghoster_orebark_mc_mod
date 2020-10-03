package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;

public class GhostersFleshSword extends net.minecraft.item.ItemSword {
    public GhostersFleshSword() {
        super(ExampleMod.toolMaterial);

        this.setRegistryName("ghosters_flesh");
        this.setUnlocalizedName("ghosters_flesh");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
