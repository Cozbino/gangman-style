package com.example.gangmanstyle;

import com.google.common.collect.ImmutableList;
import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.util.Text;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@PluginDescriptor(
		name = "Gangman Style",
		description = "Makes all characters around you do the Gangman Style emote",
		tags = {"emote", "fun", "dance"}
)
public class gangmanstylePlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private gangmanstyleConfig config;

	private static int forceDanceTick = 0;

	@Provides
	gangmanstyleConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(gangmanstyleConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		// Plugin start-up logic here
	}

	@Override
	protected void shutDown() throws Exception
	{
		// Plugin shut-down logic here
	}
	@Subscribe
	public void onGameTick(GameTick event)
	{
		for (Player player : client.getPlayers())
		{
			if (player.getWorldLocation().distanceTo(client.getLocalPlayer().getWorldLocation()) < config.radius())
			{
				//if (player.getAnimation() != -1)
			//{
					player.setAnimation(7537); // Replace 9999 with the actual animation ID for Gangman Style
					player.setActionFrame(0);
			}//}
		}
	}
}
