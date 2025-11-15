package net.oskar.oskarsmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.oskar.oskarsmod.block.ModBlocks;
import net.oskar.oskarsmod.item.ModItemGroups;
import net.oskar.oskarsmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OskarsMod implements ModInitializer {
	public static final String MOD_ID = "oskars-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 1600);

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}