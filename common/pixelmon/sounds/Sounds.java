package pixelmon.sounds;

import java.io.File;

import net.minecraft.client.Minecraft;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import pixelmon.enums.EnumPokemon;

public class Sounds {

	@SideOnly(Side.CLIENT)
	public static void installSounds() {
		for (EnumPokemon p : EnumPokemon.values()) {
			installSound("resources/newsound/pixelmon/", p.name.toLowerCase(), "newsound/pixelmon");
		}
		
		installSound("resources/newsound/pixelmon/", "anvilHits", "newsound/pixelmon");
		
	}

	@SideOnly(Side.CLIENT)
	private static void installSound(String path, String name, String newPath) {
		if (new File(path + name + ".ogg").exists())
			Minecraft.getMinecraft().installResource(newPath + name + ".ogg", new File(path + name + ".ogg"));

	}
}
