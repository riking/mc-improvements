package net.minecraft.server;

import java.util.List;
import java.util.Random;

public class WorldGenStrongholdStairs extends WorldGenStrongholdPiece {

    private final boolean a;
    private final WorldGenStrongholdDoorType b;

    public WorldGenStrongholdStairs(int i, Random random, int j, int k) {
        super(i);
        this.a = true;
        this.h = random.nextInt(4);
        this.b = WorldGenStrongholdDoorType.a;
        switch (this.h) {
        case 0:
        case 2:
            this.g = new StructureBoundingBox(j, 64, k, j + 5 - 1, 74, k + 5 - 1);
            break;

        default:
            this.g = new StructureBoundingBox(j, 64, k, j + 5 - 1, 74, k + 5 - 1);
        }
    }

    public WorldGenStrongholdStairs(int i, Random random, StructureBoundingBox structureboundingbox, int j) {
        super(i);
        this.a = false;
        this.h = j;
        this.b = this.a(random);
        this.g = structureboundingbox;
    }

    public void a(StructurePiece structurepiece, List list, Random random) {
        this.a((WorldGenStrongholdStairs2) structurepiece, list, random, 1, 1);
    }

    public static WorldGenStrongholdStairs a(List list, Random random, int i, int j, int k, int l, int i1) {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.a(i, j, k, -1, -7, 0, 5, 11, 5, l);

        return a(structureboundingbox) && StructurePiece.a(list, structureboundingbox) == null ? new WorldGenStrongholdStairs(i1, random, structureboundingbox, l) : null;
    }

    public boolean a(World world, Random random, StructureBoundingBox structureboundingbox) {
        if (this.a(world, structureboundingbox)) {
            return false;
        } else {
            if (this.a) {
                ;
            }

            this.a(world, structureboundingbox, 0, 0, 0, 4, 10, 4, true, random, WorldGenStrongholdPieces.b());
            this.a(world, random, structureboundingbox, this.b, 1, 7, 0);
            this.a(world, random, structureboundingbox, WorldGenStrongholdDoorType.a, 1, 1, 4);
            this.a(world, Block.SMOOTH_BRICK.id, 0, 2, 6, 1, structureboundingbox);
            this.a(world, Block.SMOOTH_BRICK.id, 0, 1, 5, 1, structureboundingbox);
            this.a(world, Block.STEP.id, 0, 1, 6, 1, structureboundingbox);
            this.a(world, Block.SMOOTH_BRICK.id, 0, 1, 5, 2, structureboundingbox);
            this.a(world, Block.SMOOTH_BRICK.id, 0, 1, 4, 3, structureboundingbox);
            this.a(world, Block.STEP.id, 0, 1, 5, 3, structureboundingbox);
            this.a(world, Block.SMOOTH_BRICK.id, 0, 2, 4, 3, structureboundingbox);
            this.a(world, Block.SMOOTH_BRICK.id, 0, 3, 3, 3, structureboundingbox);
            this.a(world, Block.STEP.id, 0, 3, 4, 3, structureboundingbox);
            this.a(world, Block.SMOOTH_BRICK.id, 0, 3, 3, 2, structureboundingbox);
            this.a(world, Block.SMOOTH_BRICK.id, 0, 3, 2, 1, structureboundingbox);
            this.a(world, Block.STEP.id, 0, 3, 3, 1, structureboundingbox);
            this.a(world, Block.SMOOTH_BRICK.id, 0, 2, 2, 1, structureboundingbox);
            this.a(world, Block.SMOOTH_BRICK.id, 0, 1, 1, 1, structureboundingbox);
            this.a(world, Block.STEP.id, 0, 1, 2, 1, structureboundingbox);
            this.a(world, Block.SMOOTH_BRICK.id, 0, 1, 1, 2, structureboundingbox);
            this.a(world, Block.STEP.id, 0, 1, 1, 3, structureboundingbox);
            return true;
        }
    }
}