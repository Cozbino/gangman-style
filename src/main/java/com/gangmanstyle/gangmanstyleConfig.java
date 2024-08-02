package com.example.gangmanstyle;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("gangmanstyle")
public interface gangmanstyleConfig extends Config
{
	@ConfigItem(
			keyName = "radius",
			name = "Effect Radius",
			description = "The radius around the player within which other characters will perform the emote"
	)
	default int radius()
	{
		return 10;
	}
}
