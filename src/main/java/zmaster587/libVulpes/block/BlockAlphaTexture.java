package zmaster587.libVulpes.block;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.ParametersAreNonnullByDefault;

public class BlockAlphaTexture extends AbstractGlassBlock {

	public BlockAlphaTexture(Properties mat) {
		super(mat);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	@ParametersAreNonnullByDefault
	public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
		return false;
	}
}
