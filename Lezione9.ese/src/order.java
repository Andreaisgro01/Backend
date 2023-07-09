
import java.time.LocalDate;
import java.util.List;

public class order {
	private long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate; 
	private List<product> products;
	private customers customer;
	
	public order(long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<product> products,
			customers customer) {
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.products = products;
		this.customer = customer;
	}
	
	public long getId() {
		return id;
	}
	public String getStatus() {
		return status;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public List<product> getProducts() {
		return products;
	}
	public customers getCustomer() {
		return customer;
	}
	
	@Override
	public String toString() {
		return "Order ID: " + id + " Status: " + status + " Customer ID: " + customer.getId() + " Order Date: " + orderDate;
	}
}