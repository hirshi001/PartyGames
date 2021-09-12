package com.hirshi001.game.common.plugin.plugins.partygame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.math.Vector;
import com.badlogic.gdx.math.Vector2;
import com.hirshi001.game.common.plugin.plugins.GamePlugin;
import com.hirshi001.game.common.plugin.plugins.partygame.ui.screens.LoadingScreen;

public class PartyGamePlugin extends Game implements GamePlugin{

    private AssetManager assetManager;

    @Override
    public void create() {
        assetManager = new AssetManager();
        setScreen(new LoadingScreen(assetManager, this));
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    @Override
    public void setScreen(Screen screen) {
        super.setScreen(screen);
    }

    @Override
    public Screen getScreen() {
        return super.getScreen();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void forceQuit() {

    }

    public AssetManager getAssetManager(){
        return assetManager;
    }
}
