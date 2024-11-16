
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dinzeer.legendblade.init;


import com.dinzeer.legendblade.regsitry.creativetab.ItemTab;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.Rarity;

import net.minecraft.world.item.Item;


import java.util.function.BiFunction;
import java.util.function.Supplier;

import static com.dinzeer.legendblade.Legendblade.REGISTRATE;

public class LBModItems {
//	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

	public static final ItemEntry<Item> slightlyred_tachi;
	public static final ItemEntry<Item> iron_tachi;
	public static final ItemEntry<Item> lightred_tachi;
	public static final ItemEntry<Item> red_tachi;
	public static final ItemEntry<Item> sored_tachi;
	public static final ItemEntry<Item> blood_tachi;
	public static final ItemEntry<Item> crimsonjadeofuda;
	public static final ItemEntry<Item> jadeofuda;
	public static final ItemEntry<Item> lightpinkjadeofuda;
	public static final ItemEntry<Item> pinkjadeofuda;
	public static final ItemEntry<Item> redjadeofuda;
	public static final ItemEntry<Item> scarletjadeofuda;
	public static final ItemEntry<Item> tearfluorite;
    static {

		slightlyred_tachi = iteminit("slightlyred_tachi");
		iron_tachi = iteminit("iron_tachi");
		lightred_tachi= iteminit("lightred_tachi");
		red_tachi = iteminit("red_tachi");
		sored_tachi = iteminit("sored_tachi");
		blood_tachi = iteminit("blood_tachi");
		crimsonjadeofuda = iteminit("crimsonjadeofuda");
		jadeofuda=iteminit("jadeofuda");
		lightpinkjadeofuda=iteminit("lightpinkjadeofuda");
		pinkjadeofuda=iteminit("pinkjadeofuda");
		redjadeofuda=iteminit("redjadeofuda");
		scarletjadeofuda=iteminit("scarletjadeofuda");
		tearfluorite=iteminit("tearfluorite");


}



//	public static final RegistryObject<Item> UNREDTACHI = regmaker("unred_tachi");
//	public static final RegistryObject<Item> IRONTACHI = regmaker("iron_tachi");
//	public static final RegistryObject<Item> NREDTACHI = regmaker("nred_tachi");
//	public static final RegistryObject<Item> REDTACHI = regmaker("red_tachi");
//	public static final RegistryObject<Item> SOREDTACHI = regmaker("sored_tachi");
//	public static final RegistryObject<Item> SOSOREDTACHI = regmaker("sosored_tachi");
//	public static final RegistryObject<Item> crimsonjadeofuda = regmaker("cfuda");
//	public static final RegistryObject<Item> jadeofuda = regmaker("jadefuda");
//	public static final RegistryObject<Item> lightpinkjadeofuda = regmaker("lightfuda");
//	public static final RegistryObject<Item> pinkjadeofuda = regmaker("pinkfuda");
//	public static final RegistryObject<Item> redjadeofuda= regmaker("redfuda");
//	public static final RegistryObject<Item> scarletjadeofuda= regmaker("scarletjadeofuda");
//	public static final RegistryObject<Item> tearfluorite= regmaker("tearfluorite");















	public static ItemEntry<Item> iteminit(String name){
            return REGISTRATE.item(
                    name, Item::new
            ).defaultModel().defaultLang().tab(ItemTab.LBITEM.getKey()).register();


    }



	public static void register() {
	}






}
