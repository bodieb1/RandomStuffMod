package com.EBodieB.RandomStuffMod.items;

import com.EBodieB.RandomStuffMod.Main;
import com.EBodieB.RandomStuffMod.init.ModItems;
import com.EBodieB.RandomStuffMod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		Main.proxy.RegisterItemRenderer(this, 0, "inventory");
	}

}
