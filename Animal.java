//package animals;
import java.util.*;
public abstract class Animal implements AnimalInterface{
	private ArrayList<Animal> acquiredAnimals;

	public ArrayList<Animal> getAcquiredAnimals() {
		return acquiredAnimals;
	}

	public void setAcquiredAnimals(ArrayList<Animal> acquiredAnimals) {
		this.acquiredAnimals = acquiredAnimals;
	}

	@Override
	public abstract void store(Animal animal);

	@Override
	public abstract long calcScore() throws InedibleException;
}
