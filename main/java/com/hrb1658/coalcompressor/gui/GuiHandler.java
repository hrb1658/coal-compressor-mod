package com.hrb1658.coalcompressor.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.hrb1658.coalcompressor.blocks.TileEntityCoalCompressor;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
		
		switch (ID) {
		case 0:
			return new ContainerCoalCompressor((TileEntityCoalCompressor)te, player);
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
		switch (ID) {
		case 0:
			return new GuiCoalCompressor((TileEntityCoalCompressor)te, player);
		}
		return null;
	}

}
