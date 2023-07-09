

public class customers {
	private long id;
	private String name;
	private Integer tier;
	
	public customers(long id, String name, Integer tier) {
		this.id = id;
		this.name = name;
		this.tier = tier;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getTier() {
		return tier;
	}
	
	@Override
	public String toString() {
		return "Customer ID: " + id + " Name: " + name + " Tier: " + tier.toString();
	}
}