package thegrimsilence.enderclock.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import thegrimsilence.enderclock.items.armor.ArmorBase;
import thegrimsilence.enderclock.items.tools.ToolSword;
import thegrimsilence.enderclock.objects.tools.EnderClock;
import thegrimsilence.enderclock.util.Reference;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	// Materials
	public static final ToolMaterial MATERIAL_ENDER = EnumHelper.addToolMaterial("material_ender", 3, 16, 8.0F, 3.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_ENDER = EnumHelper.addArmorMaterial("armor_material_ender", Reference.MOD_ID+":ender", 14, new int[] {2,7,5,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	// Items
	public static final Item ENDER_CLOCK = new EnderClock("ender_clock");
	
	// Tools
	public static final ItemSword ENDER_SWORD = new ToolSword("ender_sword", MATERIAL_ENDER);
	
	// Armor
	public static final Item ENDER_HELMET = new ArmorBase("ender_helmet", ARMOR_MATERIAL_ENDER, 1, EntityEquipmentSlot.HEAD);
	public static final Item ENDER_CHESTPLATE = new ArmorBase("ender_chestplate", ARMOR_MATERIAL_ENDER, 1, EntityEquipmentSlot.CHEST);
	public static final Item ENDER_LEGGINGS = new ArmorBase("ender_leggings", ARMOR_MATERIAL_ENDER, 1, EntityEquipmentSlot.LEGS);
	public static final Item ENDER_BOOTS = new ArmorBase("ender_boots", ARMOR_MATERIAL_ENDER, 2, EntityEquipmentSlot.FEET);
}
