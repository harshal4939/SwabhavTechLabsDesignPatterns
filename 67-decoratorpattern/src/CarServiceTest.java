public class CarServiceTest {

	public static void main(String[] args) {

		CarService car = new CarService();
		OilChange carOil = new OilChange(car);
		carOil.getServiceDetails();
		carOil.getCost();

		WheelAlignment wheel = new WheelAlignment(carOil);

		System.out.println(wheel.getCost());
		System.out.println(wheel.getServiceDetails());

	}
}
