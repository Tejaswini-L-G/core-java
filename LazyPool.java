
class LazyPool {

    int poolId;
    String poolName;
    String waterType;
    int depth;
    String attraction;
	
	 public LazyPool() {}

    public LazyPool(int poolId, String poolName, String waterType, int depth, String attraction) {
        this.poolId = poolId;
        this.poolName = poolName;
        this.waterType = waterType;
        this.depth = depth;
        this.attraction = attraction;
    }

    public void getLazyPoolDetails(){

        System.out.println("Pool Id: " + this.poolId);
        System.out.println("Pool Name: " + this.poolName);
        System.out.println("Water Type: " + this.waterType);
        System.out.println("Depth: " + this.depth);
        System.out.println("Attraction: " + this.attraction);
    }
}
