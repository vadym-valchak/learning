package learn_java;

public class Car implements Comparable<Car>{
	private String carBrand;
	private String model;
	private int pricePerDay;
	
	public Car(String carBrand, String model, int pricePerDay) {
		this.carBrand = carBrand;
		this.model = model;
		this.pricePerDay = pricePerDay;
	}
	
	public String getCarBrand() {
		return carBrand;
	}

	public String getModel() {
		return model;
	}

	public int getPricePerDay() {
		return pricePerDay;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carBrand == null) ? 0 : carBrand.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + pricePerDay;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carBrand == null) {
			if (other.carBrand != null)
				return false;
		} else if (!carBrand.equals(other.carBrand))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (pricePerDay != other.pricePerDay)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Car car) {
		if(this.pricePerDay < car.pricePerDay) {
			return -1;
		} else if(this.pricePerDay > car.pricePerDay) {
			return 1;
		}
		
		return 0;
	}
}
