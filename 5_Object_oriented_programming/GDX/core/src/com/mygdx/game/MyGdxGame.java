package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.consoleGame.Main;
import com.mygdx.game.consoleGame.unit.Arbalester;
import com.mygdx.game.consoleGame.unit.Archers;
import com.mygdx.game.consoleGame.unit.Base;
import com.mygdx.game.consoleGame.unit.Countryman;
import com.mygdx.game.consoleGame.unit.Monk;
import com.mygdx.game.consoleGame.unit.Pikerman;
import com.mygdx.game.consoleGame.unit.Robber;
import com.mygdx.game.consoleGame.unit.Sniper;
import com.mygdx.game.consoleGame.unit.Witch;

import java.util.Random;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture fon, arbalester, countryman, monk, pikerman, robber, sniper, witch;
	Music music;
	Main game;

	boolean play, clk;

	
	@Override
	public void create () {
		clk = play = true;
		game = new Main();
		game.main();
		batch = new SpriteBatch();
		fon = new Texture("fon/"+ Fons.values()[new Random().nextInt(Fons.values().length)] + ".png");
		arbalester = new Texture("pers/Arbalester.png");
		countryman = new Texture("pers/Countryman.png");
		monk = new Texture("pers/Monk.png");
		pikerman = new Texture("pers/Pikerman.png");
		robber = new Texture("pers/Robber.png");
		sniper = new Texture("pers/Sniper.png");
		witch = new Texture("pers/Witch.png");
		music = Gdx.audio.newMusic(Gdx.files.internal("music/paul-romero-rob-king-combat-theme-0"
				+ (new Random().nextInt(4) + 1) + ".mp3"));
		music.setLooping(true);
		music.setVolume(0.125f);
		music.play();
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		int kx = Gdx.graphics.getWidth()/12;
		int ky = Gdx.graphics.getHeight()/15;
		batch.begin();
		batch.draw(fon, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		for (Base base: game.teamOne) {
			if (base.die()) continue;
			if (base instanceof Arbalester) batch.draw(arbalester, base.getCoords()[1]*kx, base.getCoords()[0]*ky);
			if (base instanceof Countryman) batch.draw(countryman, base.getCoords()[1]*kx, base.getCoords()[0]*ky);
			if (base instanceof Monk) batch.draw(monk, base.getCoords()[1]*kx, base.getCoords()[0]*ky);
			if (base instanceof Pikerman) batch.draw(pikerman, base.getCoords()[1]*kx, base.getCoords()[0]*ky);
			if (base instanceof Robber) batch.draw(robber, base.getCoords()[1]*kx, base.getCoords()[0]*ky);
			if (base instanceof Sniper) batch.draw(sniper, base.getCoords()[1]*kx, base.getCoords()[0]*ky);
			if (base instanceof Witch) batch.draw(witch, base.getCoords()[1]*kx, base.getCoords()[0]*ky);
		}
		for (Base base: game.teamTwo) {
			if (base.die()) continue;
			if (base instanceof Arbalester) batch.draw(arbalester, base.getCoords()[1]*kx, base.getCoords()[0]*ky, -arbalester.getWidth(), arbalester.getHeight());
			if (base instanceof Countryman) batch.draw(countryman, base.getCoords()[1]*kx, base.getCoords()[0]*ky, -countryman.getWidth(), countryman.getHeight());
			if (base instanceof Monk) batch.draw(monk, base.getCoords()[1]*kx, base.getCoords()[0]*ky, -monk.getWidth(), monk.getHeight());
			if (base instanceof Pikerman) batch.draw(pikerman, base.getCoords()[1]*kx, base.getCoords()[0]*ky, -pikerman.getWidth(), pikerman.getHeight());
			if (base instanceof Robber) batch.draw(robber, base.getCoords()[1]*kx, base.getCoords()[0]*ky, -robber.getWidth(), robber.getHeight());
			if (base instanceof Sniper) batch.draw(sniper, base.getCoords()[1]*kx, base.getCoords()[0]*ky, -sniper.getWidth(), sniper.getHeight());
			if (base instanceof Witch) batch.draw(witch, base.getCoords()[1]*kx, base.getCoords()[0]*ky, -witch.getWidth(), witch.getHeight());
		}
		batch.end();

		if(Gdx.input.isTouched() & play & clk){
			if (!game.run()) {
				play = false;
				Gdx.graphics.setTitle("Game Over!");
				music.stop();
			}
			clk = false;
		}
		if (!Gdx.input.isTouched()) clk = true;
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		fon.dispose();
		music.dispose();
		arbalester.dispose();
		countryman.dispose();
		monk.dispose();
		pikerman.dispose();
		robber.dispose();
		sniper.dispose();
		witch.dispose();
	}
}
