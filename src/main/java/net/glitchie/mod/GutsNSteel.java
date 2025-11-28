package net.glitchie.mod;

import net.fabricmc.api.ModInitializer;

import net.glitchie.mod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GutsNSteel implements ModInitializer {
	public static final String MOD_ID = "guts-n-steel";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}