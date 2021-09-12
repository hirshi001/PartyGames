package com.hirshi001.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.hirshi001.game.PartyGames;
import com.hirshi001.game.common.plugin.pluginsecurity.PluginManager;
import com.hirshi001.game.common.plugin.pluginsecurity.PluginSecurityManager;
import com.hirshi001.game.common.plugin.pluginsecurity.PluginSecurityPolicy;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		PluginManager manager = new PluginManager()
				.setSecurityManager(new PluginSecurityManager())
				.setSecurityPolicy(new PluginSecurityPolicy());

		new PluginApplication(new PartyGames(manager), manager, config);
	}
}
