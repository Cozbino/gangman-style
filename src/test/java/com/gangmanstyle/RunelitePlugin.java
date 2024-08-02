package com.example.gangmanstyle;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class RunelitePlugin
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(gangmanstylePlugin.class);
		RuneLite.main(args);
	}
}
