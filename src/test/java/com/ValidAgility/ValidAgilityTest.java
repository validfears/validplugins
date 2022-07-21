package com.ValidAgility;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ValidAgilityTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ValidAgilityPlugin.class);
		RuneLite.main(args);
	}
}