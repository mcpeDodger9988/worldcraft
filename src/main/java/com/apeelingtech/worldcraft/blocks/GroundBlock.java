package com.apeelingtech.worldcraft.blocks;

import com.apeelingtech.worldcraft.graphics.Sprite;
import com.apeelingtech.worldcraft.level.Level;

public class GroundBlock extends Block {
	private static final long serialVersionUID = 1L;
	
	public GroundBlock(Sprite sprite, int x, int y, Level level, int chunk) {
		super(sprite, true, x, y, level, chunk);
	}
	
}
