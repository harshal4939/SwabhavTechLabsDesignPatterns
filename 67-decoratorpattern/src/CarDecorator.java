
public abstract class CarDecorator implements ICarService{
	ICarService carobj;
	CarDecorator(ICarService carobj){
		this.carobj=carobj;
	}
	public double getCost(){
		return carobj.getCost();
	}
	public String getServiceDetails() {
		// TODO Auto-generated method stub
		return null;
	}
}
