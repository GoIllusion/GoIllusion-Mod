package com.gameofillusion.goillusion.init;

import java.util.ArrayList;
import java.util.List;

import com.gameofillusion.goillusion.objects.items.ItemBase;
import com.gameofillusion.goillusion.util.Constants;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	
public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
    public static final ToolMaterial MAXIMUM_IRON = EnumHelper.addToolMaterial("reinforced_iron", 2, 1550, 5.0F, 1.5F, 5);
	public static final ToolMaterial REINFORCED_IRON = EnumHelper.addToolMaterial("reinforced_iron", 2, 1000, 5.0F, 1.5F, 5);
	public static final ToolMaterial UPGRADED_IRON = EnumHelper.addToolMaterial("upgraded_iron", 2, 500, 5.0F, 1.5F, 5);
	public static final ArmorMaterial ARMOUR_COPPER = EnumHelper.addArmorMaterial("armour_copper", Constants.MOD_ID + ":copper", 13, new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	//ITEMS
	public static final Item IRON_STICK = new ItemBase("iron_stick");
}
