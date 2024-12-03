
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.dinzeer.legendblade.regsitry;


import com.dinzeer.legendblade.regsitry.creativetab.ItemTab;
import com.tterrag.registrate.util.entry.ItemEntry;

import net.minecraft.world.item.Item;


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
	public static ItemEntry<Item> acedia;
	public static ItemEntry<Item> avaritia;
	public static  ItemEntry<Item> gula;
	public static  ItemEntry<Item> invidia;
	public static  ItemEntry<Item> ira;
	public static  ItemEntry<Item> luxuria;
	public static  ItemEntry<Item> saligiaex;
	public static  ItemEntry<Item> saligiasphere;
	public static  ItemEntry<Item> superbia;



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
		acedia= iteminit("acedia");
		avaritia= iteminit("avaritia");
		gula= iteminit("gula");
		invidia= iteminit("invidia");
		ira= iteminit("ira");
		luxuria= iteminit("luxuria");
		superbia= iteminit("superbia");
		saligiaex= iteminit("saligiaex");
		saligiasphere= iteminit("saligiasphere");

}
















	public static ItemEntry<Item> iteminit(String name){
            return REGISTRATE.item(
                    name, Item::new
            ).defaultModel().defaultLang().tab(ItemTab.LBITEM.getKey()).register();


    }



	public static void register() {
	}






}
