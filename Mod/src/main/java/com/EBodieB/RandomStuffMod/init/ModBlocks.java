package com.EBodieB.RandomStuffMod.init;

import java.util.ArrayList;
import java.util.List;
import com.EBodieB.RandomStuffMod.blocks.BlockBase;
import com.EBodieB.RandomStuffMod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks {
	public static List <Block> BLOCKS = new ArrayList<Block>();
	//Blocks
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON);
	public static final Block STEEL_BLOCK = new BlockBase("steel_block", Material.IRON);
}