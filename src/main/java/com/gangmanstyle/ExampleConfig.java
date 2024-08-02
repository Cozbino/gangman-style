package com.gangmanstyle;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("gangman style")
public interface ExampleConfig extends Config
{
	@ConfigItem(
		keyName = "oop gangman style oop oop",
		name = "Welcome Greeting",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Hello";
	}
}
